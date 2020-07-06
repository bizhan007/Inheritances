import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    public Student(String name, String surname, String password) {
        super(name, surname, password);
    }

    public static void changeExam(ArrayList<ArrayList> questions,ArrayList<Admin> admins,ArrayList<int[]> answers){
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println(admins.toString());
        System.out.println("Choose a subject");
        String subject = in.nextLine();
        int index=0;
        for(int i=0;i<admins.size();i++){
            if(subject.equals(admins.get(i).getSubject())){
                index=i;
            }
        }
        System.out.println(questions.get(index));
        int answerStudent[] = new int[5];
        for(int i=0;i<5;i++){
            answerStudent[i]=in.nextInt();
        }
        System.out.println(checkAnswers(answerStudent,Menu.answers.get(index)));
        Menu.menu();
    }

    public static String checkAnswers(int[] studentAnswer,int[] rightAnswer){
        int count=0;
        for(int i=0;i<5;i++){
            if(studentAnswer[i]==rightAnswer[i]){
                count++;
            }
        }
        if(count>=3){
            return "You passed";
        }else{
            return  "You didn't pass";
        }
    }
}
