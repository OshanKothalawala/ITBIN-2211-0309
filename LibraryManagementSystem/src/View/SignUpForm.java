/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SignUpForm extends javax.swing.JFrame {
    private Statement stmt;
    private ResultSet rs;
    
    private int selectedRowIndex = -1;
    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
            initComponents();
            tableLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        em = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        ne = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sign Up Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("First Name  -");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Last Name  -");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Email           -");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("User Name  -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Password    -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, -1, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 103, 186, -1));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 158, 186, -1));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 222, 186, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 354, 186, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 285, 186, -1));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "User Name", "Email"
            }
        ));
        usertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertableMouseClicked(evt);
            }
        });
        usertable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usertableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(usertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 490, 341));

        ne.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ne.setText("Next");
        ne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neActionPerformed(evt);
            }
        });
        jPanel1.add(ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fce014ec00f9bc85cfe763ec093ea464.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
  public void tableLoad(){
    String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usertable");
                
            DefaultTableModel tb1Model = (DefaultTableModel) usertable.getModel();
            tb1Model.setRowCount(0);
           
            while (rs.next()) {
                String firstN = rs.getString("firstname");
                String lastN = rs.getString("lastname");
                String uName = rs.getString("username");
                String email = rs.getString("email");
               
                String tbData[] = {firstN, lastN, uName, email};
                tb1Model.addRow(tbData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
  
  public void loaddata(){
      int r = usertable.getSelectedRow();
        String firstname = usertable.getValueAt(r, 0).toString();
        String lastname = usertable.getValueAt(r, 1).toString();
        String username = usertable.getValueAt(r, 2).toString();
        String email = usertable.getValueAt(r, 3).toString();
        
        fn.setText(firstname);
        ln.setText(lastname);
        uname.setText(username);
        em.setText(email);
  }
  
  
  
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            String sql = "INSERT INTO usertable (firstname, lastname, username, email, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, fn.getText());
            ptst.setString(2, ln.getText());
            ptst.setString(3, uname.getText());
            ptst.setString(4, em.getText());
            ptst.setString(5, pass.getText());
           
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data inserted successfully!");
            con.close();
            tableLoad(); // Refresh table data after insertion
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        tableLoad();
        clear();
    }                                
    
   
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fn.setText("");
        ln.setText("");
        uname.setText("");
        em.setText("");
        pass.setText("");
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        
        try {
            String fname = fn.getText();
            String lname = ln.getText();
            String uName = uname.getText();
            String email = em.getText();
            String pW = pass.getText();
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", ""); 
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE usertable SET lastname = '" + lname + "', username = '" + uName + "', email = '" + email + "', password = '" + pW + "' WHERE firstname = '" + fname + "'");
            
            JOptionPane.showMessageDialog(null, "Record Update Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        tableLoad();
        clear();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String fName = fn.getText();
        delete(fName);
        
        tableLoad();
        clear();
    }//GEN-LAST:event_deleteActionPerformed

    
  
    public void delete(String fName){
       String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM usertable WHERE firstname = '" + fName + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }

    
        public void clear(){
            fn.setText("");
            ln.setText("");
            uname.setText("");
            em.setText("");
            pass.setText("");
        }
        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         HomePage homepage= new HomePage();
        homepage.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void neActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neActionPerformed
        // TODO add your handling code here:
        LoginPage loginpage =new LoginPage();
        loginpage.setVisible(true);
        dispose();
        
        //new LoginPage().setVisible(true);
        
    }//GEN-LAST:event_neActionPerformed

    private void usertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertableMouseClicked
      
    loaddata();
    }//GEN-LAST:event_usertableMouseClicked

    private void usertableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertableKeyReleased


loaddata();
        // TODO add your handling code here:
    }//GEN-LAST:event_usertableKeyReleased

    /**
     * @param args the command line argumentss
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JButton ne;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField uname;
    private javax.swing.JButton update;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables

    /**private void loadSignUpFormTableData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fetchAndDisplaySignUpFormData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }**/
}
