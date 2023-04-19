/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamesLevel;

import Score.MyText;
import Score.WriteAndRead_Level1;
import static Score.WriteAndRead_Level1.arrayList;
import Score.WriteAndRead_Level3;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Vipul
 */
public class Level_3 extends javax.swing.JFrame implements Runnable {

    private int boy_x;
    private int boy_y;
    private int tresure1_X;
    private int tresure2_X;
    private int tresure3_X;
    private int tresure4_X;
    private int tresure5_X;
    private int tresure6_X;
    private int tresure1_Y;
    private int tresure2_Y;
    private int tresure3_Y;
    private int tresure4_Y;
    private int tresure5_Y;
    private int tresure6_Y;

    //Range Between Tresure and Boy
    private int tresure1_boy_X;
    private int tresure1_boy_Y;

    private int tresure2_boy_X;
    private int tresure2_boy_Y;

    private int tresure3_boy_X;
    private int tresure3_boy_Y;

    private int tresure4_boy_X;
    private int tresure4_boy_Y;

    private int tresure5_boy_X;
    private int tresure5_boy_Y;

    private int tresure6_boy_X;
    private int tresure6_boy_Y;

    // boy data store
    private final ArrayList<Integer> x_array_boy = new ArrayList<>();
    private final ArrayList<Integer> y_array_boy = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_boy = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_boy = new Stack<>();

    // Tresure1 data store
    private final ArrayList<Integer> x_array_tresure1 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure1 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure1 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure1 = new Stack<>();

    //Tresure2 data store
    private final ArrayList<Integer> x_array_tresure2 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure2 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure2 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure2 = new Stack<>();

    //Tresure3 data store
    private final ArrayList<Integer> x_array_tresure3 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure3 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure3 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure3 = new Stack<>();

    //Tresure4 data store
    private final ArrayList<Integer> x_array_tresure4 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure4 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure4 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure4 = new Stack<>();

    //Tresure5 data store
    private final ArrayList<Integer> x_array_tresure5 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure5 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure5 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure5 = new Stack<>();

    //Trresure6 data store
    private final ArrayList<Integer> x_array_tresure6 = new ArrayList<>();
    private final ArrayList<Integer> y_array_tresure6 = new ArrayList<>();

    private static final Stack<ArrayList> X_cordinateDB_tresure6 = new Stack<>();
    private static final Stack<ArrayList> Y_cordinateDB_tresure6 = new Stack<>();

    //other things
    private int boy_count = 0;
    private int boy_x_undo;
    private int boy_y_undo;
    private int tresure_count1 = 0;
    private int tresure_count2 = 0;
    private int tresure_count3 = 0;
    private int tresure_count4 = 0;
    private int tresure_count5 = 0;
    private int tresure_count6 = 0;
    private int tresure1_x_undo;
    private int tresure1_y_undo;
    private int tresure2_x_undo;
    private int tresure2_y_undo;
    private int tresure3_x_undo;
    private int tresure3_y_undo;
    private int tresure4_x_undo;
    private int tresure4_y_undo;
    private int tresure5_x_undo;
    private int tresure5_y_undo;
    private int tresure6_x_undo;
    private int tresure6_y_undo;

    private static Clip clip;

    // Time
    private final int i = 0;
    private int startMinutes = 0;
    private final String maxtime;
    private String maxtime1;
    private int j = 0;

