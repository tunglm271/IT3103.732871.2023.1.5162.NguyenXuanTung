//Nguyen Xuan Tung - 20215162
public class Cart {

    // so luong toi da dvd co the co trong cart
    public static final int MAX_NUMBERS_ORDERED = 20;
    // Mảng lưu các dvd được thêm vao cart
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    // Số Lượng dvd hiện có trong cart
    private int qtyOrdered;

    //Hàm thêm Dvd vào Order
    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full !");
            return false;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The disc " + '\"' +disc.getTitle() + '\"' + " have been added ! ");
            return true;
        }
    }



    // Ham bo dvd ra khoi order
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOrdered[0] ==  null) {
            System.out.println("Cart is empty !");
            return false;
        }

        for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove dvd " + '\"'+ disc.getTitle() + '\"' + " successfully !");
                return true;
            }
        }
        System.out.println("No dvd match !");
        return false;
    }
    // Hàm tính tổng số tiền của order
    public float totalCost() {
        float sum = 0f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

}

