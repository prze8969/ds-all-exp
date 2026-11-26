import java.util.Scanner;

class stack{
    private int[] arr;
    private int top;
    private int size;

    public stack(int capacity){
        arr = new int[capacity];
        size = capacity;
        top = -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public boolean isEmpty(){
        return top ==-1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("The stack is full!");
            return;
        }
        top++;
        arr[top] = val;
        System.out.println("Successfully inputted the value entered " + val);
        return;
    }
}

public class p01_stack_adt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Initializing an array of lenght?");
        int s = sc.nextInt();
        stack stk  = new stack(s);

        System.out.println("Enter the values");
        for(int i = 0 ; i < s ; i++){
            int value = sc.nextInt();
            stk.push(value);
        }

        System.out.println("Popping the last values one by one");
        for(int i = 0 ; i < s ; i++){
            int e = stk.pop();
            System.out.println("Successfully popped " +e);
        }
        
   }
    
}
