public class Ram {
    private int ram_volume;
    private String ram_producer;
    private String ram_model;
    private int ram_frequency;

    public Ram(int ram_volume, String ram_producer, String ram_model, int ram_frequency) {
        this.ram_volume = ram_volume;
        this.ram_producer = ram_producer;
        this.ram_model = ram_model;
        this.ram_frequency = ram_frequency;
    }

    public int getVolume() {
        return ram_volume;
    }

    public void setVolume(int ram_volume) {
        this.ram_volume = ram_volume;
    }

    public String getProducer() {
        return ram_producer;
    }

    public void setProducer(String ram_producer) {
        this.ram_producer = ram_producer;
    }

    public String getModel() {
        return ram_model;
    }

    public void setModel(String ram_model) {
        this.ram_model = ram_model;
    }

    public int getFrequency() {
        return ram_frequency;
    }

    public void setFrequency(int ram_frequency) {
        this.ram_frequency = ram_frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + ram_volume +
                ", producer='" + ram_producer + '\'' +
                ", model='" + ram_model + '\'' +
                ", frequency=" + ram_frequency +
                '}';
    }
}
