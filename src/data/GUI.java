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
        jPanel2 = new javax.swing.JPanel();
        rBtnChoice1 = new javax.swing.JRadioButton();
        rBtnChoice2 = new javax.swing.JRadioButton();
        rBtnChoice3 = new javax.swing.JRadioButton();
        rBtnChoice4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblMark = new javax.swing.JLabel();
        frameNotes = new javax.swing.JFrame();
        frameQuestions = new javax.swing.JFrame();
        btnGChoices = new javax.swing.ButtonGroup();
        btnStudy = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        frameQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGChoices.add(rBtnChoice1);
        rBtnChoice1.setText("Choice 1");

        btnGChoices.add(rBtnChoice2);
        rBtnChoice2.setText("Choice 2");

        btnGChoices.add(rBtnChoice3);
        rBtnChoice3.setText("Choice 3");

        btnGChoices.add(rBtnChoice4);
        rBtnChoice4.setText("Choice 4");

        btnNext.setText("Next Question");

        btnExit.setText("Exit");

        btnReset.setText("Reset");
        btnReset.setToolTipText("");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        txtQuestion.setText("Filler Text for the Question");
        txtQuestion.setEnabled(false);
        jScrollPane1.setViewportView(txtQuestion);

        lblMark.setText("0/10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBtnChoice1)
                            .addComponent(rBtnChoice2)
                            .addComponent(rBtnChoice3)
                            .addComponent(rBtnChoice4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMark)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark))
                .addGap(18, 18, 18)
                .addComponent(rBtnChoice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBtnChoice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBtnChoice3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBtnChoice4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnExit)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        javax.swing.GroupLayout frameQuizLayout = new javax.swing.GroupLayout(frameQuiz.getContentPane());
        frameQuiz.getContentPane().setLayout(frameQuizLayout);
        frameQuizLayout.setHorizontalGroup(
            frameQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQuizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameQuizLayout.setVerticalGroup(
            frameQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQuizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        btnStudy.setText("Study the Notes!");

        btnQuiz.setText("Take the Quiz!");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStudy)
                    .addComponent(btnQuiz)
                    .addComponent(jButton1))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnStudy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(194, Short.MAX_VALUE))
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
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGChoices;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStudy;
    private javax.swing.JFrame frameNotes;
    private javax.swing.JFrame frameQuestions;
    private javax.swing.JFrame frameQuiz;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMark;
    private javax.swing.JRadioButton rBtnChoice1;
    private javax.swing.JRadioButton rBtnChoice2;
    private javax.swing.JRadioButton rBtnChoice3;
    private javax.swing.JRadioButton rBtnChoice4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
