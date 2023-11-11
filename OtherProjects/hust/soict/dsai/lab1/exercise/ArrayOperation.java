package lab01.hust.soict.dsai.lab1.exercise;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] myArray = {123, 1234, 6345 , 1246 , 3435};

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int sum = 0;
        for(int i:myArray) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum/myArray.length);

    }
}
