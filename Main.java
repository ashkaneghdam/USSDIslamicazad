import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Register entekhabVahed = new Register("Computer");
    private static Graduation graduation = new Graduation("Pardis");
    private static Dute dute = new Dute("fareghotahsili");
//    private static Student student = new Student("Mohammad Reza Eghdam", "943269142");
    private static ConnectintWhitTeacher ctt = new ConnectintWhitTeacher("pardis's teachers");
    private static ConnectingWithEmploy cte = new ConnectingWithEmploy("pardis's employs");
    private static Random randomNumber = new Random();
    private static Bank bank = new Bank("Iran Centeral Bank");
//    private static Branch branch = new Branch("ملی");
    private static UniBildings uniBildings = new UniBildings("Mohandesi", new ClassRoom(201, 30, "zaban", "falahi", 8, 11),
            new BildingManger("Mohandesi", "Shaigan", "Tavakol", "razavi", "majidi", "Fathi"));


    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("به دانشگاه آزاد پردیس شیراز خوش آمدید");
        boolean quite = true;
        while (quite) {
            System.out.println("منوی مورد نظر را انتخاب کنید");
            printAddActions();
            int getInput = input.nextInt();
            input.nextLine();
            switch (getInput) {
                case 1:
                    System.out.println("منوی آموزش:");
                    System.out.println("1.انتخاب واحد");
                    System.out.println("2.فارغ التحصیلی");
                    System.out.println("3.نظام وظیفه");
                    int choise = input.nextInt();
                    input.nextLine();
                    switch (choise) {
                        case 1:
                            System.out.println("1.زمان های انتخاب واحد");
                            System.out.println("2.در خواست تمدید زمان");
                            System.out.println("3.برگشت به منوی قبل");
                            System.out.println("منوی مورد نظر را انتخاب کنید");
                            int amozeshChoise = input.nextInt();
                            input.nextLine();
                            switch (amozeshChoise) {
                                case 1:
                                    registerRequerst();
                                    break;
                                case 2:
                                    addRequestRegisterTime();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("1.انتخاب واحد");
                                    System.out.println("2.فارغ التحصیلی");
                                    System.out.println("3.نظام وظیفه");
                                    break;
                            }
                            break;


                        case 2:
                            System.out.println("منوی فارغ التحصیلی:");
                            System.out.println("1.ثبت در خواست");
                            System.out.println("2.خذف در خواست");
                            System.out.println("3.ویرایش در خواست");
                            System.out.println("4.مدارک مورد نیاز");
                            System.out.println("5.بازگشت به منوی قبل");
                            System.out.println("منوی مورد نظر را انتخاب کنید");
                            int graduationAction = input.nextInt();
                            input.nextLine();
                            switch (graduationAction) {
                                case 1:
                                    graduationRequest();
                                    break;
                                case 2:
                                    removeRequest();
                                    break;
                                case 3:
                                    updateRequest();
                                    break;
                                case 4:
                                    showDoc();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("منوی فارغ التحصیلی:");
                                    System.out.println("1.ثبت در خواست");
                                    System.out.println("2.خذف در خواست");
                                    System.out.println("3.ویرایش در خواست");
                                    System.out.println("4.مدارک مورد نیاز");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("منوی نظام وظیفه");
                            System.out.println("1.درخواست نظام وظیفه");
                            System.out.println("2.خذف درخواست");
                            System.out.println("3.ویرایش درخواست");
                            System.out.println("4.نمایش درخواست");
                            System.out.println("5.بازگشت");
                            int duteChoise = input.nextInt();
                            input.nextLine();
                            switch (duteChoise) {
                                case 1:
                                    addDuteRequest();
                                    break;
                                case 2:
                                    removeDuteRequest();
                                    break;
                                case 3:
                                    updateDuteRequest();
                                    break;
                                case 4:
                                    showDuteDoc();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("1.درخواست نظام وظیفه");
                                    System.out.println("2.خذف درخواست");
                                    System.out.println("3.ویرایش درخواست");
                                    System.out.println("4.نمایش درخواست");
                                    System.out.println("5.بازگشت");
                                    break;
                            }

                    }
                    break;


                case 2:
                    System.out.println("منوی پرداخت و رزرو");
                    System.out.println("1.پرداخت شهریه");
                    System.out.println("2.میزان شهریه");
                    System.out.println("3.بازگشت");
                    int tutionChoice = input.nextInt();
                    input.nextLine();
                    switch (tutionChoice) {
                        case 1:
                            bankingSysyem();
                            break;
                        case 2:
                            showTution();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("منوی پرداخت و رزرو");
                            System.out.println("1.پرداخت شهریه");
                            System.out.println("2.میزان شهریه");
                            System.out.println("3.بازگشت");
                    }
                    break;
                case 3:
                    System.out.println("منوی ساختمان ها");
                    System.out.println("1.وظعیت کلاس ها");
                    System.out.println("2.ساختمان ها");
                    System.out.println("3.برگشت");
                    System.out.println("یک گزینه را انتخاب کنید");
                    int getBildingChoise = input.nextInt();
                    input.nextLine();
                    switch (getBildingChoise) {
                        case 1:
                            System.out.println("منوی اطلاعات کلاس ها");
                            System.out.println("شماره ی کلاس مورد نظر خود را وارد کنید:");
                            int getClass = input.nextInt();
                            uniBildings.getClassRoom().checkClass(getClass);
                            break;
                        case 2:
                            System.out.println("منوی مدیران ساختمان ها");
                            System.out.println("1.مدیریت ساختمان");
                            System.out.println("2.معاون ساختمان");
                            System.out.println("3.انتظامات");
                            System.out.println("4.پشتیبانی");
                            System.out.println("5.مدیر آموزش");
                            System.out.println("6.بازگشت");
                            System.out.println("یک گزینه را انتخاب کنید:");
                            int getManagerChoice = input.nextInt();
                            input.nextLine();
                            switch (getManagerChoice) {
                                case 1:
                                    System.out.println(uniBildings.getBildingManger().getBildingManager());
                                    break;
                                case 2:
                                    System.out.println(uniBildings.getBildingManger().getAssisstingManager());
                                    break;
                                case 3:
                                    System.out.println(uniBildings.getBildingManger().getScurity());
                                    break;
                                case 4:
                                    System.out.println(uniBildings.getBildingManger().getSuport());
                                    break;
                                case 5:
                                    System.out.println(uniBildings.getBildingManger().getAmozeshManager());
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("منوی مدیران ساختمان ها");
                                    System.out.println("1.مدیریت ساختمان");
                                    System.out.println("2.معاون ساختمان");
                                    System.out.println("3.انتظامات");
                                    System.out.println("4.پشتیبانی");
                                    System.out.println("5.مدیر آموزش");
                                    System.out.println("6.بازگشت");
                                    System.out.println("یک گزینه را انتخاب کنید:");
                            }
                    }
                    break;
                case 4:
                    System.out.println("منوی ارسال نظر");
                    System.out.println("1.ارسال نظر برای اساتید");
                    System.out.println("2.ارسال نظر برای مسئولین");
                    System.out.println("یک گزینه را انتخاب کنید");
                    int connectChoice = input.nextInt();
                    input.nextLine();
                    switch (connectChoice) {
                        case 1:
                            System.out.println("منوی ارسال نظر برای اساتید:");
                            System.out.println("1.ثبت نظر");
                            System.out.println("2.حذف نظر");
                            System.out.println("3.ویرایش نظر");
                            System.out.println("4.چاپ");
                            System.out.println("5.بازگشت");
                            System.out.println("گزینه ی مورد نظر را انتخاب کنید:");
                            int teacherChoice = input.nextInt();
                            input.nextLine();
                            switch (teacherChoice) {
                                case 1:
                                    System.out.println("Ghahramani");
                                    System.out.println("Tousi");
                                    System.out.println("Shaigan");
                                    System.out.println("Yasrebi");
                                    System.out.println("یک استاد را وارد کنید:");
                                    String ostad = input.nextLine();
                                    switch (ostad.toLowerCase()) {
                                        case "ghahramani":
                                            CTTAddComment();
                                            break;
                                        case "tousi":
                                            CTTAddComment();
                                            break;
                                        case "shaigan":
                                            CTTAddComment();
                                            break;
                                        case "yasrebi":
                                            CTTAddComment();
                                            break;
                                        default:
                                            System.out.println("Ghahramani");
                                            System.out.println("Tousi");
                                            System.out.println("Shaigan");
                                            System.out.println("Yasrebi");
                                            System.out.println("یک استاد را وارد کنید:");
                                            break;
                                    }
                                    break;
                                case 2:
                                    CTTRemoveComment();
                                    break;
                                case 3:
                                    CTTUpdateComment();
                                    break;
                                case 4:
                                    CTTPrintAllComment();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("منوی ارتباط با اساتید:");
                                    System.out.println("1.ثبت نظر");
                                    System.out.println("2.حذف نظر");
                                    System.out.println("3.ویرایش نظر");
                                    System.out.println("4.چاپ");
                                    System.out.println("5.بازگشت");
                                    System.out.println("گزینه ی مورد نظر را انتخاب کنید:");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("منوی ارتباط با مسئولین:");
                            System.out.println("1.ثبت نظر");
                            System.out.println("2.حذف نظر");
                            System.out.println("3.ویرایش نظر");
                            System.out.println("4.چاپ");
                            System.out.println("5.بازگشت");
                            System.out.println("گزینه ی مورد نظر را انتخاب کنید:");
                            int employChoice = input.nextInt();
                            input.nextLine();
                            switch (employChoice) {
                                case 1:
                                    CTEAddComment();
                                    break;
                                case 2:
                                    CTERemoveComment();
                                    break;
                                case 3:
                                    CTEUpdateComment();
                                    break;
                                case 4:
                                    CTEPrintAllComment();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("منوی ارتباط با مسئولین:");
                                    System.out.println("1.ثبت نظر");
                                    System.out.println("2.حذف نظر");
                                    System.out.println("3.ویرایش نظر");
                                    System.out.println("4.چاپ");
                                    System.out.println("5.بازگشت");
                                    System.out.println("گزینه ی مورد نظر را انتخاب کنید:");
                                    break;
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("1.ارتباط با اساتید");
                            System.out.println("2.ارتباط با مسئولین");
                            System.out.println("یک گزینه را انتخاب کنید");
                            break;

                    }
                    break;
                case 10:
                    quite = false;
                    break;
                default:
                    printAddActions();
                    break;
            }
        }


    }

    private static void registerRequerst() {
        entekhabVahed.printRegisterTime();
        entekhabVahed.printAddAndRemoveTime();
    }

    private static void addRequestRegisterTime() {
        System.out.println("تعداد ساعت اضافی برای انتخاب واحد را وارد کنید:");
        int time = input.nextInt();
        entekhabVahed.requestTime(time);
        System.out.println("درخواست شما ثبت شد و در صورت تایید اضافه خواهد شد.");
    }

    private static void printAddActions() {
        System.out.println("1.منوی آموزش");
        System.out.println("2.منوی پرداخت ها و رزرو");
        System.out.println("3.منوی ساختمان ها");
        System.out.println("4.منوی ارتباط با استادید و مسئولان");
        System.out.println("10.خروج");

        System.out.println("یک گزینه را انتخاب کنید");
    }

    private static void graduationRequest() {
        System.out.println("نام و نام خانوادگی را وارد کنید:");
        String name = input.nextLine();
        System.out.println("شماره دانشجویی هود را وارد کنید");
        String studentNumber = input.nextLine();
        Student student = Student.addnewStudent(name, studentNumber);
        graduation.AddRequestAndStudent(student);
    }

    private static void removeRequest() {
        System.out.println("نام و نام خانوادگی خود را وارد کنید");
        String name = input.nextLine();
        graduation.removeRequest(name);
    }

    private static void updateRequest() {
        System.out.println("نام و نام خانوادگی خود را وارد کنید");
        String oldname = input.nextLine();
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String oldNumber = input.nextLine();
        Student oldStudent = Student.addnewStudent(oldname, oldNumber);
        System.out.println("نام و نام خانوادگی خود را وارد کنید");
        String newName = input.nextLine();
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String newNumber = input.nextLine();
        Student newStudent = Student.addnewStudent(newName, newNumber);
        graduation.updateStudent(oldStudent, newStudent);

    }

    private static void showDoc() {
        graduation.showDoc();
    }

    private static void addDuteRequest() {
        System.out.println("نام و نام خانوادگی خود را وارد کنید:");
        String name = input.nextLine();
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String studentNumber = input.nextLine();
        Student students = Student.addnewStudent(name, studentNumber);
        dute.addStudentRequest(students);
    }

    private static void removeDuteRequest() {
        System.out.println("نام و نام خانوادگی خود را وارد کنید:");
        String name = input.nextLine();
        dute.removeRequest(name);
    }

    private static void updateDuteRequest() {
        System.out.println("نام و نام خانوادگی خود را وارد کنید:");
        String oldname = input.nextLine();
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String oldNumber = input.nextLine();
        Student oldStudent = Student.addnewStudent(oldname, oldNumber);
        System.out.println("نام و نام خانوادگی جدید خود را وارد کنید:");
        String newName = input.nextLine();
        System.out.println("شماره دانشجویی جدید خود را وارد کنید:");
        String newNumber = input.nextLine();
        Student newStudent = Student.addnewStudent(newName, newNumber);
        dute.updateStudent(oldStudent, newStudent);
    }

    private static void showDuteDoc() {
        dute.requestNeed();
    }

    private static void CTTAddComment() {
        System.out.println("شماره ی دانشجویی خود را وارد کنید");
        String studentNumber = input.nextLine();
        System.out.println("نظر خود را وارد کنید");
        String studentComment = input.nextLine();
        Comment comment = Comment.addnewComment(studentNumber, studentComment);
        ctt.addComment(comment);
    }

    private static void CTTRemoveComment() {
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String studentNumber = input.nextLine();
        ctt.removeComment(studentNumber);
    }

    private static void CTTUpdateComment() {
        System.out.println("شماره دانشجویی خود را وارد کنید:");
        String oldStudentNumber = input.nextLine();
        ctt.removeComment(oldStudentNumber);
        System.out.println("نظر خود را وارد کنید:");
        String studentComment = input.nextLine();
        Comment comment = Comment.addnewComment(oldStudentNumber,studentComment);
        ctt.addComment(comment);
        System.out.println("نظر جدید ثبت شد");
    }

    private static void CTTPrintAllComment() {
        ctt.printComment();
    }

    private static void CTEAddComment() {
        System.out.println("شماره دانشجویی خود را وارد کنید:");
        String studentNumber = input.nextLine();
        System.out.println("نظر خود را وارد کنید:");
        String studentComment = input.nextLine();
        Comment comment = Comment.addnewComment(studentNumber, studentComment);
        cte.addComment(comment);
    }

    private static void CTERemoveComment() {
        System.out.println("شماره ی دانشجویی خود را وارد کنید:");
        String studentNumber = input.nextLine();
        cte.removeComment(studentNumber);
    }

    private static void CTEUpdateComment() {
        System.out.println("شماره دانشجویی خود را وارد کنید");
        String oldStudentNumber = input.nextLine();
        System.out.println("نظر خود را وارد کنید:");
        String oldStudentComment = input.nextLine();
        System.out.println("نظر جدید خود را وارد کنید:");
        String newStudentNumber = oldStudentNumber;
        String newStudentComment = input.nextLine();
        Comment oldComment = Comment.addnewComment(oldStudentNumber, oldStudentComment);
        Comment newComment = Comment.addnewComment(newStudentNumber, newStudentComment);
        cte.updateComment(oldComment, newComment);
    }

    private static void CTEPrintAllComment() {
        cte.prinAllEmployComment();
    }

    private static void bankingSysyem() {

        System.out.println("1.ملی");
        System.out.println("2.ملت");
        System.out.println("3.سامان");
        System.out.println("بانک خود را انتخاب کنید:");
        String branchName = input.nextLine();
        bank.addBranch(branchName);
        System.out.println("شماره ی دانشجویی خود را وارد کنید:");
        String customerNumber = input.nextLine();
        int initialAmount = randomNumber.nextInt(1000) + 1;
        bank.addCustomer(branchName, customerNumber, initialAmount);
        System.out.println("رشته ی خود را وارد کنید:");
        String getCource = input.nextLine();
        int gettution = bank.showTution(getCource);
        if (bank.addCustomerTransaction(branchName, customerNumber, -gettution)) {
            System.out.println("پرداخت انجام شد");
        }

    }

    private static void showTution() {
        System.out.println("رشته ی خود را وارد کنید:");
        String cource = input.nextLine();
        bank.showTution(cource);

    }
}
