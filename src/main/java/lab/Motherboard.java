package lab;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlots;
    private String bios;

    //Default constructor
    public Motherboard(){
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlot=" + ramSlot +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }

    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlots, String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlot = ramSlot;
    this.cardSlots = cardSlots;
    this.bios = bios;
    }

    //BEHAVIOR
    public void loadProgram(String programName){
        System.out.println(programName + " is now running.");
    }

//GETTER AND SETTERS

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
