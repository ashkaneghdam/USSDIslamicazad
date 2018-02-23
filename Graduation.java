import java.util.ArrayList;

public class Graduation {
    private String name;
    private ArrayList<Student> students;

    public Graduation(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    private int findStudent(Student Student) {
        return students.indexOf(Student);
    }

    private int findStudent(String studentNumber) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(studentNumber)){
                return i;
            }
        }
        return -1;
    }

    public boolean AddRequestAndStudent(Student student) {
        if (findStudent(student.getStudentNumber()) >= 0) {
            System.out.println("این دانشجو موجود است! در خواست ثبت شد.");
            return false;
        }
        students.add(student);
        System.out.println("دانشجو اضافه شد!");
        return true;
    }

    public boolean removeRequest(String studentName) {
        int position = findStudent(studentName);
        if (position >= 0) {
            students.remove(position);
            System.out.println("دانشجو خذف شد!");
            return true;
        }

        System.out.println("داشنجو پیدا نشد!");
        return false;
    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        int position = findStudent(oldStudent);

        if (position < 0) {
            System.out.println("دانشجو وجود ندارد");
            return false;
        }

        students.set(position, newStudent);
        System.out.println("دانشجو ویرایش شد.");
        return true;
    }

    public void showDoc() {
        System.out.println("4 قطعه عکس \n 2 کپی شناسنمامه از تمام صفحات \n  کارت پایان خدمت");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
