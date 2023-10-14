package lab01;
//Example5: Calculate two number
import javax.swing.*;
// Tinh toan tong, hieu, tich, thuong tu 2 so nhap vao
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,"NX Tung - 5162. Please enter the first number:",
                "Nguyen Xuan Tung - 5162. Enter the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"NX Tung - 5162. Please enter the second number:",
                "Nguyen Xuan Tung - 5162. Enter the second number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,"sum:"  + (num1+num2) +"\n"
        + "difference: " + (num1 - num2) +"\n"
        + "product: " + num1*num2 + "\n"
        + "quotient: " + num1/num2);
        System.exit(0);
    }
}
