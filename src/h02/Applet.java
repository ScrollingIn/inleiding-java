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
public class Applet extends java.applet.Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}