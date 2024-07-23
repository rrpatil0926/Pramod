package ex21072024;

import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {

        System.out.println("Enter number for *");
        // Create a Scanner object
        Scanner n = new Scanner(System.in);
        int p= n.nextInt();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
