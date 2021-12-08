package demo2;

public class Main {
    public static void main(String[] args) {
        // ДЕЛЕГАЦІЯ
        Car toyota = new Car(1, "toyota", new Engine(250, 3));
        toyota.getEngine().ignition(); //Bad Method
        toyota.ignition(true); //Good Method
        toyota.ignition(false); //Good Method
    }
}
