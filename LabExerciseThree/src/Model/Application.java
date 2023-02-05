
package Model;



public class Application {
    VitalSignHistory history;
    MedicineCatalog catalog;
    
    public Application() {
        this.catalog = new MedicineCatalog();
        this.history = new VitalSignHistory();
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    
}
