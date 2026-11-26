import java.util.Stack;

class stack{
    int[] arr;
    int top;
    int size;

    stack(int s){
        size = s;
        arr = new int[s];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == size-1;
    }
    void push(int val){
        if(isFull()){
            System.out.println("Full stack");
            return;
        }
        top++;
        arr[top] = val;
        return;
    }
    int pop(){
        if(isEmpty())
        {
            System.out.println("Empty stack");
            return -1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }
    void display(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        int j = 0;
        for(int i = top ; i<=0 ; i--){
            System.out.println( j + "-- > " + arr[i]);
            j++;
        }
    }
}



class paren_checker{
    boolean eval(String e){
        int size = e.length();
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i< size ; i++){
            char ch = e.charAt(i);
            if(ch == '(' ||ch == '[' ||ch == '{'){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                
                char tp = stk.peek();
                if(tp == '{' && ch == '}' ||
                    tp == '[' && ch == ']' ||
                    tp == '(' && ch == ')'
                ){
                    stk.pop();
                } else{
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}



class postfix_to_infix{
    int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    String eval(String exp){
        Stack<Character> stk = new Stack<>();
        StringBuilder s = new StringBuilder();
        int size = exp.length();
        for(int i = 0 ; i < )
    }
}

public class allfivecombined {
    
}
