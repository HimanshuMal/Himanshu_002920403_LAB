
package UI;

import Model.Application;
import Model.Medicine;
import Model.Observation;
import java.util.ArrayList;


public class MedicineAssignJPanel extends javax.swing.JPanel {

    private Application application;

    MedicineAssignJPanel(Application application) {
        initComponents();
        
        this.application = application;
        
        populateDropdowns();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineBox = new javax.swing.JComboBox();
        ObservationBosx = new javax.swing.JComboBox();
        assignMedBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineBoxActionPerformed(evt);
            }
        });
        add(medicineBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, 30));

        ObservationBosx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObservationBosxItemStateChanged(evt);
            }
        });
        add(ObservationBosx, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 200, 30));

        assignMedBtn.setText("ASSIGN");
        assignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedBtnActionPerformed(evt);
            }
        });
        add(assignMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Medicine Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedBtnActionPerformed
       
        Observation o = (Observation) ObservationBosx.getSelectedItem();
        Medicine m = (Medicine) medicineBox.getSelectedItem();
        
        o.setMedication(m);
         if(o.getMedication() != null) {
            jLabel1.setText(o.getMedication().getMedicineName());
            jLabel4.setText(String.valueOf(o.getObservationId())) ;
           
        }
        
    }//GEN-LAST:event_assignMedBtnActionPerformed

    private void ObservationBosxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObservationBosxItemStateChanged

       // Observation o = (Observation) ObservationBosx.getSelectedItem();
        
       
        
        
    }//GEN-LAST:event_ObservationBosxItemStateChanged

    private void medicineBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineBoxActionPerformed

    public void populateDropdowns() {
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
        
        for(Observation o: observations) {
            ObservationBosx.addItem(o);
        }
        
        for(Medicine med: medicines) {
            medicineBox.addItem(med);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ObservationBosx;
    private javax.swing.JButton assignMedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox medicineBox;
    // End of variables declaration//GEN-END:variables
}
