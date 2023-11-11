package lab01.hust.soict.dsai.lab1.exercise;

import javax.swing.*;

public class CustomedChoosingOption {
    public static void main(String[] args) {
        String[] options = {"i do","i don't"};

        int option = JOptionPane.showOptionDialog(null,
                "do you want to change to the first class ticket ?",null,
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        JOptionPane.showOptionDialog(null,
                "You've chosen:" + (option==JOptionPane.YES_OPTION?"i do":"i don't"),
                null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        System.exit(0);

    }
}
