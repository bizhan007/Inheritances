import javax.print.attribute.standard.NumberUpSupported;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    static ArrayList<ArrayList> questions = new ArrayList<>();
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<int[]> answers = new ArrayList<>();
    public static void menu(){
        System.out.println("Admin    [1]");
        System.out.println("Student  [2]");
        System.out.println("Exit     [3]");
        int num = in.nextInt();
        switch (num){
            case 1: checkAdmin();break;
            case 2: checkStudent();break;
            case 3: break;
            default: menu();
        }
    }

    public static void checkAdmin(){
        Admin admin_1 = new Admin("1","1","1","1");
        in.nextLine();
        System.out.println("Name:");
        String name = in.nextLine();
        System.out.println("Surname");
        String surname = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        System.out.println("Subject:");
        String subject = in.nextLine();
        boolean sel_1 = name.equals(admin_1.getName())&&surname.equals(admin_1.getSurname())&&password.equals(admin_1.getPassword())&&subject.equals(admin_1.getSubject());
        boolean sel_2 = false;
        for(int i=0;i<admins.size();i++){
            if(name.equals(admins.get(i).getName())&&surname.equals(admins.get(i).getSurname())&&password.equals(admins.get(i).getPassword())&&subject.equals(admins.get(i).getSubject())){
                sel_2 = true;
            }
        }
        if(sel_1||sel_2){
            adminMenu();
        }
    }

    public static void adminMenu(){
        System.out.println("Add student [1]");
        System.out.println("Add admin   [2]");
        System.out.println("Add test    [3]");
        System.out.println("Menu        [4]");
        int num = in.nextInt();
        switch (num){
            case 1:Admin.addStudent(students);break;
            case 2:Admin.addAdmin(admins);break;
            case 3:Admin.addQuestion(questions,answers);break;
            case 4:menu();break;
        }
    }

    public static void checkStudent(){
        in.nextLine();
        System.out.println("Name:");
        String name = in.nextLine();
        System.out.println("Surname");
        String surname = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        boolean sel = false;
        for(int i=0;i<students.size();i++){
            if(name.equals(students.get(i).getName())&&surname.equals(students.get(i).getSurname())&&password.equals(students.get(i).getPassword())){
                sel = true;
            }
        }
        if(sel){
            studentMenu();
        }
    }

    public static void studentMenu(){
        System.out.println("Go to the exam: \n 1)Yes   2)No");
        int num = in.nextInt();
        switch (num){
            case 1: Student.changeExam(questions, admins,answers); break;
            case 2: break;
        }
    }
}
