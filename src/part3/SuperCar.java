package part3;

import java.util.Scanner;

public class SuperCar {
    private String model;
    private String producer;
    private int year;
    private Engin engine;

    public void change_volume(){
        engine.change_volume();
//        System.out.println("done");
    }

    public SuperCar() {
    }

    public SuperCar(String model, String producer, int year, String eng_model, double volume, int power) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.engine = new Engin(eng_model, volume, power);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engin getEngine() {
        return engine;
    }

    public void setEngine(Engin engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
