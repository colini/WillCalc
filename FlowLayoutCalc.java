/**
 * Created by ingarfie_902980 on 5/27/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutCalc extends Applet
                            implements ActionListener{
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button equals;
    Button info;
    TextField field;
    JFrame frame;
    JPanel gridPanel;
    JPanel rowOne;
    JPanel rowTwo;
    JPanel rowThree;
    JPanel rowFour;
    JPanel rowFive;
    JPanel rowSix;

    public void init(){

        JButton addition = new JButton("    +    ");
        JButton subtraction = new JButton("    -    ");
        JButton multiplication = new JButton("    *   ");
        JButton division = new JButton("    /    ");
        JButton one = new JButton("   1    ");
        JButton two = new JButton("   2   ");
        JButton three = new JButton("   3   ");
        JButton four = new JButton("   4   ");
        JButton five = new JButton("   5   ");
        JButton six = new JButton("   6   ");
        JButton seven = new JButton("   7   ");
        JButton eight = new JButton("   8   ");
        JButton nine = new JButton("   9   ");
        JButton zero = new JButton("   0   ");
        JButton clear = new JButton("   C   ");
        JButton equals = new JButton("   =   ");
        JButton info = new JButton(" Info ");
        JTextField field = new JTextField("",30);

        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(0,1,0,0));
        add(gridPanel);
        {
            rowOne = new JPanel();
            rowOne.setLayout(new FlowLayout());
            gridPanel.add(rowOne);
            {
                rowOne.add(field);
            }
        }
        {
            rowTwo = new JPanel();
            rowTwo.setLayout(new FlowLayout());
            gridPanel.add(rowTwo);
            {
                rowTwo.add(addition);
                rowTwo.add(subtraction);
                rowTwo.add(multiplication);
                rowTwo.add(division);
            }
            rowThree = new JPanel();
            rowThree.setLayout(new FlowLayout());
            gridPanel.add(rowThree);
            {
                rowThree.add(seven);
                rowThree.add(eight);
                rowThree.add(nine);
                rowThree.add(clear);
            }
            rowFour = new JPanel();
            rowFour.setLayout(new FlowLayout());
            gridPanel.add(rowFour);
            {
                rowFour.add(four);
                rowFour.add(five);
                rowFour.add(six);
                rowFour.add(equals);
            }
            rowFive = new JPanel();
            rowFive.setLayout(new FlowLayout());
            gridPanel.add(rowFive);
            {
                rowFive.add(one);
                rowFive.add(two);
                rowFive.add(three);
                rowFive.add(info);
            }
            rowSix = new JPanel();
            rowSix.setLayout(new FlowLayout());
            gridPanel.add(rowSix);
            {
                rowSix.add(zero);
            }

        }
        gridPanel.setVisible(true);


    }

    public void paint(Graphics g)
    {

    }

    public void actionPerformed(ActionEvent evt){
        if (evt.getSource() == info)
        {
            JOptionPane.showMessageDialog(, "TEST");
        }

    }
}
