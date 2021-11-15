/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;

import com.cowin.db.DBConnection;
import com.cowin.main.gui.Vaccinee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahesh
 */
public class VaccineeApp {
    Vaccinee v;
    public VaccineeApp(Vaccinee v)
    {
        this.v = v;
    }
    public boolean setAppointedData(java.util.Date vac_date,String vac_time, String vaccinator_name)
    {
        java.sql.Date sd = new java.sql.Date(vac_date.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            String[] s = vaccinator_name.split(" ");
            String vaccinator=null;
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select aadhar_no from users where first_name=? and last_name=?;");
            ps.setString(1, s[0]);
            ps.setString(2, s[1]);
            rs = ps.executeQuery();
            if(rs.next())
            {
               vaccinator =  rs.getString("aadhar_no");
            } 
            
//  ---------------------------------------------------------------------------------------------------------------------------------
            
            ps = con.prepareStatement("INSERT into appointment (vaccinee,appointment_date,appointment_time,vaccinator) values(?,?,?,?);");
            ps.setString(1, v.user_name);
            ps.setDate(2, sd);
            ps.setString(3, vac_time);
            ps.setString(4, vaccinator);
            int count = ps.executeUpdate();
            if(count >0)
            {
                return true;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public List<String> getVaccinationDetails()
    {
        
        List<String> l=new ArrayList<String>();
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select first_name,last_name from users where aadhar_no=?;");
            ps.setString(1, v.user_name);
            
            rs = ps.executeQuery();
            while(rs.next())
            {
                l.add(rs.getString("first_name")+" "+rs.getString("last_name"));
                l.add(v.user_name);
            }
            ps = con.prepareStatement("select vaccine_name,dose1,dose2 from does_details where vaccinee=?;");
            ps.setString(1, v.user_name);
            rs = ps.executeQuery();
            if(rs.next())
            {
                l.add(rs.getString("vaccine_name")+" "+rs.getDate("dose1").toString());
                
                try{
                    l.add(rs.getString("vaccine_name")+" "+rs.getDate("dose2").toString());
                }
                catch(Exception e)
                {
                    l.add(rs.getString("vaccine_name")+" "+"Not Vaccinated");
                }
            }
            else
            {
                l.add("");
                l.add("");
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
    
    
    
    
    
    public List<String> getSlot(java.util.Date get_date)
    {
        List<String> l = null;
        java.sql.Date sd = new java.sql.Date(get_date.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select avail_time from appointment_schedule where avail_date = ?;");
            ps.setDate(1, sd);
            
            rs = ps.executeQuery();
            l = new ArrayList<String>();
            while(rs.next())
            {
                l.add(rs.getString("avail_time"));
            } 
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
    public List<String> getVaccinator(java.util.Date get_date, String get_slot)
    {
        List<String> l = null;
        java.sql.Date sd = new java.sql.Date(get_date.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select first_name,last_name from users where aadhar_no = (select vaccinator from appointment_schedule where avail_date = ? and avail_time=?);");
            ps.setDate(1, sd);
            ps.setString(2, get_slot);
            rs = ps.executeQuery();
            l = new ArrayList<String>();
            while(rs.next())
            {
                l.add(rs.getString("first_name")+" "+rs.getString("last_name"));
            } 
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
}
