package src;

public class SmartWasteManagementSystem {
    private SystemAdmin admin;

    public SmartWasteManagementSystem() {
        admin = new SystemAdmin("Afridi", "Afridi@gmail.com");
    }

    public void run() {
        System.out.println(admin.getSystemStatus());
        System.out.println(admin.manageBinsAndRoutes());
        System.out.println(admin.manageEcoPoints());
        System.out.println(admin.generateReport());
    }

    public static void main(String[] args) {
        SmartWasteManagementSystem system = new SmartWasteManagementSystem();
        system.run();
    }
}
