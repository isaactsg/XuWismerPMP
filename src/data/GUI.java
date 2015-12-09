/**
 * Isaac Wismer & Andrew Xu
 * This is the GUI for the review program
 * It has review material, a quiz and a way to review the questions
 *
 */
package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<Question> questions = new ArrayList<>();
    int currentQuestion, quizScore;
    int[] quizQuestions;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        frameQuiz.setLocationRelativeTo(null);
        frameNotes.setLocationRelativeTo(null);
        rbHidden.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        rbHidden = new javax.swing.JRadioButton();
        frameNotes = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taReview = new javax.swing.JTextArea();
        btnGChoices = new javax.swing.ButtonGroup();
        btnStudy = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblPrompt = new javax.swing.JLabel();
        btnExitMenu = new javax.swing.JButton();

        frameQuiz.setTitle("Quiz");
        frameQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameQuiz.setMinimumSize(new java.awt.Dimension(469, 335));
        frameQuiz.setResizable(false);

        btnGChoices.add(rBtnChoice1);
        rBtnChoice1.setText("Choice 1");
        rBtnChoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnChoice1ActionPerformed(evt);
            }
        });

        btnGChoices.add(rBtnChoice2);
        rBtnChoice2.setText("Choice 2");
        rBtnChoice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnChoice2ActionPerformed(evt);
            }
        });

        btnGChoices.add(rBtnChoice3);
        rBtnChoice3.setText("Choice 3");
        rBtnChoice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnChoice3ActionPerformed(evt);
            }
        });

        btnGChoices.add(rBtnChoice4);
        rBtnChoice4.setText("Choice 4");
        rBtnChoice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnChoice4ActionPerformed(evt);
            }
        });

        btnNext.setText("Next Question");
        btnNext.setEnabled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setToolTipText("");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        txtQuestion.setText("Filler Text for the Question");
        txtQuestion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtQuestion);

        lblMark.setText("0/10");

        jLabel1.setText("Score");

        jLabel2.setText("Question:");

        lblQuestion.setText("1 of 10");

        btnGChoices.add(rbHidden);
        rbHidden.setText("jRadioButton1");
        rbHidden.setEnabled(false);
        rbHidden.setFocusable(false);
        rbHidden.setHideActionText(true);
        rbHidden.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMark)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblQuestion))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBtnChoice1)
                            .addComponent(rBtnChoice2)
                            .addComponent(rBtnChoice3)
                            .addComponent(rBtnChoice4)
                            .addComponent(rbHidden))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rBtnChoice1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnChoice2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnChoice3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBtnChoice4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMark)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(lblQuestion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbHidden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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

        frameNotes.setTitle("Review");
        frameNotes.setMinimumSize(new java.awt.Dimension(731, 502));

        taReview.setEditable(false);
        taReview.setColumns(20);
        taReview.setLineWrap(true);
        taReview.setRows(5);
        jScrollPane2.setViewportView(taReview);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameNotesLayout = new javax.swing.GroupLayout(frameNotes.getContentPane());
        frameNotes.getContentPane().setLayout(frameNotesLayout);
        frameNotesLayout.setHorizontalGroup(
            frameNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameNotesLayout.setVerticalGroup(
            frameNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(509, 412));

        btnStudy.setFont(new java.awt.Font("3ds Light", 0, 36)); // NOI18N
        btnStudy.setText("Study the Notes!");
        btnStudy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudyActionPerformed(evt);
            }
        });

        btnQuiz.setFont(new java.awt.Font("3ds Light", 0, 36)); // NOI18N
        btnQuiz.setText("Take the Quiz!");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnReview.setFont(new java.awt.Font("3ds Light", 0, 36)); // NOI18N
        btnReview.setText("Review the Questions!");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("3ds Light", 1, 36)); // NOI18N
        lblWelcome.setText("Welcome to the Study Machine!");

        lblPrompt.setFont(new java.awt.Font("3ds Light", 0, 14)); // NOI18N
        lblPrompt.setText("Please select an option to continue");

        btnExitMenu.setFont(new java.awt.Font("3ds Light", 0, 36)); // NOI18N
        btnExitMenu.setText("Exit!");
        btnExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrompt)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblWelcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnStudy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExitMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrompt)
                .addGap(64, 64, 64)
                .addComponent(btnStudy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudyActionPerformed
        //show the windows
        //check to see if the user is currently taking a quiz
        if (frameQuiz.isVisible()){
            JOptionPane.showMessageDialog(null,"You cannot open notes while the quiz is open");
        } else {
        frameNotes.setVisible(true);
        //read the notes file
        Scanner s = new Scanner(GUI.class.getResourceAsStream("notes.txt"));
        String notes = "";
        while (s.hasNextLine()) {
            notes += s.nextLine();
        }
        //show the notes
        taReview.setText(notes);
        }
        
    }//GEN-LAST:event_btnStudyActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        //show the window
        //check to see if the notes are visible
        if (frameNotes.isVisible()){
            JOptionPane.showMessageDialog(null,"You cannot have the notes open while you're taking the quiz");
        } else{
        frameQuiz.setVisible(true);
        //generate the questions
        quizQuestions = generateNumbers();
        //set the quiz to the beginning
        currentQuestion = 0;
        quizScore = 0;
        //update the GUI
        updateQuiz();
        }
        
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed
        //show the window
        //Check to see if user is taking a quiz
        if (frameQuiz.isVisible()){
            JOptionPane.showMessageDialog(null,"You cannot open the review questions while you're taking a quiz");
        } else {
        frameNotes.setVisible(true);
        //create the output string
        String review = "";
        //print the questions to the string
        for (int i = 0; i < questions.size(); i++) {
            review += questions.get(i).toString() + "\n\n";
        }
        //show the output
        taReview.setText(review);
        }
        
    }//GEN-LAST:event_btnReviewActionPerformed

    private void btnExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitMenuActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //stop them from being able to do more than 10
        if (currentQuestion < 9) {
            //check for a correct answer
            if (rBtnChoice1.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 0) {
                quizScore++;
            } else if (rBtnChoice2.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 1) {
                quizScore++;
            } else if (rBtnChoice3.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 2) {
                quizScore++;
            } else if (rBtnChoice4.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 3) {
                quizScore++;
            }
            //increase the current question
            currentQuestion++;
            //update the GUI
            updateQuiz();
        } else {
            //check for a correct answer
            if (rBtnChoice1.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 0) {
                quizScore++;
            } else if (rBtnChoice2.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 1) {
                quizScore++;
            } else if (rBtnChoice3.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 2) {
                quizScore++;
            } else if (rBtnChoice4.isSelected() && questions.get(quizQuestions[currentQuestion]).getCorrect() == 3) {
                quizScore++;
            }
            //update the score
            lblMark.setText(quizScore + "/" + (currentQuestion));
            JOptionPane.showMessageDialog(frameQuiz, "You finished the quiz with a score of:\n" + quizScore + "/10\nThe quiz will now reset", "Finished Quiz!", JOptionPane.INFORMATION_MESSAGE);
            //generate the questions
            quizQuestions = generateNumbers();
            //set the quiz to the beginning
            currentQuestion = 0;
            quizScore = 0;
            //update the GUI
            updateQuiz();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void rBtnChoice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnChoice3ActionPerformed
        btnNext.setEnabled(true);
    }//GEN-LAST:event_rBtnChoice3ActionPerformed

    private void rBtnChoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnChoice1ActionPerformed
        btnNext.setEnabled(true);
    }//GEN-LAST:event_rBtnChoice1ActionPerformed

    private void rBtnChoice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnChoice2ActionPerformed
        btnNext.setEnabled(true);
    }//GEN-LAST:event_rBtnChoice2ActionPerformed

    private void rBtnChoice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnChoice4ActionPerformed
        btnNext.setEnabled(true);
    }//GEN-LAST:event_rBtnChoice4ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //put the quiz back to the start
        currentQuestion = 0;
        quizScore = 0;
        //reset the GUI
        updateQuiz();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frameQuiz.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * this method updates the GUI of the quiz
     */
    public void updateQuiz() {
        //set the question text
        txtQuestion.setText(questions.get(quizQuestions[currentQuestion]).getQues());
        //set the possible answers
        rBtnChoice1.setText(questions.get(quizQuestions[currentQuestion]).getIndAnswer(0));
        rBtnChoice2.setText(questions.get(quizQuestions[currentQuestion]).getIndAnswer(1));
        rBtnChoice3.setText(questions.get(quizQuestions[currentQuestion]).getIndAnswer(2));
        rBtnChoice4.setText(questions.get(quizQuestions[currentQuestion]).getIndAnswer(3));
        //set the options all to false (doesn't work)
        rBtnChoice1.setSelected(false);
        rBtnChoice2.setSelected(false);
        rBtnChoice3.setSelected(false);
        rBtnChoice4.setSelected(false);
        rbHidden.setSelected(true);
        //update the score
        lblMark.setText(quizScore + "/" + (currentQuestion));
        lblQuestion.setText((currentQuestion + 1) + " of 10");
        //disable the next questions button (no option has been selected)
        btnNext.setEnabled(false);
    }

    /**
     * This method reads the questions for the multiple choice quiz from a text
     * file and places them into an arraylist of questions
     *
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
     * this generates a list of 10 unique integers, the questions to use in the
     * quiz
     *
     * @return an array if 10 unique integers
     */
    public int[] generateNumbers() {
        //create the array
        int[] nums = new int[10];
        //create 10 numbers
        for (int i = 0; i < 10; i++) {
            //continue to generate the number until it is unique
            boolean repeat = true;
            int n = 0;
            while (repeat) {
                repeat = false;
                n = (int) (Math.random() * questions.size());
                for (int j = 0; j < i; j++) {
                    if (n == nums[i]) {
                        repeat = true;
                    }
                }
            }
            nums[i] = n;
        }
        //return the array
        return nums;
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
    private javax.swing.JButton btnExitMenu;
    private javax.swing.ButtonGroup btnGChoices;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnStudy;
    private javax.swing.JFrame frameNotes;
    private javax.swing.JFrame frameQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMark;
    private javax.swing.JLabel lblPrompt;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JRadioButton rBtnChoice1;
    private javax.swing.JRadioButton rBtnChoice2;
    private javax.swing.JRadioButton rBtnChoice3;
    private javax.swing.JRadioButton rBtnChoice4;
    private javax.swing.JRadioButton rbHidden;
    private javax.swing.JTextArea taReview;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
