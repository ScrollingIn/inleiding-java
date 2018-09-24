package h10.Assignments;

import java.awt. *;
import java.applet.Applet;
import java.awt.event. *;


public class LeapYearMonths extends Applet {
    TextField textfield, textfield2;
    Label label, label2;
    String s, s2, text, text2;
    int monthNumber, yearNumber;

    public void init() {
        setSize(573, 100);
        setBackground(Color.pink);
        label = new Label("Insert a year and month number and press enter!");
        textfield = new TextField("", 10);
        textfield.addActionListener(new TextfieldListener());

        label2 = new Label("month");
        textfield2 = new TextField("", 10);
        textfield2.addActionListener(new TextfieldListener());

        add(label);
        add(textfield);
        add(label2);
        add(textfield2);
    }

    public void paint(Graphics g) {
        g.drawString("Number of the year is -> " + text, 20, 60);
        g.drawString("Name month and number of days -> " + text2, 20, 80);
    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textfield.getText();
            yearNumber = Integer.parseInt(s);
            s2 = textfield2.getText();
            monthNumber = Integer.parseInt(s2);
            if ((yearNumber % 4 == 0 && !(yearNumber % 100 == 0)) ||
                    yearNumber % 400 == 0) {
                text = "is a leap year";
                switch (monthNumber) {
                    case 1:
                        text2 = "January, with 31 days";
                        break;
                    case 2:
                        text2 = "February, with 29 days";
                        break;
                    case 3:
                        text2 = "March, with 31 days";
                        break;
                    case 4:
                        text2 = "April, with 30 days";
                        break;
                    case 5:
                        text2 = "May, with 31 days";
                        break;
                    case 6:
                        text2 = "June, with 30 days";
                        break;
                    case 7:
                        text2 = "July, with 31 days";
                        break;
                    case 8:
                        text2 = "August, with 31 days";
                        break;
                    case 9:
                        text2 = "September, with 30 days";
                        break;
                    case 10:
                        text2 = "October, with days 31";
                        break;
                    case 11:
                        text2 = "November, with 30 days";
                        break;
                    case 12:
                        text2 = "December, with 31 days";
                        break;
                    default:
                        text2 = "The number you inserted is not a month Number, try again.";
                        break;
                }

            } else {
                text = "is not a leap year";
                switch (monthNumber) {
                    case 1:
                        text2 = "January, with 31 days";
                        break;
                    case 2:
                        text2 = "February, with 28 days";
                        break;
                    case 3:
                        text2 = "March, with 31 days";
                        break;
                    case 4:
                        text2 = "April, with 30 days";
                        break;
                    case 5:
                        text2 = "May, with 31 days";
                        break;
                    case 6:
                        text2 = "June, with 30 days";
                        break;
                    case 7:
                        text2 = "July, with 31 days";
                        break;
                    case 8:
                        text2 = "August, with 31 days";
                        break;
                    case 9:
                        text2 = "September, with 30 days";
                        break;
                    case 10:
                        text2 = "October, with days 31";
                        break;
                    case 11:
                        text2 = "November, with 30 days";
                        break;
                    case 12:
                        text2 = "December, with 31 days";
                        break;
                    default:
                        text2 = "The number you inserted is not a month Number, try again.";
                        break;
                }
            }
            repaint();
        }
    }
}