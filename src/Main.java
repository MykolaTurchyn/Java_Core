import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User(1, "Petya", "jbwcbuyyer@gmail.com",32,Gender.MALE,"js",3,"toyota",2004,250));
        users.add(new User(2, "Anna", "sdefvef@gmail.com",31,Gender.FEMALE,"js,java",3,"mazda",2014,129));
        users.add(new User(3, "Vasil", "nttrd@gmail.com",22,Gender.MALE,"java",3,"volvo",2009,257));
        users.add(new User(4, "Olena", "sferv@gmail.com",14,Gender.FEMALE,"html",3,"lada",2008,350));
        users.add(new User(5, "Vova", "ynyujy@gmail.com",52,Gender.MALE,"css",3,"moskvich",2013,255));
        users.add(new User(6, "Mariya", "crwgt@gmail.com",33,Gender.FEMALE,"php",3,"yamaha",2012,350));
        users.add(new User(7, "Pavlo", "cyh4wc@gmail.com",43,Gender.MALE,"html,js",3,"VW",2011,230));
        users.add(new User(8, "Anastasiya", "cbtrbce@gmail.com",74,Gender.FEMALE,"css,react",3,"mitsubisi",2024,220));
        users.add(new User(9, "Andriy", "ctnyrjmu@gmail.com",81,Gender.MALE,"angular",3,"honda",2042,120));
        users.add(new User(10, "Olga", "ukuy@gmail.com",19,Gender.FEMALE,"vue",3,"audi",2006,200));
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if(next.getGender() == Gender.MALE){
                iterator.remove();
            }
        }
        System.out.println(users);
    }
}
