package demo1;


// String = Агрегація і Композиція

public class Main {
    public static void main(String[] args) {
        // КОМПОЗИЦІЯ
//        Skill skill = new Skill("java", 1.4);
//        User user = new User(1, "vasya", skill);
//        User user1 = new User(2, "kokos", skill);
//
//        User user2 = new User(3, "petya", new Skill("js", 2.0));

        //АГРЕГАЦІЯ
        Developer developer = new Developer(1,"Vanya","js,java", 5.4);
    }
}
