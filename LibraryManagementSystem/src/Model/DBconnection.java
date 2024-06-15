package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class DBconnection {
    
    static Connection conn;
 static Statement stat = null;
 
 public static Statement getStatementConnection() {
 try {
//Establish the connection
 String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
 conn = DriverManager.getConnection(url, "root", "");
//Create the connection
 stat = conn.createStatement();
 
 } catch (Exception e) {
 e.printStackTrace();
 }
 return stat;
 }
 //Close the connection
public static void closeCon() throws SQLException {
 conn.close();
 }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

