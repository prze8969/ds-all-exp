class p06_cir_queue_adt{
  int[] arr;
  int front;
  int back;
  int size;
  int capacity;

  p06_cir_queue_adt(int s){
    size = 0;
    front = -1;
    back = -1 ;
    arr = new int[s];
    capacity = s;
  }

  public boolean isEmpty(){
    return front == -1;
  }
  public boolean isFull(){
    return size == capacity;
  }

  public void enqueue(int val){
    if(front == -1){
      front = 0;
      back = 0;
    }else{
      back = (back+1)%capacity;
    }
    if(isFull()){
      System.out.println("Stack overflow");
      return;
    }
    
    arr[back] = val;
    size++;
    return;    

 }

 public int dequeue(){
   if(isEmpty()){
     System.out.println("stack underflow");
     return -1;  
   }
   int temp = arr[front];
   front = (front+1)%capacity;
   size--;
   return temp;
 }

 public void display(){
  if(isEmpty()){
    System.out.println("Stack is empty");
    return;
  }
   int i = front;
   for(int j = 0 ; j < capacity ; j++){
     System.out.println(arr[i]);
     i = (i+1)%capacity;
   }}
    public static void main(String[] args) {

        p06_cir_queue_adt q = new p06_cir_queue_adt(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        q.display();

        System.out.println("Deleted: " + q.dequeue());

        q.display();
    }

        
      }





 
 
