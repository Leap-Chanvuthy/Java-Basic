public class Human {
    // Class Human with private data members and setter, getter methods, and constructors
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
