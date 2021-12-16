package demo4;

import java.util.ArrayList;
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

//          // // // парні  id
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            int id = next.getId();
//            if (id % 2 == 0) {
//                System.out.println(next);
//            }


//        // // // непарні id
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getId() % 2 != 0) {
//                System.out.println(next);
//            }
//        }

//        // // // name>5
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getName().length() > 5) {
//                System.out.println(next);
//            }
//        }

//        // // //  Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getGender() == Gender.female) {
//                System.out.println(next);
//            }
//        }



    }

}
