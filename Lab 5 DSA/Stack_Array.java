
package stack_array;
public class Stack_Array {

   
 
    int top;
    int capasity;
    int arr[];
    Stack_Array(){
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
    

  public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");

    }
      System.out.println(arr[++top]=data);
  }
  public void Pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");

    }
      System.out.println(arr[--top]);
  }
  public void peek(){
      System.out.println("Peek :"+arr[top]);
  }

    public static void main(String[] args) {
       Stack_Array L=new Stack_Array();
       L.push(44);
       L.push(33);
       L.push(45);
       L.push(12);

       L.push(99);
       L.peek();
       L.Pop();
       L.isEmpty();
       
} 
}
