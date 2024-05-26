package ODB;

import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class login extends javax.swing.JFrame {
   
    
    public login() {

        initComponents();
        image(TahongBG, "/TahongBG.jpg", 457, 375);
        image(cmdExit, "/close.png");
    }
    
    
    
 public void image(javax.swing.JButton button, String source) {
        ImageIcon icon = new ImageIcon(getClass().getResource(source));
        int offset = button.getInsets().left;
        button.setIcon(resizeIcon(icon, button.getWidth() - offset, button.getHeight() - offset));
    }

    public void image(javax.swing.JLabel label, String source, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource(source));
        int offset = label.getInsets().left;
        label.setIcon(resizeIcon(icon, width, height));
    }

    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackg = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        cmdExit = new javax.swing.JButton();
        cmdLog = new javax.swing.JButton();
        cmdReg = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        TahongBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);

        pnlBackg.setBackground(new java.awt.Color(25, 69, 107));
        pnlBackg.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));

        txtPass.setBackground(new java.awt.Color(248, 241, 241));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(17, 105, 142));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(248, 241, 241));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Mamakal kita.");
        lblTitle.setAutoscrolls(true);

        txtUser.setBackground(new java.awt.Color(248, 241, 241));
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(17, 105, 142));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        cmdExit.setOpaque(false);
        cmdExit.setContentAreaFilled(false);
        cmdExit.setBorderPainted(false);
        cmdExit.setBorder(null);
        cmdExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdExitMouseClicked(evt);
            }
        });
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        cmdLog.setBackground(new java.awt.Color(22, 199, 154));
        cmdLog.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdLog.setForeground(new java.awt.Color(17, 105, 142));
        cmdLog.setText("LOGIN");
        cmdLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdLogMouseClicked(evt);
            }
        });
        cmdLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogActionPerformed(evt);
            }
        });

        cmdReg.setBackground(new java.awt.Color(22, 199, 154));
        cmdReg.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdReg.setForeground(new java.awt.Color(17, 105, 142));
        cmdReg.setText("REGISTER");
        cmdReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdRegMouseClicked(evt);
            }
        });
        cmdReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegActionPerformed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(248, 241, 241));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Dali na! ");
        lblTitle1.setAutoscrolls(true);

        TahongBG.setText("jLabel1");

        javax.swing.GroupLayout pnlBackgLayout = new javax.swing.GroupLayout(pnlBackg);
        pnlBackg.setLayout(pnlBackgLayout);
        pnlBackgLayout.setHorizontalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdReg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cmdLog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahongBG, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBackgLayout.setVerticalGroup(
            pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgLayout.createSequentialGroup()
                .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlBackgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdLog, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(TahongBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void cmdLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdLogMouseClicked

    }//GEN-LAST:event_cmdLogMouseClicked


    private void cmdRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cmdRegMouseClicked


    private void cmdRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegActionPerformed
        // TODO add your handling code here:

        RegistrationForm SR = new RegistrationForm();
        SR.show();

    }//GEN-LAST:event_cmdRegActionPerformed


    private void cmdExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdExitMouseClicked
        // TODO add your handling code here:
        int cmdExit = JOptionPane.showConfirmDialog(null, "Are you sure you really want to exit?", "EXIT", JOptionPane.YES_NO_OPTION);
        switch (cmdExit) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(this, "Thank you for using the program.");
                System.exit(0);
            case JOptionPane.NO_OPTION:
        }
    }//GEN-LAST:event_cmdExitMouseClicked


    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed


    private void cmdLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogActionPerformed

        String getuser = txtUser.getText();
        String getpass = txtPass.getText();

        if ((getuser.equals("")) && (getpass.equals(""))) {
            JOptionPane.showMessageDialog(this, "Check Empty Field", "SMS", 1);
        } else {
            String sql = "UPDATE currentactive SET ActiveUser = ?";
                 try{
                    PreparedStatement preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
                    preparedstatement.setString(1, getuser);
                    preparedstatement.executeUpdate();
                    
                 }
                 catch(Exception e){
                 
                 }
            try {
                 sql = ("SELECT * FROM usertable WHERE username='" + getuser + "'AND password='" + getpass + "'");
                Statement statement = Database.myConnect("posdatabase").createStatement();
                ResultSet resultset = statement.executeQuery(sql);

                if (resultset.next()) {
                
                    JOptionPane.showMessageDialog(this, "ACCESS GRANTED", "MESSAGE", 1);
                    Mainmenu menu = new Mainmenu();
                    menu.setVisible(rootPaneCheckingEnabled);
                    resultset.close();
                    statement.close();
  
                    
                    this.hide();
                } else {
                    JOptionPane.showMessageDialog(this, "INVALID USERNAME OR PASSWORD", "MESSAGE", 0);
                }
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
         
        }
     
 
    }//GEN-LAST:event_cmdLogActionPerformed


    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdExitActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            
        
            String getuser = txtUser.getText();
        String getpass = txtPass.getText();

        if ((getuser.equals("")) && (getpass.equals(""))) {
            JOptionPane.showMessageDialog(this, "Check Empty Field", "SMS", 1);
        } else {
            String sql = "UPDATE currentactive SET ActiveUser = ?";
                 try{
                    PreparedStatement preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
                    preparedstatement.setString(1, getuser);
                    preparedstatement.executeUpdate();
                    
                 }
                 catch(Exception e){
                 
                 }
            try {
                 sql = ("SELECT * FROM usertable WHERE username='" + getuser + "'AND password='" + getpass + "'");
                Statement statement = Database.myConnect("posdatabase").createStatement();
                ResultSet resultset = statement.executeQuery(sql);

                if (resultset.next()) {
                
                    JOptionPane.showMessageDialog(this, "ACCESS GRANTED", "MESSAGE", 1);
                    Mainmenu menu = new Mainmenu();
                    menu.setVisible(rootPaneCheckingEnabled);
                    resultset.close();
                    statement.close();
  
                    
                    this.hide();
                } else {
                    JOptionPane.showMessageDialog(this, "INVALID USERNAME OR PASSWORD", "MESSAGE", 0);
                }
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
         
        }
        }
    }//GEN-LAST:event_txtPassKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TahongBG;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdLog;
    private javax.swing.JButton cmdReg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel pnlBackg;
    private javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
