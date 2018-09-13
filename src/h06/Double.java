import java.awt. *;
import java.applet. *;


public class Double extends Applet {
    int a, b, c;
    double outcome;


    public void init () {
        a = 8;
        b = 8;
        c = 3;
        outcome = (a + b) / c;
    }

    public void paint (Graphics g) {
        g.drawString ("The result is:" + outcome, 20, 20);
    }
}