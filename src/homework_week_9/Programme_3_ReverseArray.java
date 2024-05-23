package homework_week_9;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 67, 78}; // single dimention array
        System.out.println("Original array: " + Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray(); // declaring object
        System.out.println("Reverse array : ");
        obj.resveAnArray(array);
    }

    //Method to reserve an array
    public void resveAnArray(int[] list) {
        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));

    }


}
