/*

@ (#) Show.java 1.0 03/02/26

        *

        Example 2.1

        *

        */

// import the required classes from the Java library
import java.awt. *;
import java.applet. *;

// a class named Show of type Applet
public class AppletSecondAssignment extends java.applet.Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Malina", 50, 60 );
        g.setColor(Color.red);
        g.drawString("de Jonge", 50, 70 );
    }

}
