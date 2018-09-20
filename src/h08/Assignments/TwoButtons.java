package h08.Assignments;

import java.applet.Applet;
import java.awt.*;
import java.awt.event. *;

public class TwoButtons extends Applet {
    TextField textField1;
    Button button1, button2;
    Label label;
    String s;

    public void init() {
        setSize(350,78);
        setBackground(Color.pink);
        label = new Label("type in here ->");
        textField1 = new TextField("", 20);

        button1 = new Button("ok");
        Button1Listener bl1 = new Button1Listener();
        button1.addActionListener(bl1);

        button2 = new Button("reset");
        Button2Listener bl2 = new Button2Listener();
        button2.addActionListener(bl2);

        add(label);
        add(textField1);
        add(button1);
        add(button2);
        s = "";
    }
    public void paint(Graphics g) {
        g.drawString(s, 5, 50 );
    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textField1.getText();
            repaint();
        }
    }
    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField1.setText("");
            s = "";
            repaint();
        }
    }
}