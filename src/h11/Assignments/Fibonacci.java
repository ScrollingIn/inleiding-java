package h11.Assignments;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        int input1 = 1, input2 = 1, output;
        for(int i=0;i<100;i++){
            output = input1 + input2;
            input2 = input1;
            input1 = output;
            g.drawString(output+"",10,20*i);
        }
    }
}
