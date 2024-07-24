package ex21072024LabPractice;
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" +i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz" +i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz" +i);
            } else {
                System.out.println(i);
            }
        }
    }
}
