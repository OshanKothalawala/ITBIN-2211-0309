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

/**
 *
 * @author User
 */
public class BookModel {
  
    private static final String URL = "jdbc:mysql://localhost:3306/librarymanagementsystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static ResultSet retrieveBookDetails(String bookName) {
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // SQL query to retrieve book details based on book name
            String query = "SELECT * FROM booktable WHERE name = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, bookName);

            // Execute the query
            ResultSet rs = statement.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

   