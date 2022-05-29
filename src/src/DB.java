package src;

import java.sql.*;

public class DB {
static Connection con = null;
  
    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem", "sadeepani", "chamodasadeepani");
            
            
        } catch (Exception e) {
            System.out.println(e);
            return null;  
        }
         
           return con; 
    }

    

    

}
