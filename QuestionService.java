package QN_console_App;

import java.util.Scanner;

public class QuestionService {
    Question[] question=new Question[5];
    String selection[]=new String[5];

    public QuestionService(){
        question[0]=new Question(1,"Size of Integer","2","6","4","8","4");
        question[1]=new Question(1,"Size of Double","2","6","4","8","8");
        question[2]=new Question(1,"Size of Character","2","6","4","8","2");
        question[3]=new Question(1,"Size of Long","2","6","4","8","8");
        question[4]=new Question(1,"Size of Boolean","1","6","4","8","1");
    }

    public void playQuiz(){
        int i=0;
        for(Question q:question){
            System.out.println("Question No. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine();
            i++;

        }
        for(String s:selection){
            System.out.println(s);
        }

    }
    public void printScore(){
        int score=0;
        for(int i=0;i<question.length;i++){
            Question que=question[i];
            String Actualanswer=que.getAnswer();
            String UserAnswer=selection[i];
            if(Actualanswer.equals(UserAnswer)){
                score++;
            }
        }
        System.out.println("Your Score Is: "+score);

    }

}
