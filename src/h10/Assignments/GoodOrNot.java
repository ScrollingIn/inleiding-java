package h10.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event. *;

public class GoodOrNot extends Applet {
    String s, text;
    TextField textfield;
    Label label;
    int input;

    public void init(){
        setBackground(Color.pink);
        setSize(200,100);
        label = new Label("Insert a number 1 - 10: ");
        textfield = new TextField("",3);
        textfield.addActionListener(new TextfieldListener());

        add(label);
        add(textfield);
    }

    public void paint(Graphics g){
        g.drawString(text,80,40);
    }

    class TextfieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = textfield.getText();
            input = Integer.parseInt( s );
            switch (input){
                case 1:
                    text = "bad";
                    break;
                case 2:
                    text = "bad";
                    break;
                case 3:
                    text = "bad";
                    break;
                case 4:
                    text = "inadequate";
                    break;
                case 5:
                    text = "mediocre";
                    break;
                case 6:
                    text = "adequate";
                    break;
                case 7:
                    text = "adequate";
                    break;
                case 8:
                    text = "good";
                    break;
                case 9:
                    text = "good";
                    break;
                case 10:
                    text = "good";
                    break;
                default:
                    text = "number inserted is not between 1-10!";
                    break;
            }
            repaint();
        }
    }
}
