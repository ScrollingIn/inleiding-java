package h12.Assignments;

import java.applet.Applet;
import java.awt.*;

public class AH12_1 extends Applet {
    int number[];
    double calculator1, calculator2,calculator3,calculator4,calculator5,calculator6,calculator7,calculator8,calculator9,calculator10;
    double answer;

    public void init(){
        number = new int[10];

        for (int counter = 0; counter < number.length; counter ++){
            number[counter] = 7 * counter + 5;
            calculator1 = number[0];
            calculator2 = number[1];
            calculator3 = number[2];
            calculator4 = number[3];
            calculator5 = number[4];
            calculator6 = number[5];
            calculator7 = number[6];
            calculator8 = number[7];
            calculator9 = number[8];
            calculator10 = number[9];
        }
    }

    public void paint(Graphics g){

        for (int counter = 0; counter < number.length; counter ++){
            g.drawString("" + number[counter ], 50, 20 * counter  + 20);
            answer = (calculator1 + calculator2 + calculator3 + calculator4 + calculator5 + calculator6 + calculator7 + calculator8 + calculator9 + calculator10) / 10;
            g.drawString("" + answer, 100,20);
        }
    }
}
