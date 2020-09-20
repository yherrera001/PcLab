package lab;

//First step
public class Pc{
private Case pcCase;
private Monitor monitor;
private Motherboard motherboard;

    @Override
    public String toString() {
        return "Pc{" +
                "pcCase=" + pcCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }

    //Second step
    public Pc(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    //Third step
    private void drawLogo(){
        this.monitor.drawPixelAt(5,10,"purple");
    }


    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(motherboard);
        System.out.println(monitor);
        System.out.println(pcCase);
    }
    public void powerUp(){
        this.pcCase.pressPowerButton();
        drawLogo();
        this.motherboard.loadProgram("MAC");

    }
}
