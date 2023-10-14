package lab01;
//Example 4: show two Number
import javax.swing.*;
//Nguyen Xuan Tung -20215162
public class ShowTwoNumbers {

    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotifications = "You're just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,"NX Tung - 5162. Please enter the first number:",
                "Nguyen Xuan Tung - 5162. Enter the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"NX Tung - 5162. Please enter the second number:",
                "Nguyen Xuan Tung - 5162. Enter the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotifications = strNum1 + " and " + strNum2;

        JOptionPane.showMessageDialog(null,strNotifications,
                "Show two Numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
