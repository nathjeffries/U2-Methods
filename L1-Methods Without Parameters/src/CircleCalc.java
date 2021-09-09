import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
area();
circumference();
System.exit(0);
        //call the circumference method

    }
public static void area(){
        DecimalFormat round = new DecimalFormat("#.##");
    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle"));
        double area = Math.pow(radius,2) * Math.PI;
    JOptionPane.showMessageDialog(null, "The area is: " + round.format(area));
}
    //write a method to calculate a circle's area
public static void circumference (){
    DecimalFormat round = new DecimalFormat("#.##");
       double diameter  = Double.parseDouble(JOptionPane.showInputDialog("Enter the diameter of the circle"));
        double circumference = diameter * Math.PI;
    JOptionPane.showMessageDialog(null, "The circumference is: " + round.format(circumference));
}

    //write a method to calculate a circle's circumference

}
