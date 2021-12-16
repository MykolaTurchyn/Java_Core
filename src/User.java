import java.util.List;

public class User
//        implements Comparable<User>
{
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private Skill skills;
    private Car car;

    public User(int id, String name, String email, int age, Gender gender, String title, int exp, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = new Skill(title, exp);
        this.car = new Car(model, year, power);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//
//        User user = (User) o;
//
//        if (id != user.id) return false;
//        if (age != user.age) return false;
//        if (name != null ? !name.equals(user.name) : user.name != null) return false;
//        if (email != null ? !email.equals(user.email) : user.email != null) return false;
//        if (gender != user.gender) return false;
//        if (skills != null ? !skills.equals(user.skills) : user.skills != null) return false;
//        return car != null ? car.equals(user.car) : user.car == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + age;
//        result = 31 * result + (gender != null ? gender.hashCode() : 0);
//        result = 31 * result + (skills != null ? skills.hashCode() : 0);
//        result = 31 * result + (car != null ? car.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public int compareTo(User o) {
//        return this.id - o.id;
//    }
}
