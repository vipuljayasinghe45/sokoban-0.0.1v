/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaceHolder;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author Vipul
 */

  public class PlaceHolder extends JTextField {

    public static void main(final String[] args) {
        final PlaceHolder tf = new PlaceHolder("");
        tf.setColumns(20);
       
        final Font f = tf.getFont();
     
        
        tf.setFont(new Font(f.getName(), f.getStyle(), 30));
        JOptionPane.showMessageDialog(null, tf);
    }

    private String placeholder;

    public PlaceHolder() {
    }

    public PlaceHolder(
        final Document pDoc,
        final String pText,
        final int pColumns
        
    )
    {
        super(pDoc, pText, pColumns);
    }

    public PlaceHolder(final int pColumns) {
        super(pColumns);
    }

    public PlaceHolder(final String pText) {
        super(pText);
    }

    public PlaceHolder(final String pText, final int pColumns) {
        super(pText, pColumns);
    }

    public String getPlaceholder() {
        return placeholder;
    }

    @Override
    protected void paintComponent(final Graphics pG) {
        super.paintComponent(pG);

        if (placeholder == null || placeholder.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getDisabledTextColor());
        g.drawString(placeholder, getInsets().left, pG.getFontMetrics()
            .getMaxAscent() + getInsets().top);
    }

    public void setPlaceholder(final String s) {
        placeholder = s;
    }

}  

