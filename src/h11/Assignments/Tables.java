package h11.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event. *;

public class Tables extends Applet {
    int inputNumber, outputNumber;
    TextField textfield;
    Label label;
    String s;
    int counter;

    public void init(){
        setSize(150,915);
        label = new Label("Tables");
        textfield = new TextField("",3);
        textfield.addActionListener(new TextfieldListener());

        add(label);
        add(textfield);
    }
    public void paint(Graphics g){
        int y = 20;

        for (counter = 1; counter < 41; counter++){
            y  += 20;
            outputNumber = inputNumber * counter;
            g.drawString(inputNumber + " x " + counter + " = " + outputNumber,20,y);

        }
    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();
            inputNumber = Integer.parseInt(s);
            repaint();
        }
    }

}
