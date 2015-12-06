/* Isaac Wismer
 * 
 */
package data;

public class Question {

    String ques;
    String[] answers;
    int correct;

    public Question(String ques, String[] answers, int correct) {
        this.ques = ques;
        this.answers = answers;
        this.correct = correct;
    }

    public String getQues() {
        return ques;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrect() {
        return correct;
    }

    public String getIndAnswer(int i) {
        return answers[i];
    }
}
