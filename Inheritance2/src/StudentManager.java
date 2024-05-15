public class StudentManager extends UserManager {
private Student student;

public StudentManager(Student student) {
    this.student = student;

}
    public void add(){
    System.out.println("Öğrenci eklendi"+ " "+ this.student.getId()+" "+ this.student.getName()
            + " "+this.student.getPassword()+" "+this.student.getClassInformation()+" "+this.student.getCourse());

    }
}
