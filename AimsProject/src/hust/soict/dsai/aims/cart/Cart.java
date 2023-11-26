package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.LinkedList;

//Nguyen Xuan Tung - 20215162
public class Cart {

    // so luong toi da dvd co the co trong cart
    public static final int MAX_NUMBERS_ORDERED = 20;
    // Mảng lưu các dvd được thêm vao cart

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + "is already in the cart !");
        } else {
            itemsOrdered.add(item);
        }
    }


    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        } else {
            System.out.println(item.getTitle() + "is not in the cart !");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }
    public void sortByTitle() {

    }

    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        int i = 1;
        for (Media item : itemsOrdered) {
            output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                    +item.getCost() + " $\n");
            i++;
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("*******************************************\n");
        System.out.println(output);
    }

    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }

    }

    public void searchByTitle(String title) {
       for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }




}

