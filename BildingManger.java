public class BildingManger {
    private String bildingName;
    private String bildingManager;
    private String assisstingManager;
    private String scurity;
    private String suport;
    private String amozeshManager;

    public BildingManger(String bildingName, String bildingManager, String assisstingManager, String scurity, String suport, String amozeshManager) {
        this.bildingName = bildingName;
        this.bildingManager = bildingManager;
        this.assisstingManager = assisstingManager;
        this.scurity = scurity;
        this.suport = suport;
        this.amozeshManager = amozeshManager;
    }

    public String showManager(){
        return this.bildingManager;
    }



    public String getBildingName() {
        return bildingName;
    }

    public String getBildingManager() {
        return bildingManager;
    }

    public String getAssisstingManager() {
        return assisstingManager;
    }

    public String getScurity() {
        return scurity;
    }

    public String getSuport() {
        return suport;
    }

    public String getAmozeshManager() {
        return amozeshManager;
    }
}
