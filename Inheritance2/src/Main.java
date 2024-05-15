public class Main {


   public static void main(String[] args) {

   Instructor instructor = new Instructor();
   instructor.setId(1);
   instructor.setName("Hüsein");
   instructor.setPassword("1354652");
   instructor.setSalaryInformation("15000");

   Student student = new Student();
   student.setId(2);
   student.setName("James");
   student.setPassword("1354652");
   student.setCourse("Matematik");
   student.setClassInformation("High School");

   CustomerManager customerManager = new CustomerManager();
   customerManager.log(new StudentManager(student));
   customerManager.log(new InstructorManager(instructor));


    }
}