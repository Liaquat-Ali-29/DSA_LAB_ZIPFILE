package queue_lab_06;
public class Queue_Lab_06 {
public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    private Node front;
    private Node rare;
    
    Queue_Lab_06(){
        this.front=null;
        this.rare=null;
    }  
    public void Enqueue(int data){
        Node newNode=new Node(data);
           if(front==null){
               front=rare=newNode;
           }
           else{
               rare.next  = newNode;
               rare=newNode;
           }
        }
    
    public int dequeue(){
        if(front==null){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int temp = front.data;
            front = front.next;
            return temp;
        }
    }
         public void peek(){
             System.out.println("Number on Peak: "+front.data); 
         }
     
     public void display(){
         if(front==null){
             System.out.println("Queue is Empty");
         }
         else{
         Node temp = front;
         while(temp!=null){
             System.out.print(temp.data+" -->");
             temp = temp.next;           
         }
             System.out.println("null");
         }
     
     }
    public static void main(String[] args) {
        Queue_Lab_06 q1 = new Queue_Lab_06();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.display();
        q1.dequeue();
        q1.Enqueue(8);
        q1.Enqueue(88);
        q1.display();
        q1.peek();
        q1.dequeue();
        q1.display();
        
    }
    
}

