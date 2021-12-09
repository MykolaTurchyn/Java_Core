package part3;

import java.util.Scanner;

public class Engin {
    private String eng_model;
    private double volume;
    private int power;

    public void change_volume() {
        System.out.println("Enter new volume for this car");
        Scanner scanner = new Scanner(System.in);
        double new_volume = Double.parseDouble(scanner.nextLine());
        scanner.close();
        this.setVolume(new_volume);
    }

    public Engin(String eng_model, double volume, int power) {
        this.eng_model = eng_model;
        this.volume = volume;
        this.power = power;
    }

    public String getEng_model() {
        return eng_model;
    }

    public void setEng_model(String eng_model) {
        this.eng_model = eng_model;
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
