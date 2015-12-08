/* Isaac Wismer
 * This is a class for a question. It contains the question, 4 multiple choice
 * answers and the correct answer
 */
package data;

/**
 *
 * @author Isaac
 */
public class Question {

    String ques;
    String[] answers;
    int correct;

    /**
     * This is the constructor for the question.
     *
     * @param ques the question asked as a string
     * @param answers the answers as an array
     * @param correct the correct answer as an int (A = 0, D = 3)
     */
    public Question(String ques, String[] answers, int correct) {
        this.ques = ques;
        this.answers = answers;
        this.correct = correct;
    }

    /**
     * Returns the question asked
     *
     * @return the question as a String
     */
    public String getQues() {
        return ques;
    }

    /**
     * Returns all the possible answers as an array of strings
     *
     * @return all the possible answers as an array of string (size 4)
     */
    public String[] getAnswers() {
        return answers;
    }

    /**
     * returns the index of the correct answer
     *
     * @return the index of the correct answer as an integer
     */
    public int getCorrect() {
        return correct;
    }

    /**
     * returns a specific answer
     *
     * @param i the index of the answer as an int (0-3, inclusive)
     * @return the answer at index i as a string
     */
    public String getIndAnswer(int i) {
        return answers[i];
    }

    @Override
    public String toString() {
        return ques + "\nA)" + answers[0] + "\nB)" + answers[1] + "\nC)" + answers[2] + "\nD)" + answers[3] + "\nCorrect Answer: " + (char) (correct + 65);
    }

    /**
     * determines if 2 questions are the same
     *
     * @param q the question to compare to this question
     * @return true if they are the same, false if not
     */
    public boolean equals(Question q) {
        if (this == q) {
            return true;
        }
        if (q == null) {
            return false;
        }
        if (!this.ques.equals(q.getQues())) {
            return false;
        }
        if (this.correct != q.getCorrect()) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (!this.answers[i].equals(q.getIndAnswer(i))) {
                return false;
            }
        }
        return true;
    }

}
