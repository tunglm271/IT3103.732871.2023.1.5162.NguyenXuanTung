package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
public class TestCart {
    public static void main(String[] args) {
        Cart cart = new hust.soict.dsai.aims.cart.Cart();
      DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation",
                4.5f,"Roger Allers",87);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(1,"Star wars","Science Fiction",
                24.95f,"Geogre Lucas",87);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(1, "Aladin","Animation",14.5f,
                "i don't know",79);
        cart.addMedia(dvd3);

       cart.print();

       //Test search by ID method
        cart.searchById(3);
        cart.searchById(4);

        //Test search by Title method
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("abc");


    }
}
