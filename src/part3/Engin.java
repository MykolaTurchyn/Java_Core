package part3;

public class Engin {
    private String eng_model;
    private double volume;
    private int power;

    public Engin() {
    }

    public Engin(String eng_model, double volume, int power) {
        this.eng_model = eng_model;
        this.volume = volume;
        this.power = power;
    }

    public String getModel() {
        return eng_model;
    }

    public void setModel(String model) {
        this.eng_model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engin{" +
                "model='" + eng_model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
