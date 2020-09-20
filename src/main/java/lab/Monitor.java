package lab;

public class Monitor {
    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    Resolution resolution = new Resolution();
    private String model;
    private String manufacturer;

    //Default constructor

    static void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x +"," +y + "" + " in color " + color);
    }
    public String getModel(String model) {
        return model;
    }
    public String setModel(String model){
        return model;
    }
    public String getManufacturer(String manufacturer) {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
