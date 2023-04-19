/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Vipul
 */
public class WriteAndRead_Level2 {
    
    private final String realpath = System.getProperty("user.dir");
    private final File file = new File(realpath + "/Score");
    private final File textFile = new File(file + "/SokobanSocre_Level_2.txt");
    public static Object txt;
    public static ArrayList<MyText> arrayList = new ArrayList();

    public void writeObject(String MinTime, String MaxTime) {

        MyText myText1 = new MyText();
        myText1.setText(MinTime);
        MyText myText2 = new MyText();
        myText2.setText(MaxTime);

        arrayList.add(myText1);
        arrayList.add(myText2);

        file.mkdir();
        if (file.exists()) {

            try {
                textFile.createNewFile();
            } catch (Exception ex) {

            }
            if (textFile.exists()) {
                try {
                    try (FileOutputStream fout = new FileOutputStream(textFile)) {
                        ObjectOutputStream oout = new ObjectOutputStream(fout);
                        Collections.sort(arrayList, new ScoreComparator());
                        Iterator<MyText> it = arrayList.iterator();
                        while (it.hasNext()) {
                            MyText next = it.next();
                            
                            
                             oout.writeObject(arrayList);

                        }
                       

                        oout.close();
                    }

                } catch (Exception e) {
                }
            } else {
                try {
                    textFile.createNewFile();
                } catch (Exception e) {
                }
            }

        } else {
            file.mkdir();
        }

    }

    public Object readObject() {
        try {
            ObjectInputStream oin;
            try (FileInputStream fin = new FileInputStream(textFile)) {
                oin = new ObjectInputStream(fin);

                ArrayList text = (ArrayList) oin.readObject();
                txt = text.get(1);
                textFile.delete();
                System.out.println(""+txt);
            }
            oin.close();
        } catch (Exception e) {
        }

        return txt;
    }

    public static void main(String[] args) {
        new WriteAndRead_Level1().readObject();
    }

}
