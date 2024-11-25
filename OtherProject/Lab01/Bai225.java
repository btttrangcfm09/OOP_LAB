import javax.swing.JOptionPane;
public class Bai225{
    public static void main(String[] args){
        String number1 = JOptionPane.showInputDialog("Plase enter your first number");
        String number2 = JOptionPane.showInputDialog("Please enter your second number");
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        // Print the sum 
        System.out.print("The sum of two number: ");
        System.out.println(num1+num2);
        // Print the difference
        System.out.print("the difference if two number: ");
        System.out.println(num1-num2);
        // Print the product
        System.out.print("the product of two number: ");
        System.out.println(num1*num2);
        // Print quotient 
        System.out.print("the quotient of two number: ");
        System.out.println(num1/num2);
    }
}