public class SmartWasteManagementSystem {
    private SystemAdmin admin;

    public SmartWasteManagementSystem() {
        admin = new SystemAdmin("Afridi", "Afridi@gmail.com");
    }

    public void run() {
        admin.monitorSystem();
        admin.manageBinsAndRoutes();
        admin.manageEcoPoints();
        admin.generateReports();
    }

    public static void main(String[] args) {
        SmartWasteManagementSystem system = new SmartWasteManagementSystem();
        system.run();
    }
}
