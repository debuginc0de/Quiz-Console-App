package QN_console_App;

public class main{
    public static void main(String[] args) {
        QuestionService Service=new QuestionService();
        Service.playQuiz();
        Service.printScore();
    }
}