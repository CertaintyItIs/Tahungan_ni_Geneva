package ODB;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author phili
 */
public class Inventory extends javax.swing.JFrame {

    login login = new login();

    public Inventory() {

        initComponents();
        table();
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

    
    
    public void table() {
        String sql = "SELECT * FROM producttable";
        productTable.setModel(new DefaultTableModel(null, new String[]{"ProductID", "Product", "Type", "Price", "Stock"}));
        try {
            DefaultTableModel defaulttable = (DefaultTableModel) productTable.getModel();

            Statement statement = Database.myConnect("posdatabase").createStatement();
            ResultSet resultset = statement.executeQuery(sql);

            while (resultset.next()) {
                Vector vector = new Vector();
                vector.add(resultset.getString(1));
                vector.add(resultset.getString(2));
                vector.add(resultset.getString(3));
                vector.add(resultset.getString(4));
                vector.add(resultset.getString(5));
                defaulttable.addRow(vector);
                productTable.setDefaultEditor(Object.class, null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    public String setselectedrow() {
        String productid = productTable.getValueAt(productTable.getSelectedRow(), 0).toString();
        return productid;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        lblGreetings = new javax.swing.JLabel();
        lblWindowTitle = new javax.swing.JLabel();
        lblBigWindowTitle = new javax.swing.JLabel();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdRefresh = new javax.swing.JButton();
        cmdAddNewProduct = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 69, 107));

        jScrollPane1.setBackground(new java.awt.Color(17, 105, 142));
        jScrollPane1.setForeground(new java.awt.Color(248, 241, 241));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        productTable.setBackground(new java.awt.Color(17, 105, 142));
        productTable.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        productTable.setForeground(new java.awt.Color(248, 241, 241));
        productTable.setModel(new DefaultTableModel(null, new String[]{"ProductID", "SellerID", "Product", "Type", "Price", "Stock"}));
        productTable.setGridColor(new java.awt.Color(25, 69, 107));
        productTable.setSelectionBackground(new java.awt.Color(22, 199, 154));
        productTable.setSelectionForeground(new java.awt.Color(25, 69, 107));
        productTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productTable.setShowGrid(true);
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        productTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
        }

        lblGreetings.setForeground(new java.awt.Color(248, 241, 241));

        lblWindowTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWindowTitle.setForeground(new java.awt.Color(248, 241, 241));
        lblWindowTitle.setText("Inventory System (Tahungan ni Geneva)");

        lblBigWindowTitle.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        lblBigWindowTitle.setForeground(new java.awt.Color(248, 241, 241));
        lblBigWindowTitle.setText("Mang-Imbentaryo kita!");

        cmdUpdate.setBackground(new java.awt.Color(22, 199, 154));
        cmdUpdate.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdUpdate.setForeground(new java.awt.Color(17, 105, 142));
        cmdUpdate.setText("UPDATE");
        cmdUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdUpdateMouseClicked(evt);
            }
        });
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setBackground(new java.awt.Color(22, 199, 154));
        cmdDelete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdDelete.setForeground(new java.awt.Color(17, 105, 142));
        cmdDelete.setText("DELETE");
        cmdDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdDeleteMouseClicked(evt);
            }
        });
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdRefresh.setBackground(new java.awt.Color(22, 199, 154));
        cmdRefresh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdRefresh.setForeground(new java.awt.Color(17, 105, 142));
        cmdRefresh.setText("REFRESH");
        cmdRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdRefreshMouseClicked(evt);
            }
        });
        cmdRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefreshActionPerformed(evt);
            }
        });

        cmdAddNewProduct.setBackground(new java.awt.Color(22, 199, 154));
        cmdAddNewProduct.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmdAddNewProduct.setForeground(new java.awt.Color(17, 105, 142));
        cmdAddNewProduct.setText("ADD");
        cmdAddNewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdAddNewProductMouseClicked(evt);
            }
        });
        cmdAddNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddNewProductActionPerformed(evt);
            }
        });

        cmdExit.setOpaque(false);
        cmdExit.setContentAreaFilled(false);
        cmdExit.setBorderPainted(false);
        cmdExit.setBorder(null);
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWindowTitle)
                            .addComponent(lblBigWindowTitle)
                            .addComponent(lblGreetings, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(cmdAddNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWindowTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGreetings, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblBigWindowTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAddNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        productTable.setCellSelectionEnabled(false);
        productTable.setRowSelectionAllowed(true);
        int selectedRowIndex = productTable.getSelectedRow();
    }//GEN-LAST:event_productTableMouseClicked

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed

        try {
            String sql = "DELETE FROM producttable WHERE ProductID = " + setselectedrow();
            int option = JOptionPane.showConfirmDialog(this, "Are you sure that you want to delete this product?",
                    "Delete Product", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (option == JOptionPane.YES_OPTION) {
                PreparedStatement preparedstatement = Database.myConnect("posdatabase").prepareStatement(sql);
                preparedstatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Product Deleted.");
            } else if (option == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Deletion Cancelled");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a product.");
        }
        table();
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdAddNewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdAddNewProductMouseClicked
        AddNewProduct addnewproduct = new AddNewProduct();
        addnewproduct.show();
    }//GEN-LAST:event_cmdAddNewProductMouseClicked

    private void cmdRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdRefreshActionPerformed

    private void cmdRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRefreshMouseClicked
        table();
    }//GEN-LAST:event_cmdRefreshMouseClicked

    private void cmdUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdUpdateMouseClicked
        try {
            if (setselectedrow() == "0") {
                JOptionPane.showMessageDialog(this, "Please select a product.", "No selected product", JOptionPane.ERROR_MESSAGE);
            } else {
                UpdateProduct updateproduct = new UpdateProduct();
                try {
                    //System.out.println(setselectedvalue());
                    Statement statement = Database.myConnect("posdatabase").createStatement();
                    ResultSet resultset = statement.executeQuery("SELECT * FROM producttable WHERE productID =" + setselectedrow());

                    if (resultset.next()) {

                        String ProductID = resultset.getString("ProductID");
                        String Product = resultset.getString("Product");
                        String Type = resultset.getString("Type");
                        String Price = resultset.getString("Price");
                        String Stock = resultset.getString("Stock");

                        updateproduct.txtUProductID.setText(ProductID);
                        updateproduct.txtUProductName.setText(Product);
                        updateproduct.txtUType.setText(Type);
                        updateproduct.txtUPrice.setText(Price);
                        updateproduct.txtUStock.setText(Stock);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
                updateproduct.show();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a product.");
        }
    }//GEN-LAST:event_cmdUpdateMouseClicked


    private void cmdDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdDeleteMouseClicked

    }//GEN-LAST:event_cmdDeleteMouseClicked

    private void cmdAddNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddNewProductActionPerformed

    }//GEN-LAST:event_cmdAddNewProductActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        int cmdExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit inventory and choose another transaction again?", "EXIT", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (cmdExit){
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(this, "Thank you, you can now choose another transaction");
                    Mainmenu men = new Mainmenu();
                    men.setVisible(rootPaneCheckingEnabled);
                    this.dispose();  
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(this, "Thank you for using the program!");
                    this.dispose();
            }
    
    }//GEN-LAST:event_cmdExitActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAddNewProduct;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdRefresh;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBigWindowTitle;
    public javax.swing.JLabel lblGreetings;
    private javax.swing.JLabel lblWindowTitle;
    public javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
