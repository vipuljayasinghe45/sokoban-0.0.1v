/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

/**
 *
 * @author Vipul
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Guide extends JFrame {

    private final JLabel Image = new JLabel();
    private final JTextField textUsername = new JTextField(50);
    private final ImageIcon icon1 = new ImageIcon("src/Images/B_1.jpg");
    private final Font font;
    private Robot robot;

    public Guide() {

        super("Guide");

        // get font
        font = textUsername.getFont();
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        Image image = icon1.getImage(); // transform it 
        Image newimg = image.getScaledInstance(489, 500, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ImageIcon icon2 = new ImageIcon(newimg);
        Image.setIcon(icon2);

        //font seetings
        int size = (int) (font.getSize() * 2);
        textUsername.setFont(new Font(font.getName(), Font.BOLD, size));
        constraints.gridx = 0;
        newPanel.add(Image, constraints);

        textUsername.setColumns(21);

        constraints.gridx = 0;
        newPanel.add(textUsername, constraints);

        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Notice"));

        // add the panel to this framey
        add(newPanel);
        // setDefaultCloseOperation(E);
        setUndecorated(true);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSED));
        setLocation(200, 200);
        pack();

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Guide().setVisible(true);

            }
        });
       new Guide().doing();
       
    }

    public final void doing() {
        try {

            // use robot
            robot = new Robot();
            robot.setAutoDelay(100);
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
