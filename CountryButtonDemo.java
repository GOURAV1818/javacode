package lab4b;

import javax.swing.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JButton b1, b2;
    JLabel label;

    CountryButtonDemo() {
        frame = new JFrame("Country Button");

        b1 = new JButton("Srilanka");
        b2 = new JButton("India");
        label = new JLabel();

        b1.setBounds(50, 50, 120, 40);
        b2.setBounds(200, 50, 120, 40);
        label.setBounds(80, 130, 250, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(label);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            label.setText("Srilanka is pressed");
        else
            label.setText("India is pressed");
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}