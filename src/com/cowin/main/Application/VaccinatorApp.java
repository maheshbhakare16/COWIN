/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;

import com.cowin.db.DBConnection;
import com.cowin.main.gui.Vaccinator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahesh
 */
public class VaccinatorApp {
    
    Vaccinator v ;
    public VaccinatorApp(Vaccinator v)
    {
        this.v = v;
    }
    public boolean insertData(java.util.Date vac_date, String vac_time)
    {
        java.sql.Date sd = new java.sql.Date(vac_date.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            PreparedStatement ps = con.prepareStatement("INSERT into appointment_schedule (vaccinator, avail_date,avail_time) values(?,?,?);");
            ps.setString(1, v.user_name);
            ps.setDate(2, sd);
            ps.setString(3, vac_time);
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
    
    public ResultSet[] fetchData(String aadhar_no)
    {
        try(Connection con =DBConnection.getDBConnection())
            {
                PreparedStatement ps = con.prepareStatement("SELECT * from appointment where username = (select username from users where aadhar_no = ?) and vaccinator = ?;");
                PreparedStatement ps1 = con.prepareStatement("SELECT * from users where aadhar_no=?;");
                PreparedStatement ps2 = con.prepareStatement("SELECT * from does_details where username=(select username from users where aadhar_no = ?);");
                ps.setString(1,aadhar_no);
                ps.setString(2,v.user_name);
                ps1.setString(1,aadhar_no);
                ps2.setString(1,aadhar_no);
                ResultSet rs = ps.executeQuery();
                ResultSet rs1 = ps1.executeQuery();
                ResultSet rs2 = ps2.executeQuery();
                return new ResultSet[]{rs,rs1,rs2};
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            return null;
    }
    public List<String[]> getAppointedVaccineeData(String aadhar_no)
    {
        List<String[]> l = null;
        String[] s=null;
        String vac_name=null;
        String does1=null;
        
        try(Connection con =DBConnection.getDBConnection())
        {
            
            ResultSet rs=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
            PreparedStatement ps;
            PreparedStatement ps1;
            PreparedStatement ps2;
            
            ps = con.prepareStatement("select first_name,last_name,aadhar_no from users where aadhar_no=?;");
            ps.setString(1,aadhar_no);
            rs = ps.executeQuery();
            
            ps1 = con.prepareStatement("select appointment_date, appointment_time from appointment where vaccinee=? and vaccinator = ?;");
            ps1.setString(1,aadhar_no);
            ps1.setString(2,v.user_name);
            rs1 = ps1.executeQuery();
            
            
            ps2 = con.prepareStatement("select vaccine_name,dose1 from does_details where vaccinee=?;");
            ps2.setString(1,aadhar_no);
            rs2 = ps2.executeQuery();
            if(rs2.isBeforeFirst())
            {
                rs2.next();
                vac_name = rs2.getString("vaccine_name");
                does1= rs2.getDate("dose1").toString();
            }
            else
            {
                vac_name = "NOT AVAILABLE";
                does1= "NOT AVAILABLE";
            }
            
            l = new ArrayList<String[]>();
            int i=0;
            while(rs.next()&&rs1.next())
            {
                i++;
                s = new String[]{String.valueOf(i),rs.getString("first_name"),rs.getString("last_name"),rs.getString("aadhar_no"),rs1.getString("appointment_date"),rs1.getString("appointment_time"),vac_name,does1};
                l.add(s);
            } 
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
    
    public boolean setVaccinatedReport(String vaccine_name, String vaccinee,String does1,String date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date ud = null;
        try 
        {
            ud = sdf.parse(date);
        } 
        catch (ParseException ex) 
        {
            ex.printStackTrace();
        }
        java.sql.Date sd = new java.sql.Date(ud.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            if(does1.equals("NOT AVAILABLE"))
            {
                ps = con.prepareStatement("insert into does_details (vaccinee,vaccine_name,dose1) values(?,?,?);");
                ps.setString(1,vaccinee);
                ps.setString(2,vaccine_name);
                ps.setDate(3,sd);
                int count = ps.executeUpdate();
                if(count > 0)
                {
                    
                }
            }
            else
            {
                ps = con.prepareStatement("UPDATE does_details set dose2 = ? where vaccinee = ?;");
                ps.setDate(1,sd);
                ps.setString(2,vaccinee);
                int count = ps.executeUpdate();
                if(count > 0)
                {
                    
                }
            }
            ps = con.prepareStatement("delete from appointment where vaccinee=?;");
            ps.setString(1,vaccinee);
            int count = ps.executeUpdate();
            if(count > 0)
            {
                if(updateVaccineTable(vaccine_name))
                {
                    return true;
                }
            }
            
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateVaccineTable(String vaccine_name)
    {
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            
            ps = con.prepareStatement("select avail_vaccines from vaccines where vaccine_name=?;");
            ps.setString(1,vaccine_name);
            rs = ps.executeQuery();
            rs.next();
            int total = rs.getInt("avail_vaccines");
            ps = con.prepareStatement("UPDATE vaccines set avail_vaccines = "+total+"-? where vaccine_name=?;");
            ps.setInt(1, 1);
            ps.setString(2,vaccine_name);
            int count = ps.executeUpdate();
            if(count > 0)
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
    
}
