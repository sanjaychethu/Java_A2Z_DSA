


import java.util.Arrays;

/**
 * basics
 */
public class basics {

    public static void main(String[] args) {
       int arr [] = {67,231,121,12,7};
       System.out.println("The Original Array is " );
       for(int num : arr){
        System.out.print(num + " ");
       }
       Arrays.sort(arr);
       System.out.println("The Sorted Array is ");
       for(int num : arr ){
        System.out.print(num + " ");
       }

    }
}