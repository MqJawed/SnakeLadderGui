
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MD QUZAL JAWED
 */

//mycode

class Snake {
    int head,tail;
    Snake(int head, int tail)
    {
        this.head=head;
        this.tail=tail;
    }
}

class Ladder
{
    int top, bottom;
    Ladder(int top, int bottom)
    {
        this.top=top;
        this.bottom=bottom;
    }
}


public class SnakeLadd extends javax.swing.JFrame {

    /**
     * Creates new form SnakeLadd
     */
    static int random = 0;
    int p1_pre_val = 0, p1_curr_val = 0, p2_pre_val = 0, p2_curr_val = 0;
      
    public SnakeLadd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        player1 = new javax.swing.JToggleButton();
        player2 = new javax.swing.JToggleButton();
        p1_prev_prog = new javax.swing.JTextField();
        p1_lad_snake = new javax.swing.JTextField();
        p1_curr_prog = new javax.swing.JTextField();
        p2_prev_prog = new javax.swing.JTextField();
        p2_lad_snake = new javax.swing.JTextField();
        p2_curr_prog = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        score = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board.jpg"))); // NOI18N
        jLabel1.setOpaque(true);

        player1.setBackground(new java.awt.Color(255, 255, 51));
        player1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        player1.setText("Player 1");
        player1.setEnabled(true);
        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });

        player2.setBackground(new java.awt.Color(102, 255, 0));
        player2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        player2.setText("Player 2");
        player2.setEnabled(true);
        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        p1_prev_prog.setEditable(false);
        p1_prev_prog.setBackground(new java.awt.Color(153, 255, 255));
        p1_prev_prog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1_prev_prog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1_prev_prog.setText("0");
        p1_prev_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_prev_progActionPerformed(evt);
            }
        });

        p1_lad_snake.setBackground(new java.awt.Color(153, 255, 255));
        p1_lad_snake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1_lad_snake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1_lad_snake.setEditable(false);
        p1_lad_snake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_lad_snakeActionPerformed(evt);
            }
        });

        p1_curr_prog.setBackground(new java.awt.Color(153, 255, 255));
        p1_curr_prog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1_curr_prog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1_curr_prog.setText("0");
        p1_curr_prog.setEditable(false);
        p1_curr_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_curr_progActionPerformed(evt);
            }
        });

        p2_prev_prog.setBackground(new java.awt.Color(204, 204, 255));
        p2_prev_prog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2_prev_prog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2_prev_prog.setText("0");
        p2_prev_prog.setEditable(false);
        p2_prev_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_prev_progActionPerformed(evt);
            }
        });

        p2_lad_snake.setBackground(new java.awt.Color(204, 204, 255));
        p2_lad_snake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2_lad_snake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2_lad_snake.setEditable(false);
        p2_lad_snake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_lad_snakeActionPerformed(evt);
            }
        });

        p2_curr_prog.setBackground(new java.awt.Color(204, 204, 255));
        p2_curr_prog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2_curr_prog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2_curr_prog.setText("0");
        p2_curr_prog.setEditable(false);
        p2_curr_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_curr_progActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton2.setText("DICE");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 51)));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        score.setBackground(new java.awt.Color(255, 204, 0));
        score.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        score.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        score.setText("0");
        score.setEditable(false);
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p2_prev_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2_lad_snake, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2_curr_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1_prev_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1_lad_snake, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1_curr_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1_prev_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1_lad_snake, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1_curr_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p2_curr_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p2_lad_snake, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p2_prev_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1ActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void p1_prev_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_prev_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_prev_progActionPerformed

    private void p1_lad_snakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_lad_snakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_lad_snakeActionPerformed

    private void p1_curr_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_curr_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_curr_progActionPerformed

    private void p2_prev_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_prev_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2_prev_progActionPerformed

    private void p2_lad_snakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_lad_snakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2_lad_snakeActionPerformed

    private void p2_curr_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_curr_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2_curr_progActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int min = 1, max = 6,temp,i;
        Snake s[] = new Snake[8];
        Ladder l[] = new Ladder[8];

        s[0] = new Snake(29,9);
        s[1] = new Snake(38,15);
        s[2] = new Snake(47,5);
        s[3] = new Snake(53,33);
        s[4] = new Snake(62,37);
        s[5] = new Snake(86,54);
        s[6] = new Snake(92,70);
        s[7] = new Snake(97,25);

        l[0] = new Ladder(23,2);
        l[1] = new Ladder(34,8);
        l[2] = new Ladder(77,20);
        l[3] = new Ladder(68,32);
        l[4] = new Ladder(79,41);
        l[5] = new Ladder(88,74);
        l[6] = new Ladder(100,82);
        l[7] = new Ladder(95,85);
        random = ThreadLocalRandom.current().nextInt(min, max+1);
        score.setText(Integer.toString(random));
        if((player1.isEnabled() && player2.isEnabled()) || player2.isEnabled())
        {
            player2.setEnabled(false);
            player1.setEnabled(true);
            p2_lad_snake.setText("");
            p1_pre_val = p1_curr_val;
            temp = p1_pre_val;
            p1_pre_val += random;
            if(p1_pre_val > 100)
            {
                p1_pre_val -= random;
                p1_prev_prog.setText(Integer.toString(p1_pre_val));  
            }
            else{
            p1_curr_val = p1_pre_val;
            p1_prev_prog.setText(Integer.toString(temp)+"+"+Integer.toString(random)+"="+Integer.toString(p1_pre_val));
            for(i = 0; i<7; i++)
            {
               if(p1_pre_val == s[i].head)
                {
                    p1_curr_val = s[i].tail;
                    p1_lad_snake.setText("SNAKE BITE "+Integer.toString(p1_pre_val)+"->"+Integer.toString(p1_curr_val));
                    break;
                }
                else if(p1_pre_val == l[i].bottom)
                {
                    p1_curr_val = l[i].top;
                    p1_lad_snake.setText("LADDER "+Integer.toString(p1_pre_val)+"->"+Integer.toString(p1_curr_val));
                    break;
                }
            }
            p1_curr_prog.setText(Integer.toString(p1_curr_val));
            if(p1_curr_val == 100)
            {
                JOptionPane.showMessageDialog(this,"PLAYER 1 WON THE GAME"); 
                jButton2.setEnabled(false);
                player1.setEnabled(false);
                player2.setEnabled(false);
                score.setText("");
                p1_prev_prog.setText("");
                p1_curr_prog.setText("");
                p1_lad_snake.setText("");
                p2_prev_prog.setText("");
                p2_curr_prog.setText("");
                p2_lad_snake.setText("");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

        else if(player1.isEnabled()){
            player2.setEnabled(true);
            player1.setEnabled(false);
            p1_lad_snake.setText("");
            p2_pre_val = p2_curr_val;
            temp = p2_pre_val;
            p2_pre_val += random;
            if(p2_pre_val > 100)
            {
                p2_pre_val -= random;
                p2_prev_prog.setText(Integer.toString(p2_pre_val));  
            }
            else{
            p2_curr_val = p2_pre_val;
            p2_prev_prog.setText(Integer.toString(temp)+"+"+Integer.toString(random)+"="+Integer.toString(p2_pre_val));
            for(i = 0; i<7; i++)
            {
               if(p2_pre_val == s[i].head)
                {
                    p2_curr_val = s[i].tail;
                    p2_lad_snake.setText("SNAKE BITE "+Integer.toString(p2_pre_val)+"->"+Integer.toString(p2_curr_val));
                    break;
                }
                else if(p2_pre_val == l[i].bottom)
                {
                    p2_curr_val = l[i].top;
                    p2_lad_snake.setText("LADDER "+Integer.toString(p2_pre_val)+"->"+Integer.toString(p2_curr_val));
                    break;
                }
            }
            p2_curr_prog.setText(Integer.toString(p2_curr_val));
            if(p2_curr_val == 100)
            {
                JOptionPane.showMessageDialog(this,"PLAYER 2 WON THE GAME");
                jButton2.setEnabled(false);
                player1.setEnabled(false);
                player2.setEnabled(false);
                score.setText("");
                p1_prev_prog.setText("");
                p1_curr_prog.setText("");
                p1_lad_snake.setText("");
                p2_prev_prog.setText("");
                p2_curr_prog.setText("");
                p2_lad_snake.setText("");
            }
        }
    }
        
    }
    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreActionPerformed

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
            java.util.logging.Logger.getLogger(SnakeLadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnakeLadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnakeLadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnakeLadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnakeLadd().setVisible(true);
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField p1_curr_prog;
    private javax.swing.JTextField p1_lad_snake;
    private javax.swing.JTextField p1_prev_prog;
    private javax.swing.JTextField p2_curr_prog;
    private javax.swing.JTextField p2_lad_snake;
    private javax.swing.JTextField p2_prev_prog;
    private javax.swing.JToggleButton player1;
    private javax.swing.JToggleButton player2;
    private javax.swing.JTextField score;
    // End of variables declaration//GEN-END:variables
}
