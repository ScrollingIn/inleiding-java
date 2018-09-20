package h08;

import java.applet.Applet;
import java.awt. *;
import java.awt.event.*;

public class Buttons extends Applet {
    Button button;
    String screentext;

    public void init() {
        button = new Button();
        screentext = "Does this do something?";
        ButtonListener kl = new ButtonListener();
        button.addActionListener( kl );
        button.setLabel( "Click me Senpai" );
        add(button);
        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        g.drawString(screentext, 150, 40 );
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            screentext = "Hewwo Senpai";
            repaint();
        }
    }
}
