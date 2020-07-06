import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    private String subject;

    public Admin(String name, String surname, String password,String subject) {
        super(name, surname, password);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static void addQuestion(ArrayList<ArrayList> question, ArrayList<int[]> answer){
        ArrayList<String> questions = new ArrayList<>();
        int answers[] = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            in.nextLine();
            System.out.println("Question number "+(i+1)+" :");
            String questionString = in.nextLine();
            System.out.println("First answer:");
            String firstAnswer = in.nextLine();
            System.out.println("Second answer:");
            String secondAnswer = in.nextLine();
            String answerString = "1)"+firstAnswer+"   2)"+secondAnswer;
            questions.add(questionString);
            questions.add(answerString);
            System.out.println("Right answer:");
            answers[i] = in.nextInt();
            questions.add("\n");
        }
        question.add(questions);
        answer.add(answers);
        Menu.adminMenu();
    }

    public static void addAdmin(ArrayList<Admin> admins){
        Scanner in =new Scanner(System.in);
        in.nextLine();
        System.out.println("Name:");
        String name = in.nextLine();
        System.out.println("Surname");
        String surname = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        System.out.println("Subject:");
        String subject = in.nextLine();
        Admin admin = new Admin(name,surname,password,subject);
        admins.add(admin);
        Menu.adminMenu();
    }

    public static void addStudent(ArrayList<Student> students){
        Scanner in =new Scanner(System.in);
        in.nextLine();
        System.out.println("Name:");
        String name = in.nextLine();
        System.out.println("Surname");
        String surname = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        Student student = new Student(name,surname,password);
        students.add(student);
        Menu.adminMenu();
    }

    @Override
    public String toString() {
        return "Admin " +
                "subject='" + subject + '\'' +
                " name='" + name + '\'' +
                " surname='" + surname + '\'' +
                " password='" + password + '\''+"\n";
    }
    
}
