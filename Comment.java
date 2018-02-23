import java.util.ArrayList;

public class Comment {

    private String studentNumber;
    private String studentComment;

    public Comment(String studentNumber, String studentComment) {
        this.studentNumber = studentNumber;
        this.studentComment = studentComment;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentComment() {
        return studentComment;
    }

    public static Comment addnewComment(String name, String studentComment) {
        return new Comment(name, studentComment);
    }
}
