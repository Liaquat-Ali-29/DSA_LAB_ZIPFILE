/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_lab;

public class Stack_lab {
    int top;
    int capasity;
    int arr[];
Stack_lab(){
    top=-1;
    capasity=5;
    arr=new int[capasity];
}
public boolean isEmpty(){
        return top==-1;
    }
public boolean isFull(){
        return top==capasity-1;
    }
    public int push(int data){
    if(isFull()){
        System.out.println("Stack is full");

    }
  return arr[++top]=data;
  }
    public int Pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");

    }
  return arr[--top];
  }
  public int peek(){
      return arr[top];
  }

   
    public static void main(String[] args) {
        Stack_lab L=new Stack_lab();
        L.push(333);
        L.push(434);
        L.push(45);
        L.push(88);
       
        System.out.println(L.Pop());
        System.out.println(L.peek());
        System.out.println(L.isEmpty());
       System.out.println(L.isFull());
    }
    
}
