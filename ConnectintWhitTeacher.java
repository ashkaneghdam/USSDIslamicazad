import java.util.ArrayList;

public class ConnectintWhitTeacher {

    private String name;
    private ArrayList<Comment> comments;

    public ConnectintWhitTeacher(String name) {
        this.name = name;
        this.comments = new ArrayList<>();
    }

    public boolean addComment(Comment comment) {
        if (findComment(comment.getStudentNumber()) >= 0) {
            System.out.println("شما قبلا نظر اضافه کرده اید! لطفا از منوی ویرایش استفاده کنید");
            return false;
        }

        comments.add(comment);
        return true;
    }

    public boolean removeComment(String studentNumber) {
        int position = findComment(studentNumber);
        if (position >= 0) {
            comments.remove(position);
            System.out.println("نظر حذف شد!");
            return true;

        }

        System.out.println("نظر پیدا نشد!");
        return false;
    }

    public boolean updateComment(Comment oldComent, Comment newComment) {
        int position = findComment(oldComent.getStudentNumber());
        if (position >= 0) {
            comments.set(position, newComment);
            System.out.println("نظر تغییر کید");
            return true;
        }

        System.out.println("نظر تغییر نکرد");
        return false;
    }

    public void printComment() {
        for (int i = 0; i < comments.size(); i++) {
            System.out.println(comments.get(i).getStudentNumber() + " --> " + comments.get(i).getStudentComment());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    private int findComment(String studentNumber) {
        for (int i = 0; i < comments.size(); i++) {
            if (comments.get(i).getStudentNumber().equals(studentNumber)) {
                return i;
            }
        }

        return -1;
    }

    private int findComment(Comment comment) {
        return comments.indexOf(comment);
    }
}
