package exp28072024;

import java.util.Arrays;

public class highestSalaryArrays {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        int size= salaries.length;
        System.out.println("second highest salary is"+salaries[size-2]);

    }
}
