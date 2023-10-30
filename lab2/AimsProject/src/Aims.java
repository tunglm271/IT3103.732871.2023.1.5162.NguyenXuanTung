//Nguyen Xuan Tung - 20215162
public class Aims {
    public static void main(String[] args) {
        // Tao instance anOrder của class Cart
        Cart anOrder = new Cart();
        // Them dvd1, dvd2, dvd3 vao order
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //In ra tong so tien cua don hang
        System.out.println("Total cost is" + '\n' + anOrder.totalCost());


        // kiem tra method remove cua class Cart
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total cost is %.2f",anOrder.totalCost());
    }

}
