/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;
import com.cowin.db.DBConnection;
import com.cowin.main.gui.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author mahesh
 */
public class LoginApp {
    Login lgui=null;
    public LoginApp()
    {
    }
    public LoginApp(Login l)
    {
        lgui = l;
    }
    public boolean checkLoginCredentials(String aadhar, String pass)
    {
         try(Connection con =DBConnection.getDBConnection())
            {
                PreparedStatement ps = con.prepareStatement("SELECT count(aadhar_no) as count from users where aadhar_no = ? and password = ? and user_status = 'VERIFIED';");
                ps.setString(1,aadhar);
                ps.setString(2,pass);
                ResultSet rs = ps.executeQuery();
                rs.next();
                if(rs.getInt("count") == 1)
                {
                    lgui.user_name = aadhar;
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
