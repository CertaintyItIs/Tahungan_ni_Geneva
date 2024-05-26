/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ODB;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author Rioan
 */

public class showProfile extends javax.swing.JFrame {

    /**
     * Creates new form showProfile
     */
    public showProfile() {
        initComponents();
        showProfil();
        
    }
    
    public void showProfil(){
            String sql = "SELECT * FROM usertable WHERE Username ='" + User + "'";
            try{
            Statement statement = Database.myConnect("posdatabase").createStatement();
            ResultSet resultset = statement.executeQuery(sql);
           
            while (resultset.next()) {

                String UserID = resultset.getString(1);
                String Username = resultset.getString(2);
                String Password	= resultset.getString(3);
                String First_Name = resultset.getString(4);
                String Middle_Name = resultset.getString(5);
                String Last_Name = resultset.getString(6);
                String Birthday	 = resultset.getString(7);
                String Contact_Number = resultset.getString(8);
                String Email = resultset.getString(9);
                String Address = resultset.getString(10);
                
                lblsetterUserID.setText(UserID);
                lblsetterUsername.setText(Username);
                lblsetterFirstName.setText(Password);
                lblsetterMiddleName.setText(First_Name);
                lblsetterLastName.setText(Last_Name);
                lblSetterBirthday.setText(Birthday);
                lblsetterContact.setText(Contact_Number);
                lblSetterEmail.setText(Email);
                lblsetterAddress.setText(Address);
               
            }
            resultset.close();
            statement.close();
    }catch (Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
    }}       
    
    public String User = getActiveUser();

    public String getActiveUser() {
        String Usersql = null;
        try {
            String sql = "SELECT * FROM currentactive;";
            Statement statement = Database.myConnect("posdatabase").createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                Usersql = resultset.getString(1);
                return Usersql;
            }
            resultset.close();
            statement.close();
        } catch (Exception e) {
            return null;
        }
        return Usersql;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        pnlBackg = new javax.swing.JPanel();
        lblSettings = new javax.swing.JLabel();
        lblMiddle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblsetterUsername = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblFirstN = new javax.swing.JLabel();
        lblLast = new javax.swing.JLabel();
        lblBday = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        cmdEdit = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        lblPass1 = new javax.swing.JLabel();
        lblSetterBirthday = new javax.swing.JLabel();
        lblsetterFirstName = new javax.swing.JLabel();
        lblsetterMiddleName = new javax.swing.JLabel();
        lblsetterContact = new javax.swing.JLabel();
        lblsetterLastName = new javax.swing.JLabel();
        lblSetterEmail = new javax.swing.JLabel();
        lblsetterAddress = new javax.swing.JLabel();
        lblsetterUserID = new javax.swing.JLabel();

        PopMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PopMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PopMenuMouseReleased(evt);
            }
        });

        jMenuItem1.setText("low");
        PopMenu.add(jMenuItem1);

        setUndecorated(true);

        pnlBackg.setBackground(new java.awt.Color(0, 31, 84));

        lblSettings.setBackground(new java.awt.Color(0, 0, 0));
        lblSettings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSettings.setForeground(new java.awt.Color(255, 255, 255));
        lblSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSettings.setText("USER SETTINGS");

        lblMiddle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMiddle.setForeground(new java.awt.Color(255, 255, 255));
        lblMiddle.setText("Middle Name:");

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Username:");

        lblsetterUsername.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterUsername.setText("UserID:");

        lblNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblNumber.setText("Contact No:");

        lblFirstN.setBackground(new java.awt.Color(255, 255, 255));
        lblFirstN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFirstN.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstN.setText("First Name:");

        lblLast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLast.setForeground(new java.awt.Color(255, 255, 255));
        lblLast.setText("Last Name:");

        lblBday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBday.setForeground(new java.awt.Color(255, 255, 255));
        lblBday.setText("Birthday:");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        cmdEdit.setBackground(new java.awt.Color(22, 199, 154));
        cmdEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmdEdit.setForeground(new java.awt.Color(17, 105, 142));
        cmdEdit.setText("Edit Profile");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdExit.setBackground(new java.awt.Color(22, 199, 154));
        cmdExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmdExit.setForeground(new java.awt.Color(17, 105, 142));
        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        lblPass1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPass1.setForeground(new java.awt.Color(255, 255, 255));
        lblPass1.setText("UserID:");

        lblSetterBirthday.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblSetterBirthday.setForeground(new java.awt.Color(255, 255, 255));
        lblSetterBirthday.setText("UserID:");

        lblsetterFirstName.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterFirstName.setText("UserID:");

        lblsetterMiddleName.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterMiddleName.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterMiddleName.setText("UserID:");

        lblsetterContact.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterContact.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterContact.setText("UserID:");

        lblsetterLastName.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterLastName.setText("UserID:");

        lblSetterEmail.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblSetterEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblSetterEmail.setText("UserID:");

        lblsetterAddress.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterAddress.setText("UserID:");

        lblsetterUserID.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblsetterUserID.setForeground(new java.awt.Color(255, 255, 255));
        lblsetterUserID.setText("UserID:");

        javax.swing.GroupLayout pnlBackgLayout = new javax.swing.GroupLayout(pnlBackg);
        pnlBackg.setLayout(pnlBackgLayout);
        pnlBackgLayout.setHorizontalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgLayout.createSequentialGroup()
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSetterEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgLayout.createSequentialGroup()
                                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsetterUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(lblsetterContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlBackgLayout.createSequentialGroup()
                                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblPass1)
                                                .addComponent(lblFirstN)
                                                .addComponent(lblsetterFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                                .addComponent(lblsetterLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(lblNumber))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsetterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsetterMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlBackgLayout.createSequentialGroup()
                                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBday)
                                            .addComponent(lblMiddle)
                                            .addComponent(lblUser)
                                            .addComponent(lblSetterBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgLayout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblsetterAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnlBackgLayout.setVerticalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgLayout.createSequentialGroup()
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(lblPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblsetterUsername)
                            .addComponent(lblsetterUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMiddle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsetterMiddleName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBday)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgLayout.createSequentialGroup()
                        .addComponent(lblFirstN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsetterFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblsetterLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSetterBirthday))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsetterContact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblSetterEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsetterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(pnlBackg, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
        UpdateProfile edit = new UpdateProfile();
        edit.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
        Mainmenu shope = new Mainmenu();
        shope.setVisible(rootPaneCheckingEnabled);
        this.hide();
    }//GEN-LAST:event_cmdExitActionPerformed

    private void PopMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PopMenuMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PopMenuMousePressed

    private void PopMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PopMenuMouseReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_PopMenuMouseReleased

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(showProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showProfile().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdExit;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBday;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstN;
    private javax.swing.JLabel lblLast;
    private javax.swing.JLabel lblMiddle;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblSetterBirthday;
    private javax.swing.JLabel lblSetterEmail;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblsetterAddress;
    private javax.swing.JLabel lblsetterContact;
    private javax.swing.JLabel lblsetterFirstName;
    private javax.swing.JLabel lblsetterLastName;
    private javax.swing.JLabel lblsetterMiddleName;
    private javax.swing.JLabel lblsetterUserID;
    private javax.swing.JLabel lblsetterUsername;
    private javax.swing.JPanel pnlBackg;
    // End of variables declaration//GEN-END:variables
}
