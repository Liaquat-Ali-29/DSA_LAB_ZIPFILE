/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4ex02;

/**
 *
 * @author Mujtaba Abr
 */
public class Task4ex02 {

     public static void main(String[] args) {
        int arr[]={4, 6, 2, 8, 10};
        int element =8;
        boolean flag=false;
        for(int i=0;i<=arr.length;i++){
            if(element==arr[i]){
                System.out.println("Element "+element+" is found at index "+i);
                flag=true;
                break;
            }
            
        }
        if(flag==false){
             System.out.println("elemetn is not found");   
                }
    }
}