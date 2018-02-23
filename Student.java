public class Student {
    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    public static Student addnewStudent(String name, String studentNumber){
        return new Student(name,studentNumber);
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}
