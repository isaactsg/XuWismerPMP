/** Isaac Wismer & Andrew Xu
 * 
 */
package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<Question> questions = new ArrayList<>();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        frameQuestions.setLocationRelativeTo(null);
        frameQuiz.setLocationRelativeTo(null);
        frameNotes.setLocationRelativeTo(null);
        try {
            readQuestions();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.toString());
        }
        frameQuiz.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameQuiz = new javax.swing.JFrame();
        frameNotes = new javax.swing.JFrame();
        frameQuestions = new javax.swing.JFrame();

        javax.swing.GroupLayout frameQuizLayout = new javax.swing.GroupLayout(frameQuiz.getContentPane());
        frameQuiz.getContentPane().setLayout(frameQuizLayout);
        frameQuizLayout.setHorizontalGroup(
            frameQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameQuizLayout.setVerticalGroup(
            frameQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameNotesLayout = new javax.swing.GroupLayout(frameNotes.getContentPane());
        frameNotes.getContentPane().setLayout(frameNotesLayout);
        frameNotesLayout.setHorizontalGroup(
            frameNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameNotesLayout.setVerticalGroup(
            frameNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameQuestionsLayout = new javax.swing.GroupLayout(frameQuestions.getContentPane());
        frameQuestions.getContentPane().setLayout(frameQuestionsLayout);
        frameQuestionsLayout.setHorizontalGroup(
            frameQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameQuestionsLayout.setVerticalGroup(
            frameQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method reads the questions for the multiple choice quiz from a text
     * file and places them into an arraylist of questions
     * @throws IOException If something goes wrong in the process of importing
     */
    public void readQuestions() throws IOException {
        //create a scanner to read the file
        //This allows us to read the file in a JAR file
        Scanner s = new Scanner(GUI.class.getResourceAsStream("questions.txt"));
        //loop while not at the end of the file
        while (s.hasNextLine()) {
            //read the question information
            String ques = s.nextLine();
            //System.out.println(ques);
            String[] answers = new String[4];
            for (int i = 0; i < 4; i++) {
                answers[i] = s.nextLine();
                //System.out.println(answers[i]);
            }
            int correct = Integer.parseInt(s.nextLine());
            //add to the array list
            questions.add(new Question(ques, answers, correct));
            System.out.println(questions.get(questions.size() - 1).toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame frameNotes;
    private javax.swing.JFrame frameQuestions;
    private javax.swing.JFrame frameQuiz;
    // End of variables declaration//GEN-END:variables
}
