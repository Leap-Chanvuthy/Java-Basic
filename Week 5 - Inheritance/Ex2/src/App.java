public class App {
    public static void main(String[] args) throws Exception {
        Human h1 = new Human("John", 30);
        System.out.println("Human: " + h1.getName() + " " + h1.getAge());
        
        Student s1 = new Student("Jane", 20, 1234, "ABC School", "Programming");
        System.out.println("Student: " + s1.getName() + " " + s1.getAge() + " " + s1.getStudentId() + " " + s1.getSchoolName() + " " + s1.getSkill());
    }
}
