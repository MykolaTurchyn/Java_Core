public class Animals {
    private String alias;
    private int age;
    private String typeOfAnimal;

    public Animals() {
    }

    public Animals(String alias, int age, String typeOfAnimal) {
        this.alias = alias;
        this.age = age;
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                '}';
    }
}
