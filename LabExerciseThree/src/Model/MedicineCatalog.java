
package Model;

import java.util.ArrayList;


public class MedicineCatalog {
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog() {
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage) {
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
    }
    
    
    public Boolean checkIfMedicineUnique(String name) {
        for(Medicine med: this.medicineList) {
            if(med.getMedicineName().equals(name)) {
                return false;
            }
        }
        
        return true;
    }
    
    
    public void removeMedicine(String name) {
        
         for(Medicine med: this.medicineList) {
             if(med.getMedicineName().equals(name)) {
                 this.medicineList.remove(med);
                 break;
             }
         }
    }
 }
