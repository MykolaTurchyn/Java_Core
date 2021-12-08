package part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human(1, "Vasya", "Kosovych", 12, Gender.Male));
        humans.add(new Human(2, "Petya", "Sakosov", 14, Gender.Male));
        humans.add(new Human(3, "Olena", "Trukas", 19, Gender.Female));
        humans.add(new Human(4, "Anna", "Govorko", 37, Gender.Female));
        humans.add(new Human(5, "Oleg", "Petkov", 23, Gender.Male));
        humans.add(new Human(6, "Mykola", "Petrov", 19, Gender.Male));
        humans.add(new Human(7, "Olena", "Papayana", 16, Gender.Female));
        humans.add(new Human(8, "Sergiy", "Kozin", 20, Gender.Male));
        humans.add(new Human(9, "Pavlo", "Loshakov", 2, Gender.Male));
        humans.add(new Human(10, "Misha", "Pavlyshyn", 19, Gender.Male));

        for (Human human : humans) {
            System.out.println(human);
        }

        //or

        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));

        }
    }
}
