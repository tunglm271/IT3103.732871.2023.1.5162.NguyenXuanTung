package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.LinkedList;

public class Store {
    private LinkedList<Media> itemsInStore = new LinkedList<Media>();


    private boolean checkMedia(Media disc) {
        for (Media item : itemsInStore) {
            if (item.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeMedia(Media disc) {
        if(checkMedia(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public void addMedia(Media disc) {
        if(!checkMedia(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }

    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("**********STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (Media item : itemsInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("*********************************");
        return string.toString();
    }
}
