import java.util.ArrayList;

public class ConnectingWithEmploy {
    private String name;
    private ArrayList<Comment> comments;

    public ConnectingWithEmploy(String name) {
        this.name = name;
        this.comments = new ArrayList<>();
    }

    private int findComment(Comment comment) {
        return comments.indexOf(comment);
    }

    private int findComment(String studentNumber) {
        for (int i = 0; i < comments.size(); i++) {
            if (comments.get(i).getStudentNumber().equals(studentNumber)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addComment(Comment comment) {

        if (findComment(comment.getStudentNumber()) >= 0) {
            System.out.println("شما قبلا نظر وارد کرده اید! لطفا از منوی ویرایش استفاده کنید");
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
        System.out.println("نظری پیدا نشد!");
        return false;
    }

    public boolean updateComment(Comment oldComment, Comment newComment) {
        int position = findComment(oldComment.getStudentNumber());
        if (position >= 0) {
            comments.set(position, newComment);
            System.out.println("نظر تغییر یافت");
            return true;
        }

        System.out.println("نظری پیدا نشد!");
        return false;
    }

    public void prinAllEmployComment() {
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
}
