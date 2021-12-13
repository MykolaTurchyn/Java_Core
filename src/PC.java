public class PC {
    private String model;
    private CPU cpu;
    private Motherboard motherboard;
    private Ram ram;
    private HardDrive hard;


    public PC(String model, CPU cpu, Motherboard motherboard, Ram ram, HardDrive hard) {
        this.model = model;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hard = hard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHard() {
        return hard;
    }

    public void setHard(HardDrive hard) {
        this.hard = hard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", cpu=" + cpu +
                ", motherboard=" + motherboard +
                ", ram=" + ram +
                ", hard=" + hard +
                '}';
    }
}
