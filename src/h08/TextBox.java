package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextBox extends Applet {
    TextField textfield;
    Label label;
    String s;

    public void init(){
        setSize(400,90);
        setBackground(Color.pink);
        textfield = new TextField("Type something");
        label = new Label("Type something Senpai " + "and press enter");
        textfield.addActionListener( new TextfieldListener() );
        add(label);
        add(textfield);
        s = "";
    }
    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }
    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();
            repaint();
        }
    }
}
