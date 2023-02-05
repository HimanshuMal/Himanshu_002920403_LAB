
package UI;

import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CatalogJPanel extends javax.swing.JPanel {

    private Application application;

    
    DefaultTableModel medTableModel;
    
    CatalogJPanel(Application application) {
        initComponents();
        
        this.application = application;
        this.medTableModel = (DefaultTableModel) medicineCatalogTable.getModel();
        
        displayMedicineCatalog();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalogTable = new javax.swing.JTable();
        fieldDosage = new javax.swing.JTextField();
        fieldNAme = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalogTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 64, -1, 340));
        add(fieldDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 50));

        fieldNAme.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNAmeFocusLost(evt);
            }
        });
        fieldNAme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNAmeActionPerformed(evt);
            }
        });
        add(fieldNAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 50));

        addBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Dosage");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNAmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNAmeActionPerformed
        
    }//GEN-LAST:event_fieldNAmeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
        String name = fieldNAme.getText();
        String dosage = fieldDosage.getText();
        
        
        MedicineCatalog catalog = this.application.getCatalog();
                
        catalog.createMedicine(name, Double.valueOf(dosage));
        
        
        displayMedicineCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void fieldNAmeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNAmeFocusLost
       
        
        String name = fieldNAme.getText();
        
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);
        
        if(isUnique) {
            
        } else {
            fieldNAme.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already exists");
        }
        
    }//GEN-LAST:event_fieldNAmeFocusLost

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
        
        int selectedRow = medicineCatalogTable.getSelectedRow();
        
        if(selectedRow >= 0) {
            
            Medicine med = (Medicine) medicineCatalogTable.getValueAt(selectedRow, 0);
            
            this.application.getCatalog().removeMedicine(med.getMedicineName());
            
            displayMedicineCatalog();
        } else {
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    public void displayMedicineCatalog() {
        
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        if(medicines.size() > 0) {
            
            
            medTableModel.setRowCount(0);
            
            for(Medicine med: medicines) {
                
                
                
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                
                medTableModel.addRow(row);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldDosage;
    private javax.swing.JTextField fieldNAme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalogTable;
    // End of variables declaration//GEN-END:variables
}
