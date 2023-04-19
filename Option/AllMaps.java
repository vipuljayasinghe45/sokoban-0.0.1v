/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Option;

import GamesLevel.Level_1;
import GamesLevel.Level_2;
import GamesLevel.Level_3;
import GamesLevel.Level_4;
import GamesLevel.Level_5;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Vipul
 */
public class AllMaps extends JFrame {

    JFrame jframe;
    JButton btn;

    private ImageIcon icon;
    private String imagePath;
    JButton buttons[] = new JButton[5];
    String names[] = {"Foo", "Bar", "Baz", "Fob", "Bao"};
    ArrayList<Icon> ImagePaths = new ArrayList<>();
    ArrayList< String> btns = new ArrayList<>();
    int i;

    public void Maps() {

        jframe = new JFrame();
        try {

            Stream<Path> list = Files.list(Paths.get("src\\IconMaps\\"));
            Iterator<Path> iterator = list.iterator();
            while (iterator.hasNext()) {
                imagePath = iterator.next().toString();
                icon = new ImageIcon(imagePath);
                ImagePaths.add(icon);

            }

        } catch (Exception e) {
        }

        for (i = 0; i < buttons.length; i++) {

            btn = new JButton(names[i]);
            buttons[i] = btn;
            btns.add(btn.getActionCommand());

            btn.setIcon(ImagePaths.get(i));
            jframe.add(btn);

        }
        System.out.println("" + btn.getActionCommand());

        jframe.setSize(1300, 1000);
        jframe.setLocation(250, 50);
        jframe.setLayout(new GridLayout(2, 3));
        jframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jframe.setVisible(true);

        buttons[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (btns.get(0).equals("Foo")) {
                    new Level_1().setVisible(true);
                }
            }
        });
        buttons[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (btns.get(1).equals("Bar")) {
                    new Level_2().setVisible(true);
                }
            }
        });
        buttons[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (btns.get(2).equals("Baz")) {
                    new Level_3().setVisible(true);
                }
            }
        });
        buttons[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (btns.get(3).equals("Fob")) {
                    new Level_4().setVisible(true);
                }
            }
        });
        buttons[4].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (btns.get(4).equals("Bao")) {
                    new Level_5().setVisible(true);
                }
            }
        });

    }

    public static void main(String[] args) {
        new AllMaps().Maps();
    }

}