    /**
     * Creates new form Level_2
     */
    public Level_3() {
        initComponents();
        PlayMusic();
        time();
        Box_1.setVisible(false);
        Box_2.setVisible(false);
        Box_3.setVisible(false);
        setLocation(600, 100);
        if (new WriteAndRead_Level3().readObject() == null) {
            jLabel2_Moves.setText("");
            maxtime = "00:00";
        } else {

            jLabel2_Moves.setText(WriteAndRead_Level3.txt.toString());
            maxtime = WriteAndRead_Level3.txt.toString();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5_tresure5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4_tresure4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6_tresure6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3_tresure3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2_tresure2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1_boy = new javax.swing.JButton();
        jButton7_tresure1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Box_1 = new javax.swing.JButton();
        Box_2 = new javax.swing.JButton();
        Box_3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1_undo1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2_Moves = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4_Time = new javax.swing.JLabel();
        jLabel4_Time1 = new javax.swing.JLabel();
        jLabel2_Moves1 = new javax.swing.JLabel();
        jButton1_sound = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6_X = new javax.swing.JLabel();
        jLabel5_Y = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8_x = new javax.swing.JLabel();
        jLabel9_y = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jButton5_tresure5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton5_tresure5.setText("5");
        jPanel1.add(jButton5_tresure5);
        jButton5_tresure5.setBounds(410, 190, 70, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel7.setText("        5 ");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 660, 70, 60);

        jButton4_tresure4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton4_tresure4.setText("4");
        jPanel1.add(jButton4_tresure4);
        jButton4_tresure4.setBounds(340, 190, 70, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel6.setText("       4 ");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 420, 70, 60);

        jButton6_tresure6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton6_tresure6.setText("6");
        jPanel1.add(jButton6_tresure6);
        jButton6_tresure6.setBounds(120, 630, 70, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel5.setText("        6 ");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 530, 70, 60);

        jButton3_tresure3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton3_tresure3.setText("3");
        jButton3_tresure3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_tresure3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3_tresure3);
        jButton3_tresure3.setBounds(480, 580, 70, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel4.setText("        3");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 470, 70, 60);

        jButton2_tresure2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton2_tresure2.setText("2");
        jPanel1.add(jButton2_tresure2);
        jButton2_tresure2.setBounds(480, 520, 70, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel3.setText("        2");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 340, 70, 60);

        jButton1_boy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1.png"))); // NOI18N
        jButton1_boy.setText("BOY");
        jButton1_boy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1_boyKeyPressed(evt);
            }
        });
        jPanel1.add(jButton1_boy);
        jButton1_boy.setBounds(380, 90, 70, 60);

        jButton7_tresure1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon1_3.jpg"))); // NOI18N
        jButton7_tresure1.setText("1");
        jPanel1.add(jButton7_tresure1);
        jButton7_tresure1.setBounds(480, 460, 70, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_2.png"))); // NOI18N
        jLabel2.setText("        1 ");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 260, 70, 60);

        Box_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_1.png"))); // NOI18N
        Box_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_1ActionPerformed(evt);
            }
        });
        jPanel1.add(Box_1);
        Box_1.setBounds(640, 60, 80, 60);

        Box_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_1.png"))); // NOI18N
        jPanel1.add(Box_2);
        Box_2.setBounds(640, 130, 80, 60);

        Box_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2_1.png"))); // NOI18N
        jPanel1.add(Box_3);
        Box_3.setBounds(640, 200, 80, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Maps/Level-3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 737, 823);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 740, 800));

        jButton1_undo1.setText("Undo");
        jButton1_undo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_undo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_undo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 110, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("   Moves");
        jLabel8.setPreferredSize(new java.awt.Dimension(59, 32));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 860, 90, 40));

        jLabel2_Moves.setFont(new java.awt.Font("Digital-7 Mono", 1, 18)); // NOI18N
        jLabel2_Moves.setText("  Score");
        jLabel2_Moves.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2_Moves, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 860, 100, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("  Best Score");
        jLabel9.setPreferredSize(new java.awt.Dimension(59, 32));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 860, 110, 40));

        jLabel4_Time.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4_Time.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4_Time.setText("  Time");
        jLabel4_Time.setPreferredSize(new java.awt.Dimension(59, 32));
        getContentPane().add(jLabel4_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 860, 70, 40));

        jLabel4_Time1.setFont(new java.awt.Font("Digital-7 Mono", 1, 18)); // NOI18N
        jLabel4_Time1.setText(" Time");
        jLabel4_Time1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel4_Time1.setPreferredSize(new java.awt.Dimension(59, 32));
        getContentPane().add(jLabel4_Time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 860, 80, 40));

        jLabel2_Moves1.setFont(new java.awt.Font("Digital-7 Mono", 1, 18)); // NOI18N
        jLabel2_Moves1.setText(" Moves");
        jLabel2_Moves1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2_Moves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 860, 80, 40));

        jButton1_sound.setText("Pause");
        jButton1_sound.setMaximumSize(new java.awt.Dimension(59, 32));
        jButton1_sound.setMinimumSize(new java.awt.Dimension(59, 32));
        jButton1_sound.setPreferredSize(new java.awt.Dimension(59, 32));
        jButton1_sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_soundActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 860, 100, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Target Location");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 190, -1));

        jLabel6_X.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6_X.setText("   X");
        getContentPane().add(jLabel6_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 820, 80, -1));

        jLabel5_Y.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5_Y.setText("  Y");
        getContentPane().add(jLabel5_Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 820, 80, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Tresure Location");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 820, 200, -1));

        jLabel8_x.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8_x.setText("   X");
        getContentPane().add(jLabel8_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 820, 70, -1));

        jLabel9_y.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9_y.setText("  Y");
        getContentPane().add(jLabel9_y, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 820, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_boyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1_boyKeyPressed
        boy_x = jButton1_boy.getLocation().x;
        boy_y = jButton1_boy.getLocation().y;
        tresure1_X = jButton7_tresure1.getLocation().x;
        tresure2_X = jButton2_tresure2.getLocation().x;
        tresure3_X = jButton3_tresure3.getLocation().x;
        tresure4_X = jButton4_tresure4.getLocation().x;
        tresure5_X = jButton5_tresure5.getLocation().x;
        tresure6_X = jButton6_tresure6.getLocation().x;
        tresure1_Y = jButton7_tresure1.getLocation().y;
        tresure2_Y = jButton2_tresure2.getLocation().y;
        tresure3_Y = jButton3_tresure3.getLocation().y;
        tresure4_Y = jButton4_tresure4.getLocation().y;
        tresure5_Y = jButton5_tresure5.getLocation().y;
        tresure6_Y = jButton6_tresure6.getLocation().y;

        goBoy(evt, boy_x, boy_y, tresure1_X, tresure2_X, tresure3_X, tresure4_X,
                tresure5_X, tresure6_X, tresure1_Y, tresure2_Y, tresure3_Y,
                tresure4_Y, tresure5_Y, tresure6_Y);
        if (tresure1_X == 90 && tresure1_Y == 260) {
            tresure01(tresure1_X, tresure1_Y);
        }
        if (tresure2_X == 460 && tresure1_Y == 340) {
            tresure02(tresure2_X, tresure1_Y);
        }
        if (tresure3_X == 90 && tresure3_Y == 470) {
            tresure03(tresure3_X, tresure3_Y);
        }
        if (tresure4_X == 350 && tresure4_Y == 660) {
            tresure04(tresure4_X, tresure4_Y);
        }
        if (tresure5_X == 400 && tresure5_Y == 530) {
            tresure05(tresure5_X, tresure5_Y);
        }
        if (tresure6_X == 580 && tresure6_Y == 420) {
            tresure06(tresure6_X, tresure6_Y);
        }


    }//GEN-LAST:event_jButton1_boyKeyPressed

    private void jButton1_undo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_undo1ActionPerformed
        undo_boy();
        undo_Tresure1();
        undo_Tresure2();
        undo_Tresure3();
        undo_Tresure4();
        undo_Tresure5();
        undo_Tresure6();
    }//GEN-LAST:event_jButton1_undo1ActionPerformed

    private void jButton1_soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_soundActionPerformed

        if (jButton1_sound.getText().equals("Play")) {

            PlayMusic();

            jButton1_sound.setText("Pause");
        } else {
            PauseMusic();
            jButton1_sound.setText("Play");

        }
    }//GEN-LAST:event_jButton1_soundActionPerformed

    private void jButton3_tresure3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_tresure3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3_tresure3ActionPerformed

    private void Box_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Level_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Box_1;
    private javax.swing.JButton Box_2;
    private javax.swing.JButton Box_3;
    private javax.swing.JButton jButton1_boy;
    private javax.swing.JButton jButton1_sound;
    private javax.swing.JButton jButton1_undo1;
    private javax.swing.JButton jButton2_tresure2;
    private javax.swing.JButton jButton3_tresure3;
    private javax.swing.JButton jButton4_tresure4;
    private javax.swing.JButton jButton5_tresure5;
    private javax.swing.JButton jButton6_tresure6;
    private javax.swing.JButton jButton7_tresure1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_Moves;
    private javax.swing.JLabel jLabel2_Moves1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_Time;
    private javax.swing.JLabel jLabel4_Time1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5_Y;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6_X;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8_x;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel9_y;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void goBoy(KeyEvent key, int boy_x, int boy_y, int tresure1_X,
            int tresure2_X, int tresure3_X,
            int tresure4_X, int tresure5_X,
            int tresure6_X, int tresure1_Y,
            int tresure2_Y, int tresure3_Y,
            int tresure4_Y, int tresure5_Y,
            int tresure6_Y) {

        this.boy_x = boy_x;
        this.boy_y = boy_y;
        this.tresure1_X = tresure1_X;
        this.tresure1_Y = tresure1_Y;
        this.tresure2_X = tresure2_X;
        this.tresure2_Y = tresure2_Y;
        this.tresure3_X = tresure3_X;
        this.tresure3_Y = tresure3_Y;
        this.tresure4_X = tresure4_X;
        this.tresure4_Y = tresure4_Y;
        this.tresure5_X = tresure5_X;
        this.tresure5_Y = tresure5_Y;
        this.tresure6_X = tresure6_X;
        this.tresure6_Y = tresure6_Y;

        tresure1_boy_X = tresure1_X - boy_x;
        tresure1_boy_Y = tresure1_Y - boy_y;

        tresure2_boy_X = tresure2_X - boy_x;
        tresure2_boy_Y = tresure2_Y - boy_y;

        tresure3_boy_X = tresure3_X - boy_x;
        tresure3_boy_Y = tresure3_Y - boy_y;

        tresure4_boy_X = tresure4_X - boy_x;
        tresure4_boy_Y = tresure4_Y - boy_y;

        tresure5_boy_X = tresure5_X - boy_x;
        tresure5_boy_Y = tresure5_Y - boy_y;

        tresure6_boy_X = tresure6_X - boy_x;
        tresure6_boy_Y = tresure6_Y - boy_y;

        int keys = key.getKeyCode();

        switch (keys) {

            case KeyEvent.VK_UP:
                if ((boy_y == 80) || (boy_y == 210 && boy_x <= 205)
                        || (boy_y == 405 && boy_x >= 545)
                        || (boy_y == 535 && boy_x == 335)
                        || (boy_y == 405 && boy_x <= 130)
                        || (boy_y == 600 && boy_x >= 200)
                        && (boy_y == 600 && boy_x <= 265)) {

                } else {

                    if (tresure1_boy_X == 0 && tresure1_boy_Y == -60) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 260);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton7_tresure1.setLocation(tresure1_X, tresure1_Y - 5);
                            int X = jButton7_tresure1.getLocation().x;
                            int Y = jButton7_tresure1.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count1++;

                            x_array_tresure1.add(tresure1_X);
                            X_cordinateDB_tresure1.push(x_array_tresure1);
                            y_array_tresure1.add(tresure1_Y);
                            Y_cordinateDB_tresure1.push(y_array_tresure1);
                        }
                    }
                    if (tresure2_boy_X == 0 && tresure2_boy_Y == -60) {
                        jLabel6_X.setText("" + 460);
                        jLabel5_Y.setText("" + 340);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton2_tresure2.setLocation(tresure2_X, tresure2_Y - 5);

                            int X = jButton2_tresure2.getLocation().x;
                            int Y = jButton2_tresure2.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count2++;

                            x_array_tresure2.add(tresure2_X);
                            X_cordinateDB_tresure2.push(x_array_tresure2);
                            y_array_tresure2.add(tresure2_Y);
                            Y_cordinateDB_tresure2.push(y_array_tresure2);
                        }
                    }
                    if (tresure3_boy_X == 0 && tresure3_boy_Y == -60) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 470);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton3_tresure3.setLocation(tresure3_X, tresure3_Y - 5);

                            int X = jButton3_tresure3.getLocation().x;
                            int Y = jButton3_tresure3.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count3++;

                            x_array_tresure3.add(tresure3_X);
                            X_cordinateDB_tresure3.push(x_array_tresure3);
                            y_array_tresure3.add(tresure3_Y);
                            Y_cordinateDB_tresure3.push(y_array_tresure3);
                        }
                    }
                    if (tresure4_boy_X == 0 && tresure4_boy_Y == -60) {
                        jLabel6_X.setText("" + 350);
                        jLabel5_Y.setText("" + 660);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton4_tresure4.setLocation(tresure4_X, tresure4_Y - 5);
                            int X = jButton4_tresure4.getLocation().x;
                            int Y = jButton4_tresure4.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count4++;

                            x_array_tresure4.add(tresure4_X);
                            X_cordinateDB_tresure4.push(x_array_tresure4);
                            y_array_tresure4.add(tresure4_Y);
                            Y_cordinateDB_tresure4.push(y_array_tresure4);
                        }
                    }
                    if (tresure5_boy_X == 0 && tresure5_boy_Y == -60) {
                        jLabel6_X.setText("" + 400);
                        jLabel5_Y.setText("" + 530);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton5_tresure5.setLocation(tresure5_X, tresure5_Y - 5);
                            int X = jButton5_tresure5.getLocation().x;
                            int Y = jButton5_tresure5.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count5++;

                            x_array_tresure5.add(tresure5_X);
                            X_cordinateDB_tresure5.push(x_array_tresure5);
                            y_array_tresure5.add(tresure5_Y);
                            Y_cordinateDB_tresure5.push(y_array_tresure5);
                        }

                    }
                    if (tresure6_boy_X == 0 && tresure6_boy_Y == -60) {
                        jLabel6_X.setText("" + 580);
                        jLabel5_Y.setText("" + 420);
                        if ((boy_y == 140) || (boy_x <= 205 && boy_y == 270)
                                && (boy_x >= 70 && boy_y == 270)
                                || (boy_x >= 540 && boy_y == 465)
                                && (boy_x <= 595 && boy_y == 465)
                                || (boy_x <= 130 && boy_y == 465)
                                && (boy_x >= 70 && boy_y == 465)
                                || (boy_x == 335 && boy_y == 590)
                                || (boy_x <= 265 && boy_y == 660)
                                && (boy_x >= 200 && boy_y == 660)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y - 5);
                            jButton6_tresure6.setLocation(tresure6_X, tresure6_Y - 5);
                            int X = jButton6_tresure6.getLocation().x;
                            int Y = jButton6_tresure6.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count6++;

                            x_array_tresure6.add(tresure6_X);
                            X_cordinateDB_tresure6.push(x_array_tresure6);
                            y_array_tresure6.add(tresure6_Y);
                            Y_cordinateDB_tresure6.push(y_array_tresure6);
                        }
                    } else {

                        jButton1_boy.setLocation(boy_x, boy_y - 5);
                        boy_count++;
                        x_array_boy.add(boy_x);
                        X_cordinateDB_boy.push(x_array_boy);
                        y_array_boy.add(boy_y);
                        Y_cordinateDB_boy.push(y_array_boy);

                    }

                }
                break;

            case KeyEvent.VK_DOWN:
                if ((boy_y == 660) || (boy_y == 335 && boy_x <= 335)
                        || (boy_y == 275 && boy_x <= 205)) {

                } else {

                    if (tresure1_boy_X == 0 && tresure1_boy_Y == 60) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 260);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton7_tresure1.setLocation(tresure1_X, tresure1_Y + 5);
                            int X = jButton7_tresure1.getLocation().x;
                            int Y = jButton7_tresure1.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count1++;

                            x_array_tresure1.add(tresure1_X);
                            X_cordinateDB_tresure1.push(x_array_tresure1);
                            y_array_tresure1.add(tresure1_Y);
                            Y_cordinateDB_tresure1.push(y_array_tresure1);

                        }
                    }

                    if (tresure2_boy_X == 0 && tresure2_boy_Y == 60) {
                        jLabel6_X.setText("" + 460);
                        jLabel5_Y.setText("" + 340);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton2_tresure2.setLocation(tresure2_X, tresure2_Y + 5);
                            int X = jButton2_tresure2.getLocation().x;
                            int Y = jButton2_tresure2.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count2++;

                            x_array_tresure2.add(tresure2_X);
                            X_cordinateDB_tresure2.push(x_array_tresure2);
                            y_array_tresure2.add(tresure2_Y);
                            Y_cordinateDB_tresure2.push(y_array_tresure2);
                        }
                    }
                    if (tresure3_boy_X == 0 && tresure3_boy_Y == 60) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 470);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton3_tresure3.setLocation(tresure3_X, tresure3_Y + 5);
                            int X = jButton3_tresure3.getLocation().x;
                            int Y = jButton3_tresure3.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count3++;

                            x_array_tresure3.add(tresure3_X);
                            X_cordinateDB_tresure3.push(x_array_tresure3);
                            y_array_tresure3.add(tresure3_Y);
                            Y_cordinateDB_tresure3.push(y_array_tresure3);
                        }
                    }
                    if (tresure4_boy_X == 0 && tresure4_boy_Y == 60) {
                        jLabel6_X.setText("" + 350);
                        jLabel5_Y.setText("" + 660);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton4_tresure4.setLocation(tresure4_X, tresure4_Y + 5);
                            int X = jButton4_tresure4.getLocation().x;
                            int Y = jButton4_tresure4.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count4++;

                            x_array_tresure4.add(tresure4_X);
                            X_cordinateDB_tresure4.push(x_array_tresure4);
                            y_array_tresure4.add(tresure4_Y);
                            Y_cordinateDB_tresure4.push(y_array_tresure4);

                        }
                    }

                    if (tresure5_boy_X == 0 && tresure5_boy_Y == 60) {
                        jLabel6_X.setText("" + 400);
                        jLabel5_Y.setText("" + 530);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton5_tresure5.setLocation(tresure5_X, tresure5_Y + 5);
                            int X = jButton5_tresure5.getLocation().x;
                            int Y = jButton5_tresure5.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count5++;

                            x_array_tresure5.add(tresure5_X);
                            X_cordinateDB_tresure5.push(x_array_tresure5);
                            y_array_tresure5.add(tresure5_Y);
                            Y_cordinateDB_tresure5.push(y_array_tresure5);
                        }
                    }
                    if (tresure6_boy_X == 0 && tresure6_boy_Y == 60) {
                        jLabel6_X.setText("" + 580);
                        jLabel5_Y.setText("" + 420);
                        if ((boy_x <= 340 && boy_y == 275) && (boy_x >= 270
                                && boy_y == 275) || (boy_y == 600)) {

                        } else {
                            jButton1_boy.setLocation(boy_x, boy_y + 5);
                            jButton6_tresure6.setLocation(tresure6_X, tresure6_Y + 5);
                            int X = jButton6_tresure6.getLocation().x;
                            int Y = jButton6_tresure6.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count6++;

                            x_array_tresure6.add(tresure6_X);
                            X_cordinateDB_tresure6.push(x_array_tresure6);
                            y_array_tresure6.add(tresure6_Y);
                            Y_cordinateDB_tresure6.push(y_array_tresure6);
                        }
                    } else {
                        jButton1_boy.setLocation(boy_x, boy_y + 5);
                        boy_count++;
                        x_array_boy.add(boy_x);
                        X_cordinateDB_boy.push(x_array_boy);
                        y_array_boy.add(boy_y);
                        Y_cordinateDB_boy.push(y_array_boy);

                    }

                }
                break;

            case KeyEvent.VK_LEFT:
                if ((boy_x == 70) || (boy_y == 335 && boy_x <= 275)
                        || (boy_x <= 335 && boy_y == 535)
                        || (boy_y <= 150 && boy_x == 275)
                        && (boy_x == 275 && boy_y >= 80)
                        || (boy_y >= 395 && boy_x == 400)
                        && (boy_y <= 475 && boy_x == 400)) {

                } else {

                    if (tresure1_boy_X == -70 && tresure1_boy_Y == 0) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 260);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton7_tresure1.setLocation(tresure1_X - 5, tresure1_Y);
                            int X = jButton7_tresure1.getLocation().x;
                            int Y = jButton7_tresure1.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count1++;

                            x_array_tresure1.add(tresure1_X);
                            X_cordinateDB_tresure1.push(x_array_tresure1);
                            y_array_tresure1.add(tresure1_Y);
                            Y_cordinateDB_tresure1.push(y_array_tresure1);

                        }
                    }
                    if (tresure2_boy_X == -70 && tresure2_boy_Y == 0) {
                        jLabel6_X.setText("" + 460);
                        jLabel5_Y.setText("" + 340);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton2_tresure2.setLocation(tresure2_X - 5, tresure2_Y);
                            int X = jButton2_tresure2.getLocation().x;
                            int Y = jButton2_tresure2.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count2++;

                            x_array_tresure2.add(tresure2_X);
                            X_cordinateDB_tresure2.push(x_array_tresure2);
                            y_array_tresure2.add(tresure2_Y);
                            Y_cordinateDB_tresure2.push(y_array_tresure2);
                        }
                    }
                    if (tresure3_boy_X == -70 && tresure3_boy_Y == 0) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 470);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton3_tresure3.setLocation(tresure3_X - 5, tresure3_Y);
                            int X = jButton3_tresure3.getLocation().x;
                            int Y = jButton3_tresure3.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count3++;

                            x_array_tresure3.add(tresure3_X);
                            X_cordinateDB_tresure3.push(x_array_tresure3);
                            y_array_tresure3.add(tresure3_Y);
                            Y_cordinateDB_tresure3.push(y_array_tresure3);
                        }
                    }
                    if (tresure4_boy_X == -70 && tresure4_boy_Y == 0) {
                        jLabel6_X.setText("" + 350);
                        jLabel5_Y.setText("" + 660);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton4_tresure4.setLocation(tresure4_X - 5, tresure4_Y);
                            int X = jButton4_tresure4.getLocation().x;
                            int Y = jButton4_tresure4.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count4++;

                            x_array_tresure4.add(tresure4_X);
                            X_cordinateDB_tresure4.push(x_array_tresure4);
                            y_array_tresure4.add(tresure4_Y);
                            Y_cordinateDB_tresure4.push(y_array_tresure4);
                        }
                    }
                    if (tresure5_boy_X == -70 && tresure5_boy_Y == 0) {
                        jLabel6_X.setText("" + 400);
                        jLabel5_Y.setText("" + 530);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton5_tresure5.setLocation(tresure5_X - 5, tresure5_Y);
                            int X = jButton5_tresure5.getLocation().x;
                            int Y = jButton5_tresure5.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count5++;

                            x_array_tresure5.add(tresure5_X);
                            X_cordinateDB_tresure5.push(x_array_tresure5);
                            y_array_tresure5.add(tresure5_Y);
                            Y_cordinateDB_tresure5.push(y_array_tresure5);

                        }
                    }
                    if (tresure6_boy_X == -70 && tresure6_boy_Y == 0) {
                        jLabel6_X.setText("" + 580);
                        jLabel5_Y.setText("" + 420);
                        if ((boy_x == 140) || (boy_x == 345 && boy_y <= 160)
                                && (boy_x == 345 && boy_y >= 80)
                                || (boy_x == 340 && boy_y == 335)
                                || (boy_x == 470 && boy_y >= 390)
                                && (boy_x == 470 && boy_y <= 475)
                                || (boy_x == 405 && boy_y == 535)) {

                        } else {
                            jButton1_boy.setLocation(boy_x - 5, boy_y);
                            jButton6_tresure6.setLocation(tresure6_X - 5, tresure6_Y);
                            int X = jButton6_tresure6.getLocation().x;
                            int Y = jButton6_tresure6.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count6++;

                            x_array_tresure6.add(tresure6_X);
                            X_cordinateDB_tresure6.push(x_array_tresure6);
                            y_array_tresure6.add(tresure6_Y);
                            Y_cordinateDB_tresure6.push(y_array_tresure6);
                        }

                    } else {

                        jButton1_boy.setLocation(boy_x - 5, boy_y);
                        boy_count++;
                        x_array_boy.add(boy_x);
                        X_cordinateDB_boy.push(x_array_boy);
                        y_array_boy.add(boy_y);
                        Y_cordinateDB_boy.push(y_array_boy);

                    }

                }
                break;

            case KeyEvent.VK_RIGHT:
                if ((boy_x == 595) || (boy_x == 475 && boy_y >= 80)
                        && (boy_x == 475 && boy_y <= 345)
                        || (boy_x == 130 && boy_y >= 405)
                        && (boy_x == 130 && boy_y <= 545)) {

                } else {

                    if (tresure1_boy_X == 70 && tresure1_boy_Y == 0) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 260);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton7_tresure1.setLocation(tresure1_X + 5, tresure1_Y);
                            int X = jButton7_tresure1.getLocation().x;
                            int Y = jButton7_tresure1.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count1++;

                            x_array_tresure1.add(tresure1_X);
                            X_cordinateDB_tresure1.push(x_array_tresure1);
                            y_array_tresure1.add(tresure1_Y);
                            Y_cordinateDB_tresure1.push(y_array_tresure1);

                        }
                    }
                    if (tresure2_boy_X == 70 && tresure2_boy_Y == 0) {
                        jLabel6_X.setText("" + 460);
                        jLabel5_Y.setText("" + 340);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton2_tresure2.setLocation(tresure2_X + 5, tresure2_Y);
                            int X = jButton2_tresure2.getLocation().x;
                            int Y = jButton2_tresure2.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count2++;

                            x_array_tresure2.add(tresure2_X);
                            X_cordinateDB_tresure2.push(x_array_tresure2);
                            y_array_tresure2.add(tresure2_Y);
                            Y_cordinateDB_tresure2.push(y_array_tresure2);
                        }
                    }
                    if (tresure3_boy_X == 70 && tresure3_boy_Y == 0) {
                        jLabel6_X.setText("" + 90);
                        jLabel5_Y.setText("" + 470);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton3_tresure3.setLocation(tresure3_X + 5, tresure3_Y);
                            int X = jButton3_tresure3.getLocation().x;
                            int Y = jButton3_tresure3.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count3++;

                            x_array_tresure3.add(tresure3_X);
                            X_cordinateDB_tresure3.push(x_array_tresure3);
                            y_array_tresure3.add(tresure3_Y);
                            Y_cordinateDB_tresure3.push(y_array_tresure3);
                        }
                    }

                    if (tresure4_boy_X == 70 && tresure4_boy_Y == 0) {
                        jLabel6_X.setText("" + 350);
                        jLabel5_Y.setText("" + 660);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton4_tresure4.setLocation(tresure4_X + 5, tresure4_Y);
                            int X = jButton4_tresure4.getLocation().x;
                            int Y = jButton4_tresure4.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count4++;

                            x_array_tresure4.add(tresure4_X);
                            X_cordinateDB_tresure4.push(x_array_tresure4);
                            y_array_tresure4.add(tresure4_Y);
                            Y_cordinateDB_tresure4.push(y_array_tresure4);

                        }
                    }
                    if (tresure5_boy_X == 70 && tresure5_boy_Y == 0) {
                        jLabel6_X.setText("" + 400);
                        jLabel5_Y.setText("" + 530);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton5_tresure5.setLocation(tresure5_X + 5, tresure5_Y);
                            int X = jButton5_tresure5.getLocation().x;
                            int Y = jButton5_tresure5.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count5++;

                            x_array_tresure5.add(tresure5_X);
                            X_cordinateDB_tresure5.push(x_array_tresure5);
                            y_array_tresure5.add(tresure5_Y);
                            Y_cordinateDB_tresure5.push(y_array_tresure5);

                        }
                    }
                    if (tresure6_boy_X == 70 && tresure6_boy_Y == 0) {
                        jLabel6_X.setText("" + 580);
                        jLabel5_Y.setText("" + 420);
                        if ((boy_x == 405 && boy_y <= 350)
                                && (boy_x == 405 && boy_y >= 80)
                                || (boy_x == 525)) {

                        } else {
                            jButton1_boy.setLocation(boy_x + 5, boy_y);
                            jButton6_tresure6.setLocation(tresure6_X + 5, tresure6_Y);
                            int X = jButton6_tresure6.getLocation().x;
                            int Y = jButton6_tresure6.getLocation().y;
                            jLabel8_x.setText("" + X);
                            jLabel9_y.setText("" + Y);
                            tresure_count6++;

                            x_array_tresure6.add(tresure6_X);
                            X_cordinateDB_tresure6.push(x_array_tresure6);
                            y_array_tresure6.add(tresure6_Y);
                            Y_cordinateDB_tresure6.push(y_array_tresure6);

                        }
                    } else {
                        jButton1_boy.setLocation(boy_x + 5, boy_y);
                        boy_count++;
                        x_array_boy.add(boy_x);
                        X_cordinateDB_boy.push(x_array_boy);
                        y_array_boy.add(boy_y);
                        Y_cordinateDB_boy.push(y_array_boy);

                    }

                }
                break;

            default:
                System.out.println("Invlid");

        }

    }

    private void tresure01(int x2, int y2) {

        if ((x2 == 90 && y2 == 260)) {

            jButton7_tresure1.setVisible(false);
            jLabel2.setVisible(false);
            Box_1.setVisible(true);

            j++;

        }
    }

    private void tresure02(int x2, int y2) {

        if ((x2 == 460 && y2 == 340)) {

            jButton2_tresure2.setVisible(false);
            jLabel3.setVisible(false);
            Box_2.setVisible(true);

            j++;

        }
    }

    private void tresure03(int x2, int y2) {

        if ((x2 == 90 && y2 == 470)) {

            jButton3_tresure3.setVisible(false);
            jLabel4.setVisible(false);
            Box_3.setVisible(true);

            j++;

        }
    }

    private void tresure04(int x2, int y2) {

        if ((x2 == 350 && y2 == 660)) {

            jButton4_tresure4.setVisible(false);
            jLabel5.setVisible(false);
            Box_3.setVisible(true);

            j++;

        }
    }

    private void tresure05(int x2, int y2) {

        if ((x2 == 400 && y2 == 530)) {

            jButton5_tresure5.setVisible(false);
            jLabel6.setVisible(false);
            Box_3.setVisible(true);

            j++;

        }
    }

    private void tresure06(int x2, int y2) {

        if ((x2 == 580 && y2 == 420)) {

            jButton6_tresure6.setVisible(false);
            jLabel7.setVisible(false);
            Box_3.setVisible(true);

            j++;

        }
    }

    private void undo_boy() {

        if (boy_count > 0) {
            --boy_count;

            boy_x_undo = (int) X_cordinateDB_boy.pop().get(boy_count);
            boy_y_undo = (int) Y_cordinateDB_boy.pop().get(boy_count);

            jButton1_boy.setLocation(boy_x_undo, boy_y_undo);

        }

    }

    private void undo_Tresure1() {
        if (tresure_count1 > 0) {

            --tresure_count1;

            tresure1_x_undo = (int) X_cordinateDB_tresure1.pop().get(tresure_count1);
            tresure1_y_undo = (int) Y_cordinateDB_tresure1.pop().get(tresure_count1);

            jButton7_tresure1.setLocation(tresure1_x_undo, tresure1_y_undo);

        }
    }

    private void undo_Tresure2() {
        if (tresure_count2 > 0) {

            --tresure_count2;

            tresure2_x_undo = (int) X_cordinateDB_tresure2.pop().get(tresure_count2);
            tresure2_y_undo = (int) Y_cordinateDB_tresure2.pop().get(tresure_count2);

            jButton2_tresure2.setLocation(tresure2_x_undo, tresure2_y_undo);

        }
    }

    private void undo_Tresure3() {
        if (tresure_count3 > 0) {
            --tresure_count3;

            tresure3_x_undo = (int) X_cordinateDB_tresure3.pop().get(tresure_count3);
            tresure3_y_undo = (int) Y_cordinateDB_tresure3.pop().get(tresure_count3);

            jButton3_tresure3.setLocation(tresure3_x_undo, tresure3_y_undo);

        }
    }

    private void undo_Tresure4() {
        if (tresure_count4 > 0) {
            --tresure_count4;

            tresure4_x_undo = (int) X_cordinateDB_tresure4.pop().get(tresure_count4);
            tresure4_y_undo = (int) Y_cordinateDB_tresure4.pop().get(tresure_count4);

            jButton4_tresure4.setLocation(tresure4_x_undo, tresure4_y_undo);

        }
    }

    private void undo_Tresure5() {
        if (tresure_count5 > 0) {
            --tresure_count5;

            tresure5_x_undo = (int) X_cordinateDB_tresure5.pop().get(tresure_count5);
            tresure5_y_undo = (int) Y_cordinateDB_tresure5.pop().get(tresure_count5);

            jButton5_tresure5.setLocation(tresure5_x_undo, tresure5_y_undo);

        }
    }

    private void undo_Tresure6() {
        if (tresure_count6 > 0) {
            --tresure_count6;

            tresure6_x_undo = (int) X_cordinateDB_tresure6.pop().get(tresure_count6);
            tresure6_y_undo = (int) Y_cordinateDB_tresure6.pop().get(tresure_count6);

            jButton6_tresure6.setLocation(tresure6_x_undo, tresure6_y_undo);

        }
    }

    private void PlayMusic() {
        try {
            File file = new File("music1.wav");
            if (file.exists()) {

                try (AudioInputStream audio2 = AudioSystem.getAudioInputStream(file)) {

                    try {

                        clip = AudioSystem.getClip();
                        clip.open(audio2);
                        clip.start();
                        clip.loop(Clip.LOOP_CONTINUOUSLY);

                    } catch (LineUnavailableException | IOException ex) {

                    }

                }
            }

        } catch (IOException | UnsupportedAudioFileException e) {

        }

    }

    private String PauseMusic() {
        try {
            File file = new File("music1.wav");
            if (file.exists()) {

                long microsecondLength = clip.getMicrosecondLength();
                clip.stop();
                clip.setMicrosecondPosition(microsecondLength);

                clip.flush();
                clip.close();

            }
        } catch (Exception e) {

        }

        return "";

    }

    private void time() {

        Thread thread = new Thread(this);

        thread.start();

    }

    @Override
    public void run() {
        int second = 0;
        try {

            int time = 0;

            while (startMinutes < 8) {
                for (time = 0; time <= 60; time++) {
                    Thread.sleep(1000);
                    JLabel j = new JLabel();

                    j.setText("0" + startMinutes + ":" + i);
                    jLabel4_Time1.setText(j.getText());

                    if (i == 60) {
                        startMinutes++;
                        j.setText(startMinutes + ":" + i);
                    }
                }

            }

            second++;

        } catch (Exception e) {
        }
    }

    private void BufferImage() {
        if (i == 3) {
            maxtime1 = jLabel4_Time1.getText();
            if (WriteAndRead_Level1.arrayList.isEmpty()) {
                MyText date1 = new MyText();
                date1.setText(maxtime);
                MyText date2 = new MyText();
                date2.setText(maxtime1);
                arrayList.add(date1);
                new WriteAndRead_Level1().writeObject(maxtime1, maxtime);

            } else {
                MyText date1 = new MyText();
                date1.setText(maxtime);
                MyText date2 = new MyText();
                date2.setText(maxtime1);
                arrayList.add(date1);
                new WriteAndRead_Level1().writeObject(maxtime, maxtime1);
            }

            Thread thread = new Thread(() -> {
                JFrame frame = new JFrame();
                frame.getContentPane();
                JPanel panel = new JPanel();

                ImageIcon icon = new ImageIcon();
                JLabel label = new JLabel(icon, JLabel.CENTER);

                ImageIcon buffericon = new ImageIcon("src/gif/loading.gif");
                Image img = buffericon.getImage();
                Image newimg = img.getScaledInstance(300, 250, Image.SCALE_DEFAULT);

                icon = new ImageIcon(newimg);
                label.setBounds(0, 0, 500, 500);

                label.setIcon(icon);

                panel.setLayout(null);
                panel.add(label);
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                panel.setBackground(Color.white);
                frame.add(panel);
                frame.setUndecorated(true);
                frame.setSize(400, 400);
                frame.setVisible(true);
                frame.setBackground(new Color(0, 0, 0, 0));
                panel.setBackground(new Color(0, 0, 0, 0));
                label.setBackground(new Color(0, 0, 0, 0));
                frame.setLocation(750, 250);

                try {
                    Thread.sleep(2000);
                    frame.dispose();
                    dispose();
                    new Level_4().setVisible(true);
                    if (maxtime.isEmpty()) {
                        jLabel2_Moves.setText("0:0");
                    } else {

                    }
                } catch (Exception e) {
                }

                label.setSize(200, 200);
            });
            thread.start();
        }

    }

}
