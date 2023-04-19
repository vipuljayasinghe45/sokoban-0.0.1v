/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Vipul
 */
public class Splash extends JFrame {

    private static JFrame frame;
    private static Robot robot;
    private final JLabel jLabel3;
    private final  JTextField text = new JTextField(20);

    private final Font f;

    public Splash() {

        frame = new JFrame();
        jLabel3 = new JLabel();
        f = jLabel3.getFont();
        ImageIcon icon1 = new ImageIcon("src/Images/B_1.jpg");
        Image image = icon1.getImage(); // transform it 
        Image newimg = image.getScaledInstance(480, 500, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ImageIcon icon2 = new ImageIcon(newimg);
        jLabel3.setIcon(icon2);
        text.setSize(10, 20);
       
        int size = (int) (f.getSize() * 5);
        text.setFont(new Font(f.getName(), Font.BOLD, size));

        jLabel3.setVisible(true);
        // jLabel3.setEnabled(true);

        frame.add(jLabel3);
        frame.add(text);
        frame.setSize(500, 1000);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocation(750, 30);

    }

    public final void doing() {
        try {

            robot = new Robot();
            robot.setAutoDelay(400);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_SPACE);
            
           
            robot.keyPress(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyPress(KeyEvent.VK_SPACE);
        
            robot.keyPress(KeyEvent.VK_K);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_K);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_N);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            frame.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash().doing();
    }

}
