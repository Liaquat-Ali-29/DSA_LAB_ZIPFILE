/*
 * This code demonstrates deleting an element from an array in Java.
 */
package task03;

public class TASK03 {

    public static void main(String[] args) {
        int[] arr = {13, 26, 39, 52, 65};

        
        System.out.println("Array before deletion:");
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        int deleteIndex = 2;
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; 
        System.out.println("Array after deletion:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}