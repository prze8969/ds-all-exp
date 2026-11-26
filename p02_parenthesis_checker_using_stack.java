class stack{
  private int size;
  private int top;
  private char[] arr;

  stack(int s){
    size = s;
    top = -1;
    arr = new char[s];
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == size-1;
  }

  public void push(char val){
    if (isFull()){
      System.out.println("Stack overflow!");
      return;
    }
    top++;
    arr[top] = val;
  }

  public char peek(){
    if(isEmpty()){
      System.out.println("Stack underflow");
      return '.';
    }
    return arr[top];
  }

  public char pop(){
    if(isEmpty()){
      System.out.println("Stack underflow");
      return '.';
    }
    char temp = arr[top];
    top--;
    return temp;
  }
}

class parenthesis_checker{
  private String input;
  parenthesis_checker(String i){
    input = i;
  }
  public boolean check_validity(){
    int input_size = input.length();
    stack stk = new stack(input_size);

    for(int i = 0 ; i < input_size;i++){
      char s = input.charAt(i);
      if( s == '(' || s == '{' || s == '['){
        stk.push(s);
      }else{
        if(stk.isEmpty()){
          return false;
        }
        char top = stk.peek();
        if(s == '}' && top =='{' || s == ')' && top =='(' || s == ']' && top =='[' ){ stk.pop();}else { return false;}
      }
    }
    return stk.isEmpty();
    
  }
}
public class p02_parenthesis_checker_using_stack{
   public static void main(String[] args){
     parenthesis_checker p = new parenthesis_checker("[{(()}]");
     System.out.println(p.check_validity());
   }
 }
