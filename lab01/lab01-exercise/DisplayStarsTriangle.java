import java.util.Scanner;

public class DisplayStarsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of star: ");
        int starNumber = scanner.nextInt();
        for (int i = 0; i<starNumber;i++) {
            String space = " ".repeat(starNumber-i-1);
            System.out.print(space);
            String star = "*".repeat(2*i + 1);
            System.out.println(star);
        }
    }
}
