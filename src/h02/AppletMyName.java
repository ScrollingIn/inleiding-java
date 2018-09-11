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
public class AppletMyName extends java.applet.Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Malina de Jonge", 50, 60 );
    }

}