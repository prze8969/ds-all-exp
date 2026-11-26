import java.util.Scanner;

class queue{
  private int[] arr;
  private int front;
  private int back;
  private int capacity;
    public queue(int s){
    capacity = s;
    front = -1;
    back = -1;
    arr = new int[s];
  }

  public boolean isFull(){
    return back == capacity-1;
  }

  public boolean isEmpty(){
    return front == -1 || front>back;
  }

  public void enqueue(int val){
   
    // 2. front = 0 , rear = arbitrary value in the array
    // in this case we check if rear+1 = size, or basically if its full, and then input the value
   if(isFull()){
      System.out.println("The array is full, please delete some elements before using the insert operation"); 
    }
    //so lets discuss edge cases in insert
    // 1. front = rear = -1, the case which starts the queue
    if(front == -1){
      front = 0;
    }
    // this will set the front and rear to both 0 and store the value at the 0th index
    back+=1;
    arr[back] = val;
  }


  public int dequeue(){
    if(isEmpty()){
      System.out.println("The array is empty, please input something to delete it");
      return -1;
    }
    int v  = arr[front];
    if(front == back){
      front = -1;
      back = -1;
    }else {
      front++;
    }
    return v;
  }


  public int peek(){
    if(isEmpty()){
      System.out.println("Empty queue");
      return -1;
    }
    return arr[front];
    
  }
}


public class p05_queue_adt{
  public static void main(String[] args){
    System.out.println("Enter the size");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    queue q = new queue(size);
    System.out.println("Add the numbers to the queue");
    for(int i = 0 ; i<size ; i++){
      int e = sc.nextInt();
      q.enqueue(e);
      System.out.println("Added "+ e + " Successfully");
    }
    System.out.println("Removing the values as intended by the queue");
    for(int i = 0 ; i < size ; i++){
      int b = q.dequeue();
      System.out.println("Successfully removed " + b);
    }
    
  }
}
