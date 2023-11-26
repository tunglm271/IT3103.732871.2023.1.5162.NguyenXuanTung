package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.Scanner;

//Nguyen Xuan Tung - 20215162
public class Aims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int option = scanner.nextInt();
        if(option == 1) {
            mediaDetailsMenu();
        }
    }

    public static void showMenu() {
        System.out.println(
                """
               AIMS:        
               --------------------------------
               1. View store
               2. Update store
               3. See current cart
               0. Exit
               --------------------------------
               Please choose a number: 0-1-2-3        
                        """);
    }

    public static void mediaDetailsMenu() {
        System.out.println(
                """
                Options:
                --------------------------------
                1. Add to cart
                2. Play
                0. Back
                --------------------------------
                Please choose a number: 0-1-2 
                        """);
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }
}
