/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author 18572
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */private DeliveryPackage deliveryPackage ;
     private Product productViewed;
    public ViewJPanel() {
        initComponents();
    }
public ViewJPanel( DeliveryPackage delPackage ) {
        initComponents();
        this.deliveryPackage = delPackage ;
        this.deliveryPackage = deliveryPackage ;
        displayProductList(); 
        displayPackageDetails();
    }
  public void displayProductList() {

        for (Product p : this.deliveryPackage.getProductlist()) {
            viewComboBox.addItem((p.getProductId()));
        }

    }
     public void displayPackageDetails() {
        viewPackageId.setText(String.valueOf(this.deliveryPackage.getPackageId()));
        viewPackageWeight.setText(String.valueOf(this.deliveryPackage.getPackageWeight()));

        Customer customer = this.deliveryPackage.getCustomer();
        viewCustomerId.setText(String.valueOf(customer.getCustomerId()));
        viewCustomerName.setText(customer.getFullname());

    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        packId = new javax.swing.JTextField();
        prodName = new javax.swing.JTextField();
        prodWeight = new javax.swing.JTextField();
        prodId = new javax.swing.JTextField();
        prodPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewPackageId = new javax.swing.JTextField();
        viewPackageWeight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viewCustomerName = new javax.swing.JTextField();
        viewCustomerId = new javax.swing.JTextField();
        viewComboBox = new javax.swing.JComboBox();
        viewShowProductBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        viewProductId = new javax.swing.JTextField();
        viewProductPrice = new javax.swing.JTextField();
        viewProductName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel1.setText("Package Id");

        jLabel2.setText("Product Name");

        jLabel3.setText("weight");

        jLabel8.setText("Product Id");

        jLabel5.setText("price");

        packId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packIdActionPerformed(evt);
            }
        });

        prodWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodWeightActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 188, 44));

        jLabel14.setText("Package Id");

        jLabel15.setText("weight");

        viewPackageId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPackageIdActionPerformed(evt);
            }
        });

        viewPackageWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPackageWeightActionPerformed(evt);
            }
        });

        jLabel6.setText("Customer Name");

        jLabel7.setText("Customer Id");

        viewCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerIdActionPerformed(evt);
            }
        });

        viewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboBoxActionPerformed(evt);
            }
        });

        viewShowProductBtn.setText("show");
        viewShowProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewShowProductBtnActionPerformed(evt);
            }
        });

        jLabel16.setText("Product Id");

        jLabel17.setText("price");

        jLabel18.setText("Product Name");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("Package Details");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setText("Product Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewPackageWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPackageId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(61, 61, 61)
                                .addComponent(viewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(51, 51, 51)
                        .addComponent(viewShowProductBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPackageId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(viewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPackageWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(viewCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jLabel20)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewShowProductBtn))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(viewProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(viewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jLabel14)
                    .addGap(36, 36, 36)
                    .addComponent(jLabel15)
                    .addContainerGap(574, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void packIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packIdActionPerformed

    private void prodWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodWeightActionPerformed

    private void viewPackageIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPackageIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPackageIdActionPerformed

    private void viewPackageWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPackageWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPackageWeightActionPerformed

    private void viewCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomerIdActionPerformed

    private void viewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewComboBoxActionPerformed

    private void viewShowProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewShowProductBtnActionPerformed
        // TODO add your handling code here:
        viewProductId.setEnabled(false);

        int pid = (int) viewComboBox.getSelectedItem();
        Product prod = this.deliveryPackage.findProduct(pid);
        this.productViewed = prod;

        if (!prod.equals(null)) {
            viewProductId.setText(String.valueOf(pid));
            viewProductName.setText(prod.getProductName());
            viewProductPrice.setText(String.valueOf(prod.getProductPrice()));
        } else {
            JOptionPane.showMessageDialog(null, "Product not found");
        }
    }//GEN-LAST:event_viewShowProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField packId;
    private javax.swing.JTextField prodId;
    private javax.swing.JTextField prodName;
    private javax.swing.JTextField prodPrice;
    private javax.swing.JTextField prodWeight;
    private javax.swing.JComboBox viewComboBox;
    private javax.swing.JTextField viewCustomerId;
    private javax.swing.JTextField viewCustomerName;
    private javax.swing.JTextField viewPackageId;
    private javax.swing.JTextField viewPackageWeight;
    private javax.swing.JTextField viewProductId;
    private javax.swing.JTextField viewProductName;
    private javax.swing.JTextField viewProductPrice;
    private javax.swing.JButton viewShowProductBtn;
    // End of variables declaration//GEN-END:variables
}
