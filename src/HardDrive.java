public class HardDrive {
    private String hd_producer;
    private int hd_volume;
    private Type hd_type;

    public HardDrive(String hd_producer, int hd_volume, Type hd_type) {
        this.hd_producer = hd_producer;
        this.hd_volume = hd_volume;
        this.hd_type = hd_type;
    }

    public String getProducer() {
        return hd_producer;
    }

    public void setProducer(String hd_producer) {
        this.hd_producer = hd_producer;
    }

    public int getVolume() {
        return hd_volume;
    }

    public void setVolume(int hd_volume) {
        this.hd_volume = hd_volume;
    }

    public Type getType() {
        return hd_type;
    }

    public void setType(Type hd_type) {
        this.hd_type = hd_type;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "producer='" + hd_producer + '\'' +
                ", volume=" + hd_volume +
                ", type=" + hd_type +
                '}';
    }
}
