/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import View.HomePage;
//import View.Dashboard;
import Model.DBconnection;
import Model.DBSearch;
import View.CategoryView;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.LoginPage;
/**
 *
 * @author shama
 */
public class LoginController {
    public static void login(String usName, String pass) {
 try {
 String username = null; // initial value of the username
 String password = null; // initial value of the password
 ResultSet rs = new DBSearch().searchLogin(usName);
//Process the Query
 while (rs.next()) {
username = rs.getString("uname"); //assign database login name to the variable
password = rs.getString("password"); //assign database password to the variable
 }
 if (username != null && password != null) {
 if (password.equals(pass)) {
 System.out.println("Login Successfull");
LoginPage.getFrames()[0].dispose();
 new CategoryView().setVisible(true);
 } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 DBconnection.closeCon();
 } catch (SQLException ex) {
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
}
