/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowin.main.Application;

import com.cowin.db.DBConnection;
import com.cowin.main.gui.ChangePassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author mahesh
 */
public class ChangePasswordApp {
    ChangePassword p=null;
    public ChangePasswordApp(ChangePassword p)
    {
        this.p = p;
        
    }
    public boolean getOtp(String aadhar_no, String user_type)
    {
        String mobile_no=null;
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT mobile_no from users where aadhar_no = ? and user_type = ?;");
            ps.setString(1,aadhar_no);
            ps.setString(2,user_type);
            rs = ps.executeQuery();
            if(rs.next())
            {
                mobile_no=rs.getString("mobile_no");
                System.out.println(mobile_no);
            }
            
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            String apiKey = "apikey=" + "APIKEY";
            String message = "&message=" + "Your OTP is: "+generatePIN();
            String sender = "&sender=" + "COWIN-MB";
            String numbers = "&numbers="+mobile_no;    
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) 
            {
                JOptionPane.showMessageDialog(null,"message"+line);
                    //stringBuffer.append(line);
            }
            rd.close();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public String generatePIN()
    {
        int pin = (int)(Math.random()*9000)+1000;
        p.OTP=String.valueOf(pin);
        System.out.println(p.OTP);
        return String.valueOf(pin);
    }
    
    public boolean validateOTP(String otp)
    {
        if(otp.equals(p.OTP))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean changePass(String password,String aadhar_no)
    {
        try(Connection con =DBConnection.getDBConnection())
        {
            ResultSet rs=null;
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE users set password = ? where aadhar_no=?;");
            ps.setString(1,password);
            ps.setString(2,aadhar_no);
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
