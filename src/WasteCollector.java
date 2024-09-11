// WasteCollector.java
public class WasteCollector extends User {

    public WasteCollector(String name) {
        super(name, "WasteCollector");
    }

    public void receiveCollectionRequest() {
        System.out.println(name + " has received a new collection request.");
    }

    public void getOptimizedRoute() {
        System.out.println(name + " is following an optimized route.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Collector: " + name + " | Role: " + role);
    }
}
