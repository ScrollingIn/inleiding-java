package h11.Assignments;

import java.awt. *;
import java.awt.event. *;
import java.applet.Applet;

public class MoreTables extends Applet {

    int inputNumber, outputNumber;
    Button okButton;

    public void init(){
        okButton = new Button("ok");
        okButton.addActionListener(new ButtonListener());

        add(okButton);
        inputNumber = 1;
    }

    public void paint(Graphics g){
        int y = 0;
        for (int counter = 1; counter < 11; counter++){
            y += 20;
            if (inputNumber > 10){
                inputNumber = 1;
            }
            outputNumber = inputNumber * counter;
            g.drawString(inputNumber + " x " + counter + " = " + outputNumber,  40,y);

        }
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            inputNumber ++;
            repaint();
        }
    }
}
