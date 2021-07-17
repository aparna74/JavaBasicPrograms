package basic_numeric_operations;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer") ;
        int num=sc.nextInt();
        if((num%2)==0)System.out.println("Even");
        else System.out.println("Odd");
    }

}
