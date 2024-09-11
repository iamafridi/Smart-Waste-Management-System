package src;

import java.util.Random;

public class SystemAdmin {
    private String name;
    private String email;
    private Random random;

    public SystemAdmin(String name, String email) {
        this.name = name;
        this.email = email;
        this.random = new Random();
    }

    public String getSystemStatus() {
        // Simulate system status
        return "System Status:\n" +
               "CPU Usage: " + random.nextInt(100) + "%\n" +
               "Memory Usage: " + random.nextInt(100) + "%\n" +
               "Disk Space: " + (100 - random.nextInt(50)) + "% available";
    }

    public String manageBinsAndRoutes() {
        // Simulate bin and route management
        return "Bins and Routes Management:\n" +
               "Total Bins: " + random.nextInt(50) + "\n" +
               "Bins Collected Today: " + random.nextInt(30) + "\n" +
               "Routes Optimized: " + (random.nextBoolean() ? "Yes" : "No");
    }

    public String manageEcoPoints() {
        // Simulate eco-points management
        return "Eco-Points Management:\n" +
               "Total Eco-Points: " + (random.nextInt(1000) + 500) + "\n" +
               "Points Awarded Today: " + (random.nextInt(100) + 10) + "\n" +
               "Total Rewards Distributed: " + (random.nextInt(50) + 5);
    }

    public String generateReport() {
        // Simulate report generation
        return "Report:\n" +
               "Total Waste Collected: " + (random.nextInt(1000) + 500) + " kg\n" +
               "Total Bins Collected: " + random.nextInt(50) + "\n" +
               "Total Routes Optimized: " + random.nextInt(20) + "\n" +
               "Total Eco-Points Awarded: " + (random.nextInt(1000) + 500);
    }
}
