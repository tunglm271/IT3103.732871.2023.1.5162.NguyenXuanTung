//Nguyen Xuan Tung -20215162
import java.util.Scanner;
//Example 6; solving equations
public class EquationSolver {
    public static void main(String[] args) {
        System.out.println(
                """
                1.giai phuong trinh bac 1
                2. giai he phuong trinh
                3. giai phuong trinh bac 2"""
        );
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("format: ax + b = 0 ");
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                linearEquation(a,b);
            }
            case 2 -> {
                SystemEquations();
            }
            case 3 -> {
                TwoDegreeEquation();
            }

            default -> System.exit(0);
        }
    }

    public static void linearEquation(int a, int b) {
        System.out.print("result: ");
        System.out.println((a==0 && b == 0) ?"Infinite result":((a == 0) ?"no solution": (double) -a/b));

    }

    public static void SystemEquations() {
        System.out.println("Format: \na11*x1+ a12*x2 = b1 \na21*x1 + a22*x2 = b2\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a11: ");
        int a11 = scanner.nextInt();
        System.out.print("a12: ");
        int a12 = scanner.nextInt();
        System.out.print("b1: ");
        int b1 = scanner.nextInt();
        System.out.print("a21: ");
        int a21 = scanner.nextInt();
        System.out.print("a22: ");
        int a22 = scanner.nextInt();
        System.out.print("b2: ");
        int b2 = scanner.nextInt();

        int D = a11*a22 - a21*a12;
        int D1 = b1*a22 - b2*a12;
        int D2 = b2*a11 - b1*a21;

        System.out.println("x1: " + (double) D1/D);
        System.out.println("x1: " + (double) D2/D);


    }

    public static void TwoDegreeEquation() {
        System.out.println("Format: a*x^2 + b*x c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a b c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = b*b - 4*a*c;

        int x1 = 0, x2 = 0;

        if(delta < 0) {
            System.out.println("No solution");
        } else if(delta == 0) {
            System.out.println("x: " + (double) -b/(2*a));
        } else {
            System.out.println("x1: " + (double) ((-b + Math.sqrt(delta))/(2*a)) + " x2: " + (double) ((-b - Math.sqrt(delta))/(2*a)));
        }

    }
}
