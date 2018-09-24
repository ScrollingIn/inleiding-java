package h10.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighestNumber extends Applet {
    TextField textfield;
    int number, counter;
    Label label;
    String s,text;

    public void init(){
        setBackground(Color.pink);
        label = new Label("Insert a number, the highest number will be saved:");
        textfield = new TextField("",10);
        textfield.addActionListener(new TextfieldListener());

        text = "";
        add(label);
        add(textfield);
        counter = 0;
    }

    public void paint(Graphics g){
        g.drawString("Highest number: " + counter, 7,40);
    }

    class TextfieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
        s = textfield.getText();
        number = Integer.parseInt( s );
        if (number > counter){
            text = "" + number;
            counter =  number;
        }
        else {
            text = "" + counter;
        }
        repaint();
        }
    }
}
