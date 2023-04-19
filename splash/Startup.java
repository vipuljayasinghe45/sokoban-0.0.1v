/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

import Game.Frame_1;
import Guide.Guide;
import Guide.Guide2;
import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Vipul
 */
public class Startup extends JFrame {

    private final JLabel jLab;
    private final JLabel jLab1;
    private static JFrame frame;
    private final Font f;

    private ImageIcon icon;
    private ImageIcon icon2;
    private ImageIcon imageIcon;

    public Startup() {
        frame = new JFrame();

        jLab = new JLabel();
        jLab1 = new JLabel();
        icon = new ImageIcon("src/gif/A_2.gif");
        icon2 = new ImageIcon("");
        Image image = icon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(500, 500, Image.SCALE_DEFAULT); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);

        jLab.setIcon(imageIcon);
        jLab1.setIcon(icon2);

        f = jLab.getFont();
        jLab.setOpaque(true);
        int size = (int) (f.getSize() * 10);
        jLab.setFont(new Font(f.getName(), Font.BOLD, size));
        jLab.setBackground(Color.LIGHT_GRAY);
        frame.add(jLab);

        frame.setSize(1400, 500);
        frame.setUndecorated(true);
        frame.setLocation(200, 200);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        jLab.setBackground(new Color(0, 0, 0, 0));
        frame.setBackground(new Color(0, 0, 0, 0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there

    }

    public void doSomething() {
        char[] array = {'S', 'O', 'K', 'O', 'B', 'A', 'N'};

        jLab.setText("" + array[0]);
        new TextToSpeech.TextToSpeech().speech("S");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1]);
        new TextToSpeech.TextToSpeech().speech("O");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1] + "" + array[2]);
        new TextToSpeech.TextToSpeech().speech("K");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1] + "" + array[2] + ""
                + array[3]);
        new TextToSpeech.TextToSpeech().speech("O");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1] + "" + array[2] + ""
                + array[3] + "" + array[4]);
        new TextToSpeech.TextToSpeech().speech("B");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1] + "" + array[2] + ""
                + array[3] + "" + array[4] + "" + array[5]);
        new TextToSpeech.TextToSpeech().speech("A");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        jLab.setText("" + array[0] + "" + array[1] + "" + array[2] + ""
                + array[3] + "" + array[4] + "" + array[5] + "" + array[6]);
        new TextToSpeech.TextToSpeech().speech("N");
        try {

        } catch (Exception e) {
        }

        new TextToSpeech.TextToSpeech().speech("SOKOBAN");
    }

    public static void main(String[] args) {

        WebLookAndFeel.install();
        new Startup().doSomething();
        try {
            Thread.sleep(1500);
            frame.dispose();
        } catch (Exception e) {
        }

        Guide2 guide1 = new Guide2();
        guide1.setVisible(true);

        try {
            Thread.sleep(3000);
            guide1.dispose();
            Guide guide = new Guide();
            guide.setVisible(true);
            guide.doing();

            guide.dispose();

            new Frame_1().setVisible(true);
        } catch (Exception e) {
        }

    }
}
