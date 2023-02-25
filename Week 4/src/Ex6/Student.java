package Ex6;

public class Student {

    public String firstname;
    public String lastname;
    public String student_id;
    public String address;

    public Student(){
        
    }
    public Student (String firstname , String lastname , String student_id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.student_id = student_id;

    }

    public Student (String firstname , String lastname , String student_id , String address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.student_id = student_id;
        this.address = address;
    }
    public void getInfo (){
        System.out.println("Student firstname is : " + firstname);
        System.out.println("Student lastname is : " + lastname);
        System.out.println("Student ID is : " + student_id);
        System.out.println("Student address is : " + address);
    }

    
}
