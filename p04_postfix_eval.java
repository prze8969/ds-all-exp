import java.util.*;

class p04_postfix_eval{
  public static int postfix_eval(String exp){
    Stack<Integer> stk  = new Stack<>();

    for(int i = 0 ; i < exp.length(); i++){
      char ch = exp.charAt(i);


      if(Character.isDigit(ch)){
        stk.push(ch - '0');
      }else {
        int a = stk.pop();
        int b = stk.pop();
        switch(ch){
          case '+':
            stk.push(a+b);
            break;
          case '-':
            stk.push(a-b);
            break;
          case '*':
            stk.push(a*b);
            break;
          case '/':
            stk.push(a/b);
            break;
          case '^':
            stk.push((int) Math.pow(a,b));
            break;
        }
      }
    }
    return stk.pop();
  }

  public static void main(String[] args){
    String exp = "23*54*+";

  System.out.println(postfix_eval(exp));
  }
}
