package hust.soict.dsai.test.polymorphism;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {

    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc(1,"Cinderella",
                "fantasy",4.5f,"BPL",90);
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Happy new year",3));
        tracks.add(new Track("I want it that way",4));
        CompactDisc cd = new CompactDisc(2,"Tong hop nhac 90's", "Nhac nuoc ngoai" , 3.5f,"various artist",tracks);

        List<String> authors = new ArrayList<String>();
        authors.add("Agatha");
        Book book = new Book(3,"Ten Little Niggers","detective",5.2f,authors);
        mediae.add(dvd);
        mediae.add(cd);
        mediae.add(book);

        for(Media item : mediae) {
            System.out.println(item);
        }
    }

}
