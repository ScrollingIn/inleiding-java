package h12.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event. *;
import java.util.Arrays;

public class AH12_3 extends Applet {
    Button okButton;
    TextField[] textFields;
    String s1;
    int[] numbers;

    public void init(){
        okButton = new Button("ok");
        okButton.addActionListener(new  ButtonListener());
        textFields = new TextField[5];
        numbers = new int[5];
        for (int counter = 0; counter < textFields.length; counter ++) {
            textFields[counter] = new TextField();
            add(textFields[counter]);
        }
        add(okButton);

    }

    public void paint(Graphics g){
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for (int counter = 0; counter < numbers.length; counter++){
                s1 = textFields[counter].getText();
                numbers[counter] = Integer.parseInt( s1 );
            }
            Arrays.sort(numbers);
            for (int counter = 0; counter < numbers.length; counter++){
                textFields[counter].setText(String.valueOf(numbers[counter]));

            }

        }
    }



}
