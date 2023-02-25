// Class Student inherits Human class and has data members and setter, getter methods, and constructors
public class Student extends Human {
    private int studentId;
    private String schoolName;
    private String skill;
    
    public Student(String name, int age, int studentId, String schoolName, String skill) {
        super(name, age);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.skill = skill;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    public void setSkill(String skill) {
        this.skill = skill;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public String getSkill() {
        return skill;
    }
}
