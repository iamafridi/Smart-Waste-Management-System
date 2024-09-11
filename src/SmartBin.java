// SmartBin.java
public class SmartBin {
    private String binId;
    private boolean isFull;

    public SmartBin(String binId) {
        this.binId = binId;
        this.isFull = false;
    }

    public void fillBin() {
        isFull = true;
    }

    public boolean isBinFull() {
        return isFull;
    }

    public void emptyBin() {
        isFull = false;
    }

    public String getBinId() {
        return binId;
    }
}
