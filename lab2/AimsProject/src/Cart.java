//Nguyen Xuan Tung - 20215162
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return false;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The disc have been added");
            return true;
        }
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                return true;
            }
        }
        return false;
    }

    public float totalCost() {
        float sum = 0f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }


}

