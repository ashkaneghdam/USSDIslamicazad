public class ClassRoom {
    private int classNumber;
    private int chairAvailble;
    private String courseName;
    private String teacherName;
    private int startTime;
    private int endTime;


    public ClassRoom(int classNumber, int chairAvailble, String courseName, String teacherName, int startTime, int endTime) {
        this.classNumber = classNumber;
        this.chairAvailble = chairAvailble;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void checkClass(int classNumber) {
        if (classNumber < 0 && classNumber >= 100) {
            System.out.println("این کلاس وجود ندارد");

        } else if (classNumber > 100 && classNumber <= 120) {
            System.out.println("این کلاس در طبقه ی اول می باشد");
        } else if (classNumber > 120 && classNumber < 200) {
            System.out.println("این کلاس وجود ندارد");
        } else if (classNumber > 200 && classNumber <= 220) {
            System.out.println("این کلاس در طبقه ی دوم می باشد ");
        } else if (classNumber > 220 && classNumber < 300) {
            System.out.println("این کلاس وجود ندارد");
        } else if (classNumber > 300 && classNumber <= 320) {
            System.out.println("این کلاس در طبقه ی سوم می باشد");
        } else if (classNumber > 320 && classNumber < 400) {
            System.out.println("این کلاس وجود ندارد");
        } else if (classNumber > 400 && classNumber <= 420) {
            System.out.println("این کلاس در طبقه ی چهارم می باشد");
        } else {
            System.out.println("این کلاس وجود ندارد");
        }
    }


    public int getClassNumber() {
        return classNumber;
    }

    public int getChairAvailble() {
        return chairAvailble;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
