/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import PlaceHolder.PlaceHolder;
import java.awt.Color;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vipul
 */
public class MapLevel1 extends javax.swing.JFrame {

    private final HashMap<String, Vector> Image_Store = new HashMap<>();
    private final Vector<ImageIcon> img_vector = new Vector();
    private ImageIcon icon;
    private String imagePath;

    private int in_click = img_vector.size();
    private int x;
    private static final JTextField textField = new JTextField();
    private String data;
    private String selectedMap;

    /**
     * Creates new form MapLevel1
     */
    public MapLevel1() {

        initComponents();
        loadComboMap();
        jTextField1.setEditable(false);
        jTextField1.setToolTipText("Search Maps");
        jButton1_search.setEnabled(false);

        PlaceHolder place = new PlaceHolder();
        place.setPlaceholder("Search  Maps");

        jTextField1.setForeground(Color.LIGHT_GRAY);
        textField.setText(place.getPlaceholder());

        jTextField1.setText(textField.getText());

        try {

            Stream<Path> list = Files.list(Paths.get("src\\Maps\\"));
            Iterator<Path> iterator = list.iterator();
            while (iterator.hasNext()) {

                imagePath = iterator.next().toString();

                icon = new ImageIcon(imagePath);

                img_vector.add(icon);
            }

        } catch (Exception e) {
        }

        Image_Store.put("Images", img_vector);

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
        jPanel2_Map = new javax.swing.JPanel();
        jLabel1_map = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1_search = new javax.swing.JButton();
        jComboBox1_map = new javax.swing.JComboBox();
        jButton1_prev = new javax.swing.JButton();
        jButton2_Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(737, 789));
        setMinimumSize(new java.awt.Dimension(737, 789));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 850));

        jPanel2_Map.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel2_Map.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_map.setAlignmentX(737.0F);
        jLabel1_map.setAlignmentY(789.0F);
        jLabel1_map.setPreferredSize(new java.awt.Dimension(737, 789));
        jPanel2_Map.add(jLabel1_map, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 58, 700, 770));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2_Map.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 200, 30));

        jButton1_search.setText("Search");
        jButton1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchActionPerformed(evt);
            }
        });
        jPanel2_Map.add(jButton1_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 80, 30));

        jComboBox1_map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1_mapMouseClicked(evt);
            }
        });
        jComboBox1_map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_mapActionPerformed(evt);
            }
        });
        jComboBox1_map.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1_mapKeyPressed(evt);
            }
        });
        jPanel2_Map.add(jComboBox1_map, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 250, 30));

        jButton1_prev.setText("Prev");
        jButton1_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_prevActionPerformed(evt);
            }
        });

        jButton2_Next.setText("Next");
        jButton2_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2_Map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1_prev, jButton2_Next});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2_Map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_prev)
                    .addComponent(jButton2_Next))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1_prev, jButton2_Next});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_NextActionPerformed

        if (in_click >= 0) {

            if (in_click != img_vector.size()) {

                jLabel1_map.setIcon(img_vector.get(in_click++));
                x = in_click;

            } else {
                if (in_click == img_vector.size()) {

                    jLabel1_map.setIcon(img_vector.get(in_click - 1));

                }

            }

        }
    }//GEN-LAST:event_jButton2_NextActionPerformed

    private void jButton1_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_prevActionPerformed

        Iterator<Vector> iterator = Image_Store.values().iterator();
        if (in_click > 0) {

            if (iterator.hasNext()) {

                --in_click;
                System.out.println(in_click);

                jLabel1_map.setIcon((Icon) iterator.next().get(in_click));

            }
        } else {
            JOptionPane.showMessageDialog(this, "OUT OF MAPS");
        }

    }//GEN-LAST:event_jButton1_prevActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText(" ");

        jTextField1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchActionPerformed
        String text = jTextField1.getText();
        SearchMap(text);
    }//GEN-LAST:event_jButton1_searchActionPerformed

    private void jComboBox1_mapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1_mapKeyPressed

    }//GEN-LAST:event_jComboBox1_mapKeyPressed

    private void jComboBox1_mapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1_mapMouseClicked
        if (jComboBox1_map.isFocusable()) {

            jButton1_search.setEnabled(true);
        }


    }//GEN-LAST:event_jComboBox1_mapMouseClicked

    private void jComboBox1_mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_mapActionPerformed
        selectedMap = jComboBox1_map.getSelectedItem().toString();
        if(!selectedMap.equals("Select you Map First")){
            jTextField1.setText(selectedMap);
        }else{
            jTextField1.setText("Search");
        }
    }//GEN-LAST:event_jComboBox1_mapActionPerformed

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
            java.util.logging.Logger.getLogger(MapLevel1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapLevel1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapLevel1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapLevel1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapLevel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_prev;
    private javax.swing.JButton jButton1_search;
    private javax.swing.JButton jButton2_Next;
    private javax.swing.JComboBox jComboBox1_map;
    private javax.swing.JLabel jLabel1_map;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_Map;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void SearchMap(String mapName) {
        
        try {

            Stream<Path> list = Files.list(Paths.get("src\\Maps\\"));
            Iterator<Path> iterator = list.iterator();
            if(!mapName.equals("Search")){
                while(iterator.hasNext()) {

                imagePath = iterator.next().toString();
                data = imagePath.substring(9);
                data = data.substring(0, 7);

                if (mapName.trim().equals(data)) {
                    icon = new ImageIcon(imagePath);
                    jLabel1_map.setIcon(icon);

                } else{
                    System.out.println("Not Ok");
                }
            }
            }else{
                JOptionPane.showMessageDialog(this, "Select Your Map First", "Error Message",JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }

    private void loadComboMap() {
        try {
            DefaultComboBoxModel combo = (DefaultComboBoxModel) jComboBox1_map.getModel();
            Stream<Path> list = Files.list(Paths.get("src\\Maps\\"));
            Iterator<Path> iterator = list.iterator();

            Vector<String> pathsData = new Vector();
             pathsData.add("Select you Map First");
            while (iterator.hasNext()) {
                imagePath = iterator.next().toString();
                String subImagepath = imagePath.substring(9);
                String Path = subImagepath.substring(x, 7);
               
                pathsData.add(Path);
                combo.addElement(pathsData);
                jComboBox1_map.setModel(new DefaultComboBoxModel(pathsData));
            }

            System.out.println("" + imagePath);
        } catch (Exception e) {
        }

    }

}
