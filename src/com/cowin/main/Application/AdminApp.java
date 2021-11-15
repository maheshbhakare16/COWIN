/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;

import com.cowin.db.DBConnection;
import com.cowin.main.gui.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahesh
 */
public class AdminApp {
    Admin a;
    
    public AdminApp(Admin a)
    {
        this.a = a;
    }
    
    // ------------------------------------ ADD A VACCINE COUNT ---------------------------------
    
    public boolean addVaccine(String vaccine_name, int vaccine_count)
    {
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select total_vaccines from vaccines where vaccine_name=?;");
            ps.setString(1,vaccine_name);
            rs = ps.executeQuery();
            rs.next();
            int total = rs.getInt("total_vaccines");
            ps = con.prepareStatement("UPDATE vaccines set total_vaccines = "+total+"+? where vaccine_name=?;");
            ps.setInt(1, vaccine_count);
            ps.setString(2,vaccine_name);
            int count = ps.executeUpdate();
            
            ps = con.prepareStatement("select avail_vaccines from vaccines where vaccine_name=?;");
            ps.setString(1,vaccine_name);
            rs = ps.executeQuery();
            rs.next();
            total = rs.getInt("avail_vaccines");
            ps = con.prepareStatement("UPDATE vaccines set avail_vaccines = "+total+"+? where vaccine_name=?;");
            ps.setInt(1, vaccine_count);
            ps.setString(2,vaccine_name);
            count = ps.executeUpdate();
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
    
    // ----------------------------- VACCINATION REPORT -------------------------------
    
    public List<String[]> getVaccinationReport()
    {
        String[] s;
        List<String[]> l = null;
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * from vaccines;");
            rs = ps.executeQuery();
            l = new ArrayList<String[]>();
            int i=0;
            while(rs.next())
            {
                i++;
                int used_vaccines = rs.getInt("total_vaccines")-rs.getInt("avail_vaccines");
                s = new String[]{String.valueOf(i),rs.getString("vaccine_name"),String.valueOf(rs.getInt("avail_vaccines")),String.valueOf(used_vaccines),String.valueOf(rs.getInt("total_vaccines"))};
                l.add(s);
            } 
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
    
    // --------------------------- VERIFY USER DETAILS ---------------------------
    
    @SuppressWarnings("empty-statement")
    public List getUserData()
    {
        String[] s;
        List<String[]> l = null;
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("select first_name,last_name,aadhar_no,mobile_no,dob,user_status from users where user_status = 'NOT_VERIFIED';");
            rs = ps.executeQuery();
            l = new ArrayList<String[]>();
            int i=0;
            while(rs.next())
            {
                i++;
                s = new String[]{String.valueOf(i),rs.getString("first_name"),rs.getString("last_name"),rs.getString("aadhar_no"),rs.getString("mobile_no"),rs.getDate("dob").toString(),rs.getString("user_status")};
                l.add(s);
            } 
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return l;
    }
    
    public boolean verifyUser(String aadhar_no)
    {
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE users set user_status = 'VERIFIED' where aadhar_no=?;");
            ps.setString(1,aadhar_no);
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
    public boolean deleteUser(String aadhar_no)
    {
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE from users where aadhar_no=?");
            ps.setString(1,aadhar_no);
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
