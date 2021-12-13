public class CPU {
    private String cpu_model;
    private int cpu_frequency;
    private int cpu_generation;
    private String cpu_producer;

    public void new_cpumodel() {
        this.setModel("intel");
    }

    public CPU(String cpu_model, int cpu_frequency, int cpu_generation, String cpu_producer) {
        this.cpu_model = cpu_model;
        this.cpu_frequency = cpu_frequency;
        this.cpu_generation = cpu_generation;
        this.cpu_producer = cpu_producer;
    }

    public String getModel() {
        return cpu_model;
    }

    public void setModel(String model) {
        this.cpu_model = cpu_model;
    }

    public int getFrequency() {
        return cpu_frequency;
    }

    public void setFrequency(int cpu_frequency) {
        this.cpu_frequency = cpu_frequency;
    }

    public int getGeneration() {
        return cpu_generation;
    }

    public void setGeneration(int cpu_generation) {
        this.cpu_generation = cpu_generation;
    }

    public String getProducer() {
        return cpu_producer;
    }

    public void setProducer(String cpu_producer) {
        this.cpu_producer = cpu_producer;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + cpu_model + '\'' +
                ", frequency=" + cpu_frequency +
                ", generation=" + cpu_generation +
                ", producer='" + cpu_producer + '\'' +
                '}';
    }
}
