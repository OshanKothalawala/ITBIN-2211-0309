/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class SignupModel {
  
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public SignupModel() {
        String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAllUsers() {
        try {
            String query = "SELECT * FROM usertable";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertUser(String firstName, String lastName, String userName, String email, String password) {
        try {
            String query = "INSERT INTO usertable (firstname, lastname, username, email, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setString(1, firstName);
            ptst.setString(2, lastName);
            ptst.setString(3, userName);
            ptst.setString(4, email);
            ptst.setString(5, password);
            ptst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        
        }
    }
    public void deleteUser(String firstName) {
        try {
            String query = "DELETE FROM usertable WHERE firstname = ?";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setString(1, firstName);
            ptst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

 

