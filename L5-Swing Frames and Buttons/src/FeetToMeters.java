import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton buttonFeet = new JButton("Click to convert to feet");
        JButton buttonMeters = new JButton("Click to convert to meters");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //window centered on screen
        window.setLocationRelativeTo(null);
        buttonFeet.addActionListener(new QuoteButtonListener1());
        buttonMeters.addActionListener(new QuoteButtonListener1.QuoteButtonListener2());

        panel.add(buttonFeet);
        panel.add(buttonMeters);
        window.add(panel);



        window.setVisible(true);

    }

    private static class QuoteButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           Double feet = Double.parseDouble(JOptionPane.showInputDialog("How many feet?"));
           Double convertedMeters = feet * 0.3048;
            DecimalFormat round = new DecimalFormat("##.##");
            JOptionPane.showMessageDialog(null, round.format(convertedMeters) + " meters");
        }

        private static class QuoteButtonListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                Double meters = Double.parseDouble(JOptionPane.showInputDialog("How many meters?"));
                Double convertedFeet = meters * 3.28084;
                DecimalFormat round = new DecimalFormat("##.##");
                JOptionPane.showMessageDialog(null, round.format(convertedFeet) + " feet");
            }

            }
        }
    }

