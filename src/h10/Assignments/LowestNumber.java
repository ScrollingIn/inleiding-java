package h10.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LowestNumber extends Applet {
    TextField textfield;
    int aantalGetallen;
    int inputnumber, highestNumber, lowestNumber;
    Label label;
    String s;

    public void init(){
        setBackground(Color.pink);
        label = new Label("Insert a number, the highest and lowest number will be saved:");
        textfield = new TextField("",10);
        textfield.addActionListener(new TextfieldListener());
        aantalGetallen = 0;
        add(label);
        add(textfield);
    }

    public void paint(Graphics g){
        g.drawString("Highest number: " + highestNumber, 7,40);
        g.drawString("Lowest number:  " + lowestNumber,7,60);
    }

    class TextfieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            aantalGetallen++;
            s = textfield.getText();
            inputnumber = Integer.parseInt(s);
            if (aantalGetallen == 1) {
                highestNumber = inputnumber;
                lowestNumber = inputnumber;
            } else if (inputnumber < lowestNumber) {
                lowestNumber = inputnumber;
            } else if (inputnumber > highestNumber) {
                highestNumber = inputnumber;
            }
            repaint();
        }
    }
}

