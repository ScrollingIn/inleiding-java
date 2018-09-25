package h10.Assignments;

import java.awt.event. *;
import java.applet.Applet;
import java.awt.*;

public class AverageNumber extends Applet {
    int number1, number2, number3, number4, number5, average;
    TextField textfield1, textfield2, textfield3, textfield4, textfield5;
    String s, inputNumber1, inputNumber2, inputNumber3, inputNumber4, inputNumber5, result;
    Button okButton;
    Label label;

    public void init() {
        setBackground(Color.pink);
        setSize(612,225);
        label = new Label("Insert up to 5 numbers to get an Average -> ");
        okButton = new Button("ok");
        okButton.addActionListener(new ButtonListener());

        textfield1 = new TextField("", 5);
        textfield2 = new TextField("", 5);
        textfield3 = new TextField("", 5);
        textfield4 = new TextField("", 5);
        textfield5 = new TextField("", 5);

        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        number5 = 0;
        average = 0;

        result = "waiting";
        inputNumber1 = "waiting";
        inputNumber2 = "waiting";
        inputNumber3 = "waiting";
        inputNumber4 = "waiting";
        inputNumber5 = "waiting";

        add(label);
        add(textfield1);
        add(textfield2);
        add(textfield3);
        add(textfield4);
        add(textfield5);
        add(okButton);
    }

    public void paint(Graphics g) {
        g.drawString("1 = " + inputNumber1, 20, 40);
        g.drawString("2 = " + inputNumber2, 20, 60);
        g.drawString("3 = " + inputNumber3, 20, 80);
        g.drawString("4 = " + inputNumber4, 20, 100);
        g.drawString("5 = " + inputNumber5, 20, 120);
        g.drawString("the average = " + average, 180, 80);
        g.drawString("Result = " + result,180,100);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield1.getText();
            number1 = Integer.parseInt(s);
            s = textfield2.getText();
            number2 = Integer.parseInt(s);
            s = textfield3.getText();
            number3 = Integer.parseInt(s);
            s = textfield4.getText();
            number4 = Integer.parseInt(s);
            s = textfield5.getText();
            number5 = Integer.parseInt(s);
            if (number1 > 5){
                inputNumber1 = number1 + " is good";
            }
            else{
                inputNumber1 = number1 + " is not good enough";
            }
            if (number2 > 5){
                inputNumber2 = number2 + " is good";
            }
            else{
                inputNumber2 = number2 + " is not good enough";
            }
            if (number3 > 5){
                inputNumber3 = number3 + " is good";
            }
            else{
                inputNumber3 = number3 + " is not good enough";
            }
            if (number4 > 5){
                inputNumber4 = number4 + " is good";
            }
            else{
                inputNumber4 = number4 + " is not good enough";
            }
            if (number5 > 5){
                inputNumber5 = number5 + " is good";
            }
            else{
                inputNumber5 = number5 + " is not good enough";
            }
            average = (number1 + number2 + number3 + number4 + number5) / 5;
            if (average > 5){
                result = "you passed!";
            }
            else{
                result = "You did not pass =(";
            }
            repaint();
        }
    }
}
