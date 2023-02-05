
package UI;

import Model.Application;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;


 
public class CreateJPanel extends javax.swing.JPanel {

    private Application application;

    
   

    CreateJPanel(Application application) {
        initComponents();
        
        this.application = application;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldObservationID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldBloodPressure = new javax.swing.JTextField();
        fieldTemperature1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addObseravationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 208, 227));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("CREATE A VITAL SIGN");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 200, 40));
        add(fieldObservationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, 30));
        add(fieldTemperature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        addObseravationBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addObseravationBtn.setText("ADD OBSERVATION");
        addObseravationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObseravationBtnActionPerformed(evt);
            }
        });
        add(addObseravationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addObseravationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObseravationBtnActionPerformed
        
        
        VitalSignHistory history = this.application.getHistory();
        
        
        String id = fieldObservationID.getText();
        String temperature = fieldTemperature1.getText();
        String bloodPressure = fieldBloodPressure.getText();
        
        
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        
        JOptionPane.showMessageDialog(null, "Added observation");
    }//GEN-LAST:event_addObseravationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObseravationBtn;
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationID;
    private javax.swing.JTextField fieldTemperature1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
