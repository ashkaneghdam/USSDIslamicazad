import java.util.ArrayList;

public class Dute {
    private String name;
    private ArrayList<Student> studentsRequest;

    public Dute(String name) {
        this.name = name;
        this.studentsRequest = new ArrayList<>();
    }

    public boolean addStudentRequest(Student student) {
        if (findStudent(student.getName()) >= 0) {
            System.out.println("این دانشجو قبلا درخواست داده است!");
            return false;
        }

        studentsRequest.add(student);
        System.out.println("درخواست ثبت شد");
        return true;
    }

    public boolean removeRequest(String student) {
        int position = findStudent(student);
        if (position >= 0) {
            studentsRequest.remove(position);
            System.out.println("دانشجو حذف شد!");
            return true;
        }
        System.out.println("دانشجو پیدا نشد!");
        return false;
    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        int position = findStudent(oldStudent);
        if (position >= 0) {
            studentsRequest.set(position, newStudent);
            System.out.println("دانشجو ویرایش شد");
            return true;
        }

        System.out.println("دانشجو ویرایش نشد!");
        return false;
    }
    public void requestNeed(){
        System.out.println("4 قطعه عکس \n 2 کپی شناسنمامه از تمام صفحات \n  کارت پایان خدمت");
    }

    private int findStudent(Student student) {
        return studentsRequest.indexOf(student);
    }
    private int findStudent(String name){
        for (int i = 0; i <studentsRequest.size();i++){
            if (studentsRequest.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentsRequest() {
        return studentsRequest;
    }
}

