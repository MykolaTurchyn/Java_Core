package demo2;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1,11, "A"));
        users.add(new User(2,21, "AB"));
        users.add(new User(3,43, "ABC"));
        users.add(new User(4,54, "ABCD"));
        users.add(new User(5,26, "ABCDE"));
        users.add(new User(6,14, "ABCDEF"));
        users.add(new User(7,12, "ABCDEFG"));


        System.out.println(users);
    }
}
