/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_linked_list;

/**
 *
 * @author Mujtaba Abr
 */
public class Lab3_Linked_List {

   public class Node{
       Node next;
       int data;
       Node(int data){
           this.next=null;
           this.data=data;
       } } 
   private Node head; 
   public void linkedlist_task(){
       this.head= null;
   } 
   public void Delete(){ 
       if(head==null){ 
           System.out.println("the list is empty");
           System.out.println("the number is inserted"); 
       } } 
   public void startBeg(int data){
       Node newNode =new Node(data);
       newNode.next=head; 
       head=newNode; 
       System.out.print("Inserted");
      
   }
   
   public void printall(){
       Node current= head; 
       while(current != null){
           System.out.print(current.data+" -->");
           current=current.next;
       } }
   public void deleteFromBeginning() {
       if (head != null) {
           head = head.next;
       }
       else { System.out.println("List is empty"); 
       } } 
   public void deleteFromEnd() {
       if (head == null) { 
           System.out.println("List is empty");
       } 
       else if (head.next == null) { 
           head = null; } 
       else { Node current = head;
       while (current.next.next != null) {
           current = current.next;
       }
       current.next = null;
       } }
   public boolean search(int key) {
       Node current = head;
       while (current != null) { 
           if (current.data == key) {
               return true;
           } 
           current = current.next; 
       }
       return false;
   }
   public static void main(String args[]){ 
       Lab3_Linked_List list=new Lab3_Linked_List(); 
       list.startBeg(10); 
       list.startBeg(20); 
       list.startBeg(30);
       list.printall(); 
       list.deleteFromBeginning(); 
       list.printall(); 
       list.search(10); 
       list.printall(); 
       list.deleteFromEnd(); 
       list.printall(); } }
    

