/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import java.util.Comparator;

/**
 *
 * @author Vipul
 */
public class ScoreComparator implements Comparator<MyText> {

    String[] arrString1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    String data1;
    String data2;
    String data3;
    String data4;

    @Override
    public int compare(MyText t, MyText t1) {

        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        int no4 = 0;


        String text1 = t.getText();
        String[] arr1 = text1.split(":");

        data1 = arr1[0];
        data2 = arr1[1];

        String[] arrString2 = {data1};

        char char1 = arrString2[0].charAt(0);
        char char2 = arrString2[0].charAt(1);

        String[] arrString3 = {data2};

        char char3 = arrString3[0].charAt(0);
        char char4 = arrString3[0].charAt(1);

        int num1 = Integer.parseInt(String.valueOf(char1));
        int num2 = Integer.parseInt(String.valueOf(char2));
        int num3 = Integer.parseInt(String.valueOf(char3));
        int num4 = Integer.parseInt(String.valueOf(char4));

        String text2 = t1.getText();
        String[] arr2 = text2.split(":");

        data3 = arr2[0];
        data4 = arr2[1];

        String[] arrString4 = {data3};

        char char5 = arrString4[0].charAt(0);
        char char6 = arrString4[0].charAt(1);

        String[] arrString5 = {data4};

        char char7 = arrString4[0].charAt(0);
        char char8 = arrString4[0].charAt(1);

        int num5 = Integer.parseInt(String.valueOf(char5));
        int num6 = Integer.parseInt(String.valueOf(char6));
        int num7 = Integer.parseInt(String.valueOf(char7));
        int num8 = Integer.parseInt(String.valueOf(char8));

        if (num1 > num5) {
            System.out.println("" + num1);
            no1 = num5;

        } else {
            no1 = num1;
        }

        if (num2 > num6) {
            System.out.println("" + num2);
            no2 = num6;
        } else {
            no2 = num2;
        }
        if (num3 > num7) {
            System.out.println("" + num3);
            no3 = num7;
        } else {
            no3 = num3;
        }
        if (num4 > num8) {
            System.out.println("" + num4);
            no4 = num8;
        } else {
            no4 = num4;
        }

        int number2 = num1 + num2 + num3 + num4;
        int number1 = num5 + num6 + num7 + num8;
        if (number1 == number2) {
            return 0;
        }
        if ((number1 > number2)) {
            return 1;
        }else{
           
        }
        
        if(number2> number1){
            return 1;
        }else{
            return -1;
        }

    }

}
