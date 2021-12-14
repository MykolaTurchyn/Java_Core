package demo5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Petya", 11, Gender.male));
        users.add(new User(2, "Anna", 21, Gender.female));
        users.add(new User(3, "Vasil", 14, Gender.male));
        users.add(new User(4, "Olena", 16, Gender.female));
        users.add(new User(5, "Vova", 19, Gender.male));
        users.add(new User(6, "Mariya", 15, Gender.female));
        users.add(new User(7, "Pavlo", 22, Gender.male));
        users.add(new User(8, "Anastasiya", 12, Gender.female));
        users.add(new User(9, "Andriy", 17, Gender.male));
        users.add(new User(10, "Olga", 10, Gender.female));

        System.out.println(users);

    }

}
