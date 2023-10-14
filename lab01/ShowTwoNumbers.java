package lab01;

import javax.swing.*;

public class ShowTwoNumbers {

    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotifications = "You're just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,"Please enter the first number:",
                "Enter the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please enter the second number:",
                "Enter the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotifications = strNum1 + " and " + strNum2;

        JOptionPane.showMessageDialog(null,strNotifications,
                "Show two Numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
