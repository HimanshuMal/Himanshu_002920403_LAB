
package UI;

import Model.Application;

public class MainJFrame extends javax.swing.JFrame {

    
    Application application;
    
    public MainJFrame() {
        initComponents();
        
        this.application = new Application();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        assignBtn = new javax.swing.JButton();
        createObservationBtn = new javax.swing.JButton();
        viewVitalsBtn = new javax.swing.JButton();
        medCatalogBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlJPanel.setBackground(new java.awt.Color(255, 255, 0));
        ControlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignBtn.setBackground(new java.awt.Color(255, 255, 204));
        assignBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        assignBtn.setText("ASSIGN MEDICINE");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 190, 50));

        createObservationBtn.setBackground(new java.awt.Color(255, 255, 204));
        createObservationBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        createObservationBtn.setText("CREATE OBSERVATION");
        createObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createObservationBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(createObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 50));

        viewVitalsBtn.setBackground(new java.awt.Color(255, 255, 204));
        viewVitalsBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        viewVitalsBtn.setText("VIEW VITAL SIGN HISTORY");
        viewVitalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalsBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(viewVitalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 50));

        medCatalogBtn.setBackground(new java.awt.Color(255, 255, 204));
        medCatalogBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        medCatalogBtn.setText("MEDICINE CATALOG");
        medCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCatalogBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(medCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 50));

        jSplitPane1.setLeftComponent(ControlJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assignBtnActionPerformed

    private void createObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createObservationBtnActionPerformed
        
        
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createObservationBtnActionPerformed

    private void viewVitalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalsBtnActionPerformed
        
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_viewVitalsBtnActionPerformed

    private void medCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCatalogBtnActionPerformed
        
        jSplitPane1.setRightComponent(new CatalogJPanel(this.application));
    }//GEN-LAST:event_medCatalogBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton createObservationBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medCatalogBtn;
    private javax.swing.JButton viewVitalsBtn;
    // End of variables declaration//GEN-END:variables
}
