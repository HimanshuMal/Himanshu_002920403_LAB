
package Model;


public class Observation {
    int observationId;
    private double bloodPressure;
    private double temperature;
    private Medicine medication;
    
    public Observation() {
        this.medication = new Medicine();
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    

    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }
   
    
    @Override
    public String toString() {
        return String.valueOf(this.observationId);
    }
    
}
