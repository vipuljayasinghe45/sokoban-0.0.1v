/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import java.io.Serializable;

/**
 *
 * @author Vipul
 */
public class MyText implements Serializable {

    private String Text;

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    @Override
    public String toString() {
        return Text;
    }
    
    

}
