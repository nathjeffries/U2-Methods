import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
        //create and run the program
        area(radius);
        circumference(radius);
        System.exit(0);
    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");
        double area = Math.pow(radius, 2) * Math.PI;
        JOptionPane.showMessageDialog(null, "The area is: " + round.format(area));
    }

    //re-write the method to calculate a circle's perimeter using parameters
        public static void circumference(double radius) {
            DecimalFormat round = new DecimalFormat("#.##");
            double circumference = 2 * radius * Math.PI;
            JOptionPane.showMessageDialog(null, "The circumference is: " + round.format(circumference));
        }
}
