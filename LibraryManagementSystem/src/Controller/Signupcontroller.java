/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Signupcontroller {
    public static boolean addSign(String userid, String firstname, String lastname, String username, String email, String password) {
        try {
            Connection con = DBconnection.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usertable (userid, firstname, lastname, username, email, password) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, userid);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, username);
            ps.setString(5, email);
             ps.setString(6, password);
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "User signup successfully");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to signup User");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

  
 
    public static boolean deleteuser(int userid) {
   try {
            Connection con = DBconnection.getCon();
            PreparedStatement ps = con.prepareStatement("DELETE FROM usertable WHERE userid = ?");
            ps.setInt(1, userid);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
}
}
    
    public static boolean updateuser(String userid, String firstname, String lastname, String username, String email, String password) {
       try {
            Connection con = DBconnection.getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE usertable SET userid=?, firstname=?, lastname=?, email=?, username=?, password=? WHERE userid=?");
            ps.setString(1, userid);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, username);
            ps.setString(5, email);
             ps.setString(6, password);
            int rowsAffected = ps.executeUpdate();
            
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
