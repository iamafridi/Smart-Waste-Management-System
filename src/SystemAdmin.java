public class SystemAdmin {
    private String name;
    private String email;

    public SystemAdmin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void monitorSystem() {
        System.out.println("Monitoring system status...");
    }

    public void manageBinsAndRoutes() {
        System.out.println("Managing bins and routes...");
    }

    public void manageEcoPoints() {
        System.out.println("Managing eco-points and rewards...");
    }

    public void generateReports() {
        System.out.println("Generating reports...");
    }
}
