import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quotes {

    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click to display quote 1");
        JButton button2 = new JButton("Click to display quote 2");
        JButton button3 = new JButton("Click to display quote 3");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //window centered on screen
        window.setLocationRelativeTo(null);
        button1.addActionListener(new ButtonListener1());
        button2.addActionListener(new ButtonListener1.ButtonListener2());
        button3.addActionListener(new ButtonListener1.ButtonListener2.ButtonListener3());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);


        window.setVisible(true);

    }

    private static class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Is that some sort of disease \n -Mr. Law 2021");
        }

        private static class ButtonListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "In the long run we are all dead \n -John Maynard Keynes");
            }

            private static class ButtonListener3 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "You Blitz all night! If they cross the line of scrimmage I'm gonna take every last one of you out. You make sure that they remember, forever! the night they played the Titans! \n -Coach Yoast");
                }
            }
        }
    }
}