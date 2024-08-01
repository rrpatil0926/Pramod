package exp28072024;

import java.util.Scanner;

public class leftTrianglePattern {

        public static void main(String[] args) {
            System.out.println("Enter the number of rows to print *");
            Scanner n = new Scanner(System.in);
            int num = n.nextInt();
            for (int i = num; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }


}
