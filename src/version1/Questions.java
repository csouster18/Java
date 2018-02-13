import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by u1756204 on 06/02/2018.
 */
public class Questions extends ArrayList{
    private String question;
    private String[] wrongAnswer;
    private String answer;
    private String category;

    public Questions(String question, String[] wrongAnswer, String answer, String category) {
        this.question = question;
        this.wrongAnswer = wrongAnswer;
        this.answer = answer;
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(String[] wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String displayquestion(){
        return String.format("Question: %-100s Category: %-20s Answer: %-50s Wrong answers: %-150s",this.question,
                this.category, this.answer, this.wrongAnswer);

    }
    public ArrayList listQuestions(){
        //adds all questions to an arraylist from a text file



        ArrayList<Questions> questions = new ArrayList<>();

        questions.add(new Questions("what is 9 + 10?", new String[]{"20", "19", "50000000"}, "21",
                    "Math")); //adding and creating a question in the same line

        questions.add((new Questions("Solve p=np?", new String[]{"1", "2", "3"}, "Not in your lifetime bro",
                    "Math")));

        questions.add((new Questions("What is your name?", new String[]{"", "", ""}, "my name jeff",
                
        return questions;
    }
     public void getQuestions(String type){
    //selects a question from the arraylist with the category inserted
     }


    public static void main(String[] args) {

    }
}
