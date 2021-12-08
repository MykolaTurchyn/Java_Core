package part3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SuperCar> cars = new ArrayList<>();
        cars.add(new SuperCar("Mazda", "mazda-company", 2014, "mx-5", 2.0, 300));
        cars.add(new SuperCar("Porsche", "porsche-company", 2016, "911", 2.5, 279));
        cars.add(new SuperCar("Alpine", "alpine-company", 2017, "a-110", 2.5, 295));
        cars.add(new SuperCar("Porsche", "porsche-company", 2015, "718", 2.0, 296));
        cars.add(new SuperCar("BMW", "bmw-company", 2019, "m3/m4", 2.5, 229));
        cars.add(new SuperCar("McLaren", "mc-laren-company", 2018, "720s", 2.4, 311));
        cars.add(new SuperCar("BMW", "bmw-company", 2020, "M2 Competition", 2.5, 329));
        cars.add(new SuperCar("Toyota", "toyota-company", 2018, "GR Supra", 2.5, 319));
        cars.add(new SuperCar("Ford", "ford-company", 2019, "Mustang", 3.0, 333));
        cars.add(new SuperCar("Nissan", "nissan-company", 2019, "GT-R", 2.9, 323));
        for (SuperCar car : cars) {
            System.out.println(car);
        }

    }
}
