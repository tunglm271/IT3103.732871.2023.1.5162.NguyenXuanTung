import java.util.Date;
import java.util.Scanner;

//Nguyen Xuan Tung - 20215162
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is" + '\n' + anOrder.totalCost());


        // test removing items function

        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total cost is %.2f",anOrder.totalCost());
    }

}
