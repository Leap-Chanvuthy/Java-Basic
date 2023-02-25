package Ex6;
public class StudentExe {

    public static void main (String[] args){
        Student student1 = new Student();
        student1.firstname = "Thorn";
        student1.lastname = "dara";
        student1.student_id = "01";
        student1.address = "Phnom Penh";
        student1.getInfo();

        System.out.println("============================");

        Student student2 = new Student("Phal" , "Metrey" , "02" , "Phnom Penh");
        student2.getInfo();

        System.out.println("============================");

        Student student3 = new Student("Leap" , "Chanvuthy" , "03" , "Phnom Penh");
        student3.getInfo();
    }
    
}
