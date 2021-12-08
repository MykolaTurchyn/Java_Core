package part2;


public class Car {
    private int id;
    private String model;
    private Driver driver;

    public Car() {
    }

    public Car(int id, String model, Driver driver) {
        this.id = id;
        this.model = model;
        this.driver = driver;
    }

    public Car(int id, String model, String name, String surname, int age, double exp) {
        this.id = id;
        this.model = model;
        this.driver = new Driver(name, surname, age, exp);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", driver=" + driver +
                '}';
    }
}
