package h08.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet {
    Button button1, button2, button3, button4;
    TextField textfield1, textfield2;
    Double outcome, income1, income2;
    Label label;

    public void init() {
        setBackground(Color.pink);
        setSize(210,150);
        label = new Label("Calculator");
        textfield1 = new TextField("",10);
        textfield2 = new TextField("",10);
        outcome = 0.0;

        button1 = new Button(" + ");
        Button1Listener bl1 = new Button1Listener();
        button1.addActionListener(bl1);

        button2 = new Button(" - ");
        Button2Listener bl2 = new Button2Listener();
        button2.addActionListener(bl2);

        button3 = new Button(" * ");
        Button3Listener bl3 = new Button3Listener();
        button3.addActionListener(bl3);

        button4 = new Button(" / ");
        Button4Listener bl4 = new Button4Listener();
        button4.addActionListener(bl4);

        add(textfield1);
        add(textfield2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString("outcome = " + outcome, 10, 70);
    }


    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = textfield1.getText();
            income1 = Double.parseDouble(s1);
            String s2 = textfield2.getText();
            income2 = Double.parseDouble(s2);
            outcome = income1 + income2;
            repaint();
        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s1 = textfield1.getText();
            income1 = Double.parseDouble(s1);
            String s2 = textfield2.getText();
            income2 = Double.parseDouble(s2);
            outcome = income1 - income2;
            repaint();
        }
    }

    class Button3Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s1 = textfield1.getText();
            income1 = Double.parseDouble(s1);
            String s2 = textfield2.getText();
            income2 = Double.parseDouble(s2);
            outcome = income1 * income2;
            repaint();
        }
    }

    class Button4Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s1 = textfield1.getText();
            income1 = Double.parseDouble(s1);
            String s2 = textfield2.getText();
            income2 = Double.parseDouble(s2);
            outcome = income1 / income2;
            repaint();
        }
    }
}
