package lab5a;
import javax.swing.*;
import javax.swing.event.*;

public class CountryListDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        JList<String> list = new JList<>(countries);
        JScrollPane sp = new JScrollPane(list);

        sp.setBounds(50, 30, 200, 220);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Selected Country: " + list.getSelectedValue());
            }
        });

        frame.add(sp);
        frame.setSize(320, 320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}