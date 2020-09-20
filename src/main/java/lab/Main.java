package lab;

public class Main {
    public static void main(String[] args) {
        //private Case pcCase;
        //private Monitor monitor;
        //private Motherboard motherboard;
        Dimensions randomDimensions = new Dimensions(30,25,10);
        Case randomCase = new Case("Mac", "IEEE", "PowerSupply", randomDimensions);
        Resolution randomResolution = new Resolution(4, 10);

        Monitor randomMonitor = new Monitor(randomResolution,"Mac", "laptop");

        Motherboard randomMotherboard = new Motherboard("Mac", "IEEE", 2, 4, "CMD");
        Pc pc = new Pc(randomCase, randomMonitor, randomMotherboard);

        pc.description();
        pc.powerUp();
    }
}
