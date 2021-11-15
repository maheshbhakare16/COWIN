/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;

import com.cowin.db.DBConnection;
import com.cowin.main.gui.Signup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mahesh
 */
public class SignupApp {
    Signup signup_gui=null;
    public SignupApp(Signup s)
    {
        signup_gui = s;
    }
    
    public boolean insertData(String fname,String lname,String address,String aadhar_no,String mobile_no,String password, java.util.Date dob,String utype)
    {
        java.sql.Date sd = new java.sql.Date(dob.getTime());
        try(Connection con =DBConnection.getDBConnection())
        {
            PreparedStatement ps = con.prepareStatement("INSERT into users (first_name,last_name,address,aadhar_no,mobile_no,user_type,password,dob) values(?,?,?,?,?,?,?,?);");
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, address);
            ps.setString(4, aadhar_no);
            ps.setString(5, mobile_no);
            ps.setString(6, utype);
            ps.setString(7, password);
            ps.setDate(8,sd);
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
}
