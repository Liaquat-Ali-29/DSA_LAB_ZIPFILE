/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2ex2;

/**
 *
 * @author Mujtaba Abr
 */
public class Task2ex2 {

    public static void main(String[] args) {
        int[] arr=new int[6] ; 
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("Array before insertion ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " +i +" : " + arr[i]);
        }
        int newElement =250;
        int position =2; 
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];}
        
        arr[position] = newElement;
        System.out.println("Array after changing element in the middle");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i+ " : " + arr[i]);
        }
    }
}