public class Student extends User{
    private String classInformation;
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClassInformation() {
        return classInformation;
    }

    public void setClassInformation(String classInformation) {
        this.classInformation = classInformation;
    }
}
