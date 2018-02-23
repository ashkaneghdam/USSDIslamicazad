public class Register {
    private String reshteh;
    private String registerTime;
    private String addAndRemoveTime;
    private int requestTime;

    public Register(String reshteh) {
        this.reshteh = reshteh;
        this.registerTime = "21/10/96";
        this.addAndRemoveTime = "28/10/96";
        this.requestTime = 0;
    }

    public void printRegisterTime() {
        System.out.println(this.registerTime + "زمان انتخاب واحد برابر ");
    }

    public void printAddAndRemoveTime() {
        System.out.println(this.addAndRemoveTime + "زمان حذف و اضاف برابر ");
    }

    public void requestTime(int Time) {
        if (Time > 31 && Time < 0) {
            this.requestTime = Time;
        } else {
            this.requestTime = 0;
        }
    }

    public String getReshteh() {
        return reshteh;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public String getAddAndRemoveTime() {
        return addAndRemoveTime;
    }

    public int getRequestTime() {
        return requestTime;
    }
}
