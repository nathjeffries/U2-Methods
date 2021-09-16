import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
        //create and run the program
        area(radius);
        perimeter(radius);
        DecimalFormat round = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "The area is: " + round.format(area(radius)) + "\nThe perimeter is " + round.format(perimeter(radius)));
        System.exit(0);
    }

    private static double perimeter(double radius) {

        return 2 * radius * Math.PI;
    }


    public static double area(double radius) {

        return Math.pow(radius, 2) * Math.PI;

        //re-write the method to calculate a circle's area using parameters and return statement


        //re-write the method to calculate a circle's perimeter using parameters and return statement

    }
}
