package lab5b;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane");

        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.GREEN);

        tab.addTab("RED", p1);
        tab.addTab("BLUE", p2);
        tab.addTab("GREEN", p3);

        tab.addChangeListener(e -> {
            String title = tab.getTitleAt(tab.getSelectedIndex());
            System.out.println(title + " tab selected");
        });

        frame.add(tab);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}