import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    JFrame window;
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;
    Color scrubsBlue = new Color (23, 23, 189);
    Color hospitalWhite = new Color (239, 239, 239);
    Color scrubsMint = new Color (48, 196, 134);
    //Declare your frame, panel and three buttons.

    public static void main(String[] args) {

        new ColorSwitchGUI();

    }
    public ColorSwitchGUI() {
        //create your GUI
        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);



        panel = new JPanel();
        button1 = new JButton("Blue");
        button2 = new JButton("White");
        button3 = new JButton("Mint");

        button1.addActionListener(new Change1());
        button2.addActionListener(new Change2());
        button3.addActionListener(new Change3());
        //Set the colors of our buttons and panel

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);

        window.setVisible(true);
    }

    private class Change1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(scrubsBlue);

            //add listeners to change the colors. Don't forget to link them to buttons.
        }
    }
    private class Change2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(hospitalWhite);


        }
    }
    private class Change3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(scrubsMint);


        }
    }

}
