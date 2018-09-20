package h08.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtwCalculator extends Applet {
    double reader, total;
    TextField textfield;
    Button button1;
    Label label;

    public void init() {
        setBackground(Color.pink);
        label = new Label("Btw Calculator");

        textfield = new TextField("", 20);
        textfield.addActionListener(new TextfieldListener());

        button1 = new Button("ok");
        Button1Listener bl1 = new Button1Listener();
        button1.addActionListener(bl1);

        add(textfield);
        add(button1);
        add(label);
    }
    public void paint(Graphics g) {
        g.drawString("Total: " + total, 50, 60);
    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = textfield.getText();
            reader = Double.parseDouble( s );
            total = reader * 1.21;
            repaint();
        }
    }
    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = textfield.getText();
            reader = Double.parseDouble( s );
            total = reader * 1.21;
            repaint();
        }
    }
}


