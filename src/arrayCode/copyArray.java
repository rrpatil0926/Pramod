package arrayCode;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] arr1={10,2,30,49,15} ;
        int[] arr2= new int[arr1.length];
        Arrays.sort(arr1);

        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("1st array is::"+arr1[i]);
            arr2[i]=arr1[i];
            System.out.println("2nd array is::"+arr2[i]);

        }
        System.out.println(Arrays.toString(arr2));



    }

}
