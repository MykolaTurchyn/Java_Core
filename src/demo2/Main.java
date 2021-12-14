package demo2;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1,11, "Dima"));
        users.add(new User(2,21, "Pavlo"));
        users.add(new User(3,43, "Sasha"));
        users.add(new User(4,54, "Katya"));
        users.add(new User(5,26, "Sergiy"));
        users.add(new User(6,14, "Denys"));
        users.add(new User(7,12, "Petro"));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
        }
    }
}
