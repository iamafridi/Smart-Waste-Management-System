package src;

public class SystemAdmin {
    private String name;
    private String email;

    public SystemAdmin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getSystemStatus() {
        return "System is running smoothly.";
    }

    public String manageBinsAndRoutes() {
        return "Bins and routes are being managed.";
    }

    public String manageEcoPoints() {
        return "Eco-points are being managed.";
    }

    public String generateReport() {
        return "Report has been generated.";
    }
}
