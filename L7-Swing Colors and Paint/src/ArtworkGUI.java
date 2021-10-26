import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {
JFrame frame;
    //DECLARE VARIABLES

    public ArtworkGUI()
    {
        frame = new JFrame("Artwork");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();
        frame.add(panel);
        frame.setVisible(true);

        frame.setVisible(true);
        //CREATE THE GUI
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.lightGray);
        }
        public void paintComponent (Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(100, 100, 200, 200);
            g.setColor(Color.WHITE);
            g.fillOval(125, 125, 150, 150);
            g.setColor(Color.RED);
            g.fillOval(150, 150, 100, 100);
            g.setColor(Color.BLUE);
            g.fillOval(175,175,50,50);
            g.setColor(Color.WHITE);
            g.drawLine(208,195,200,180);
            g.drawLine(192,195,200,180);
            g.drawLine(208,195,220,195);
            g.drawLine(211,205,220,195);
            g.drawLine(192,195,180,195);
            g.drawLine(180,195,190,205);
            g.drawLine(187,218,190,205);
            g.drawLine(211,205,213,218);
            g.drawLine(213,218,200,208);
            g.drawLine(187,218,200,208);

        }
            //Add the PaintComponent Method and create your drawing.
        }
}
