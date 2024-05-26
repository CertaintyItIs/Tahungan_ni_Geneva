/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ODB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rioan
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Receipt
     */
    public Receipt() {

        initComponents();
        SetReceiptDetails();
    }
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
        } catch (Exception e) {
            return null;
        }
        return Usersql;
    }

String User = getActiveUser();

    public void SetReceiptDetails() {
        login Login = new login();
        Mainmenu mainmenu = new Mainmenu();

        try {
            String ContactNo = null;
            String Address = null;
            int Total = 0;
            
            String sql = "SELECT Subtotal FROM transactionlogtable WHERE TransactionID = (SELECT max(TransactionID) FROM transactionlogtable);";
            PreparedStatement preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
            ResultSet resultset = preparedstatement.executeQuery();
            while (resultset.next()) {
                Total += Integer.parseInt(resultset.getString(1));
            }
            
            
            
            lblBuyer.setText("Buyer:" + User);
            lblTotal.setText("Total: " + Total);

            sql = "SELECT Contact_Number, Address FROM usertable WHERE Username = ?";
            preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
            preparedstatement.setString(1, User);

            resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                ContactNo = resultset.getString(1);
                Address = resultset.getString(2);
                preparedstatement.close();
            }
            lblContactNo.setText("Contact No.: " + ContactNo);
            lblAddress.setText("Address: " + Address);
            
            
            sql = "SELECT TransactionID FROM transactiontable WHERE TransactionID=(SELECT max(TransactionID) FROM transactiontable);";
            preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);

            resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                String TransactionID = resultset.getString(1);
                preparedstatement.close();
               lblTransactionID.setText("Transaction ID: " + TransactionID);
            }
            

        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBgrounds = new javax.swing.JPanel();
        lblThanks = new javax.swing.JLabel();
        cmdBack = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblBuyer = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceipt = new javax.swing.JTable();
        lblThanks1 = new javax.swing.JLabel();
        lblTransactionID = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBgrounds.setBackground(new java.awt.Color(255, 255, 255));

        lblThanks.setBackground(new java.awt.Color(255, 255, 255));
        lblThanks.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblThanks.setForeground(new java.awt.Color(0, 0, 0));
        lblThanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThanks.setText("Thank you for trusting!");

        cmdBack.setBackground(new java.awt.Color(255, 255, 255));
        cmdBack.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        cmdBack.setForeground(new java.awt.Color(0, 0, 0));
        cmdBack.setText("Go Back");
        cmdBack.setToolTipText("");
        cmdBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackActionPerformed(evt);
            }
        });

        lblAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddress.setText("Address:");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Total:");

        lblBuyer.setBackground(new java.awt.Color(255, 255, 255));
        lblBuyer.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblBuyer.setForeground(new java.awt.Color(0, 0, 0));
        lblBuyer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBuyer.setText("Buyer:");

        lblContactNo.setBackground(new java.awt.Color(255, 255, 255));
        lblContactNo.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(0, 0, 0));
        lblContactNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContactNo.setText("Contact No.:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        String sql = "SELECT DISTINCT(TransactionID) FROM transactionlogtable WHERE TransactionID = (SELECT max(TransactionID) FROM transactionlogtable);";
        String lbl = null;
        try{
            PreparedStatement preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
            ResultSet resultset = preparedstatement.executeQuery();
            while (resultset.next()) {
                lbl = resultset.getString(1);
            }
            preparedstatement.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        sql = "SELECT ProductID, SellerID, Seller, Product, Price, Quantity, Subtotal FROM transactionlogtable WHERE TransactionID =" + lbl;
        tblReceipt.setModel(new javax.swing.table.DefaultTableModel(
            null, new String[]{"ProductID", "SellerID","Seller", "Product", "Price", "Quantity", "Subtotal"})
    );
    try{
        DefaultTableModel defaulttable= (DefaultTableModel) tblReceipt.getModel();

        Statement statement = Database.myConnect("posdatabase").createStatement();
        ResultSet resultset = statement.executeQuery(sql);

        while(resultset.next()){
            Vector vector = new Vector();
            vector.add(resultset.getString(1));
            vector.add(resultset.getString(2));
            vector.add(resultset.getString(3));
            vector.add(resultset.getString(4));
            vector.add(resultset.getString(5));
            vector.add(resultset.getString(6));
            vector.add(resultset.getString(7));
            defaulttable.addRow(vector);
            tblReceipt.setDefaultEditor(Object.class, null);
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    tblReceipt.setColumnSelectionAllowed(true);
    tblReceipt.setRowSelectionAllowed(false);
    tblReceipt.getTableHeader().setReorderingAllowed(false);
    tblReceipt.setUpdateSelectionOnSort(false);
    jScrollPane1.setViewportView(tblReceipt);
    tblReceipt.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

    lblThanks1.setBackground(new java.awt.Color(255, 255, 255));
    lblThanks1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
    lblThanks1.setForeground(new java.awt.Color(0, 0, 0));
    lblThanks1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblThanks1.setText("OFFICIAL RECEIPT");

    lblTransactionID.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
    lblTransactionID.setForeground(new java.awt.Color(0, 0, 0));
    lblTransactionID.setText("TransactionID:");

    javax.swing.GroupLayout pnlBgroundsLayout = new javax.swing.GroupLayout(pnlBgrounds);
    pnlBgrounds.setLayout(pnlBgroundsLayout);
    pnlBgroundsLayout.setHorizontalGroup(
        pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlBgroundsLayout.createSequentialGroup()
            .addGroup(pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBgroundsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addGroup(pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBgroundsLayout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBgroundsLayout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlBgroundsLayout.createSequentialGroup()
                    .addGroup(pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(lblThanks, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblThanks1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblBuyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                        .addGroup(pnlBgroundsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTransactionID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addContainerGap())
    );
    pnlBgroundsLayout.setVerticalGroup(
        pnlBgroundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgroundsLayout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(lblThanks)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lblThanks1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addComponent(lblTransactionID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblBuyer)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblContactNo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(cmdBack)
            .addGap(19, 19, 19))
    );

    getContentPane().add(pnlBgrounds, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 650));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackActionPerformed
        // TODO add your handling code here:
        Mainmenu shoppp = new Mainmenu();
        shoppp.setVisible(rootPaneCheckingEnabled);
        this.hide();
    }//GEN-LAST:event_cmdBackActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBuyer;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblThanks;
    private javax.swing.JLabel lblThanks1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTransactionID;
    private javax.swing.JPanel pnlBgrounds;
    private javax.swing.JTable tblReceipt;
    // End of variables declaration//GEN-END:variables
}