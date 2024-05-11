package com.wecare.assets.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    public static Connection getConnectionTo_SystemDB() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_lab_management_system?autoReconnect=true&useSSL=false",
                "root",
                "");
    }
    
    public static Connection getConnectionTo_LocationDB() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_locations?autoReconnect=true&useSSL=false",
                "root",
                "");
    }
}
