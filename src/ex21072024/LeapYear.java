package ex21072024;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    System.out.println("Enter the Year");
    // Create a Scanner object
    Scanner n = new Scanner(System.in);
    int year = n.nextInt();
      //if(((year%4==0 )||(year%100!=0))&&(year%400==0))
        if(((year%4==0 )&&(year%100!=0))||(year%400==0))
    {

        System.out.println("this is a leap year");

    }else
    {
        System.out.println("this is a not leap year");
    }

    }
}