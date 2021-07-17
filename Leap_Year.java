package basic_numeric_operations;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        check_leap(year);

    }
    static void check_leap(int year){
        if((year%4)==0 && (year%100)==0  &&(year%400)==0)
            System.out.println("leap year");
        else System.out.println("Not a leap year");

    }
}
