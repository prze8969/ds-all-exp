import java.util.*;

class postfix_to_infix{
  static int precedence(char c){
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

  public String ptoi(String exp){
    int len = exp.length();
    Stack<Character> stk = new Stack<>(); 
    StringBuilder res = new StringBuilder();

    for(int i = 0 ; i < len ; i++){
      char ch = exp.charAt(i);
      //if its operand
      if(Character.isLetterOrDigit(ch)){
        res.append(ch);
      }
      else if(ch == '('){
        stk.push(ch);
      }
      else if(ch == ')'){

        while(!stk.isEmpty() && stk.peek() == '('){
          res.append(stk.pop());
        }

        stk.pop();
      }
      else{
        while( !stk.isEmpty() && stk.peek() != '(' && precedence(ch) <= precedence(stk.peek())){
          res.append(stk.pop());
        }
        stk.push(ch);
      }

            
    }

while(!stk.isEmpty()){
        res.append(stk.pop());
      }
    return res.toString();
  }
}

public class p03_postfix_to_infix{
  public static void main(String[] args){
    postfix_to_infix p = new postfix_to_infix();
    String s = p.ptoi("a+b*c+d");
    System.out.println(s);
  }
}
