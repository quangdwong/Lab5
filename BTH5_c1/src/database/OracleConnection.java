/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*; 

/**
 *
 * @author QuangDuong
 */
public class OracleConnection {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost"; 
        String sid = "orcl"; 
        String userName = "c##javalab5"; 
        String password = "userpass"; 
        
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid; 
        
        return DriverManager.getConnection(connectionURL, userName, password); 
    }
}