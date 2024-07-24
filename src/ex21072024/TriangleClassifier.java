package ex21072024;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        System.out.println("Enter 1st length for triangle");
        // Create a Scanner object
        Scanner n = new Scanner(System.in);
        int p = n.nextInt();
        System.out.println("Enter 2nd length for triangle");
        // Create a Scanner object
        Scanner q = new Scanner(System.in);
        int r = q.nextInt();
        System.out.println("Enter 3rd length for triangle");
        // Create a Scanner object
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if( (p==r) && (r==t) && (p==t) )
        {
            System.out.println("triangle is equilateral");

        } else if ((p==r && r!=t) || (r==t && t!=p) || (p==t && t!=r) ) {
            System.out.println("triangle is isosceles");
        } else if ((p!=r) && (r!=t) && (p!=t) ) {
            System.out.println("triangle is scalene");
        }

    }
}
