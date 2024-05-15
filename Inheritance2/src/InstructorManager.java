public class InstructorManager extends UserManager{
    private Instructor instructor;
    public InstructorManager(Instructor instructor) {
        this.instructor = instructor;
    }
    public void add() {
        System.out.println("Öğrenci eklendi"+ " "+instructor.getId()+ " " +instructor.getName()
                +" "+ instructor.getPassword()+" "+instructor.getSalaryInformation());

    }
}
