package demo2;

public class User implements Comparable<User> {
    int id;
    int age;
    String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
//    // // // name-
//    @Override
//    public int compareTo(User o) {
//        return o.name.length() - this.name.length();
//    }
//
    // // //name+
    @Override
    public int compareTo(User o) {
        return this.name.length() - o.name.length();
    }

    // // // age+
//    @Override
//    public int compareTo(User o) {
//        return this.age - o.age;
//    }
    // // // age-
//    @Override
//    public int compareTo(User o) {
//        return o.age - this.age;
//    }
}
