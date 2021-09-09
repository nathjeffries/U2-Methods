import javax.swing.*;
import java.text.DecimalFormat;
public class LemonadeStand {

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
        double numSmallCups = Double.parseDouble(JOptionPane.showInputDialog("How many 16 oz cups of lemonade did you sell?"));
        double numLargeCups = Double.parseDouble(JOptionPane.showInputDialog("How many 20 oz cups of lemonade did you sell?"));

        total(numSmallCups,numLargeCups);
        System.exit(0);
    }
public static void total(double numSmallCups, double numLargeCups){
        double smallCupCost = (numSmallCups * 0.5) * 1.075;
        double largeCupCost = (numLargeCups * 0.99) * 1.075;
        double totalCost = smallCupCost + largeCupCost;
    DecimalFormat round = new DecimalFormat("##.##");

    JOptionPane.showMessageDialog(null, "The Total Cost with tax is: $" + round.format(totalCost));
}
}
