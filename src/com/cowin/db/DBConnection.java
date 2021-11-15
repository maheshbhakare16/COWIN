package com.cowin.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
public class DBConnection 
{
    
    public DBConnection()
    {
        
    }
    public static Connection getDBConnection()
    {
        try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/cowin","mahesh","mahesh12@");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
