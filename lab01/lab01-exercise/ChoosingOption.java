import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "do you want to change to the first class ticket ?",null,JOptionPane.YES_NO_OPTION);
        JOptionPane.showConfirmDialog(null,
                "You've chosen:" + (option==JOptionPane.YES_OPTION?"Yes":"No"),null,JOptionPane.YES_NO_OPTION);
        System.exit(0);

    }
}