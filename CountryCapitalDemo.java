package lab5c;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Capitals");

        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        HashMap<String, String> capital = new HashMap<>();

        capital.put("USA", "Washington D.C.");
        capital.put("India", "New Delhi");
        capital.put("Vietnam", "Hanoi");
        capital.put("Canada", "Ottawa");
        capital.put("Denmark", "Copenhagen");
        capital.put("France", "Paris");
        capital.put("Great Britain", "London");
        capital.put("Japan", "Tokyo");
        capital.put("Africa", "No Single Capital");
        capital.put("Greenland", "Nuuk");
        capital.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);
        JScrollPane sp = new JScrollPane(list);

        sp.setBounds(50, 30, 220, 220);

        list.addListSelectionListener(e -> {
            String country = list.getSelectedValue();
            System.out.println(country + " Capital: " + capital.get(country));
        });

        frame.add(sp);
        frame.setSize(340, 320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}