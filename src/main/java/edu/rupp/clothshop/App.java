package edu.rupp.clothshop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 String jdbcUrl = "jdbc:mysql://localhost:3306/cloth_sys?useSSL=false";
         String user = "root";
         String password = "";
         try {
         	Connection con = DriverManager.getConnection(jdbcUrl, user, password);
         	System.out.println("Success");
         }catch (Exception e) {
 			// TODO: handle exception
         	e.printStackTrace();
 		}
    }
}
