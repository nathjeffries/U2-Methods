import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
   static JTextField inputField1, inputField2;
   static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);


        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("X");
        JButton divide = new JButton("/");

        resultLabel = new JLabel("0.00");

        window.setSize(250, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        add.addActionListener(new addListener());
        subtract.addActionListener(new subtractListener());
        multiply.addActionListener(new multiplyListener());
        divide.addActionListener(new divideListener());


        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
        panel.add(resultLabel);
        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);


        window.add(panel);

        window.setVisible(true);

    }

   private static class addListener implements ActionListener{

       public void actionPerformed(ActionEvent actionEvent) {
           double number1 = Double.parseDouble(inputField1.getText());
           double number2 = Double.parseDouble(inputField2.getText());


           resultLabel.setText(String.valueOf(number1 + number2));
       }
   }
    private static class subtractListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 - number2));
        }
    }
    private static class multiplyListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 * number2));
        }
    }
    private static class divideListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 / number2));
        }
    }
}
