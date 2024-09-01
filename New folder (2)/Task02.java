/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task02;

/**
 *
 * @author Mujtaba Abr
 */
public class Task02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      int  arr[]=new int[6];
      arr[0]=12;
         arr[1]=24;
            arr[2]=36;
               arr[3]=48;
                  arr[4]=60;
                  
for(int i=0;i<arr.length;i++){
    
    System.out.print(arr[i]+" ");
   
}
int add=6;
for(int i=arr.length-1;i>0;i--){
    arr[i]=arr[i-1];
}
        System.out.println();
arr[0]=add;
for(int i=0;i<arr.length;i++){
    
    System.out.print(arr[i]+" ");
   
}
 System.out.println();
    }
    
}
