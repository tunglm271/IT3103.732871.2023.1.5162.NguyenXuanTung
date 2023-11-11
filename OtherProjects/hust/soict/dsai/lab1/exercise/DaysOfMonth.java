package lab01.hust.soict.dsai.lab1.exercise;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        NumberOfDate(month,year);
    }

    public static void NumberOfDate(String month, int year) {
        switch (month.toUpperCase()) {
            case "JANUARY", "JAN." , "JAN" , "1" -> System.out.println(31);
            case "FEBRUARY", "FEB." , "FEB" , "2" -> {
                if(year % 4 == 0) {
                    System.out.println(28);
                } else {
                    System.out.println(29);
                }
            }
            case "MARCH", "MAR." , "MAR" , "3" -> System.out.println(31);
            case "APRIL", "APR." , "APR" , "4" -> System.out.println(30);
            case "MAY", "MAY.", "5" -> System.out.println(31);
            case "JUNE", "JUN." , "JUN" , "6" -> System.out.println(31);
            case "JULY", "JUL." , "JUL" , "7" -> System.out.println(31);
            case "AUGUST", "AUG." , "AUG" , "8" -> System.out.println(31);
            case "SEPTEMBER", "SEP." , "SEP" , "9" -> System.out.println(31);
            case "OCTOBER", "OCT." , "OCT" , "10" -> System.out.println(31);
            case "NOVEMBER", "NOV." , "NOV" , "11" -> System.out.println(31);
            case "DECEMBER", "DEC." , "DEC" , "12" -> System.out.println(31);



        }
    }
}
