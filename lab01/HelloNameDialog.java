//Example 2: hello dialog
import javax.swing.*;
//Nguyen Xuan Tung -20215162
public class HelloNameDialog {
    public static void main(String[] args) {
        String result = JOptionPane.showInputDialog("Nguyen Xuan Tung - 5162. lease enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
