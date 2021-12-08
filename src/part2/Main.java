package part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Driver driver1 = new Driver("Vasya", "Popov", 45, 2.3);
        Driver driver2 = new Driver("Petya", "Krush", 33, 1.9);
        Driver driver3 = new Driver("Anatoliy", "Ovaluch", 29, 3.8);
        Driver driver4 = new Driver("Pavlo", "Karach", 26, 3.0);
        cars.add(new Car(1, "toyota", driver1));
        cars.add(new Car(2, "honda", driver2));
        cars.add(new Car(3, "porsche", driver3));
        cars.add(new Car(4, "mercedes", driver4));
        cars.add(new Car(5,"nisan","Kokos","Kainter", 67, 9.3));
        cars.add(new Car(6, "infiniti", "Oleg", "Serkhio", 43, 3.4));
        cars.add(new Car(7,"mitsubisi","Roman", "Prusak", 37,3.0));
        cars.add(new Car(8, "tesla", "Andriy", "Markiv", 44, 4.3));
        cars.add(new Car(9, "renault", "Petro", "Oletruk", 31, 2.1));
        cars.add(new Car(10, "voltwagen", "Lubomyr", "Korchun", 54, 2.7));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }


    }
}
