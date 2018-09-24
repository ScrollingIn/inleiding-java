package h10.Assignments;

import java.awt. *;
import java.applet.Applet;
import java.awt.event. *;


public class Months extends Applet {
    TextField textfield;
    Label label;
    String s, text;
    int monthNumber;

    public void init(){
        setBackground(Color.pink);
        label = new Label("Insert a month number!");
        textfield = new TextField("",10);
        textfield.addActionListener(new TextfieldListener());

        add(textfield);
        add(label);
    }

    public void paint(Graphics g){
        g.drawString("Name month and number of days -> " + text, 20,60);
    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = textfield.getText();
            monthNumber = Integer.parseInt( s );
            switch (monthNumber){
                case 1:
                    text = "January, 31 days";
                    break;
                case 2:
                    text = "February, 28 days";
                    break;
                case 3:
                    text = "March, 31 days";
                    break;
                case 4:
                    text = "April, 30 days";
                    break;
                case 5:
                    text = "May, 31 days";
                    break;
                case 6:
                    text = "June, 30 days";
                    break;
                case 7:
                    text = "July, 31 days";
                    break;
                case 8:
                    text = "August, 31 days";
                    break;
                case 9:
                    text = "September, 30 days";
                    break;
                case 10:
                    text = "October, days 31";
                    break;
                case 11:
                    text = "November, 30 days";
                    break;
                case 12:
                    text = "December, 31 days";
                    break;
                default:
                    text = "The number you inserted is not a month Number, try again.";
                    break;
            }
            repaint();
        }
    }
}
