import java.util.Stack;

public class ParenthesisCheck {

    public static void main(String[] args) {

        String x = "{{()[]}}";
        char[] c = x.toCharArray();
        Stack s = new Stack();
        boolean b = true;

        for(int i=0;i<x.length();i++) {
            if(!b)
                break;
            if(c[i] == '{' || c[i] == '[' || c[i] == '(') {
                s.push(c[i]);
            }

            else if (c[i] == '}' || c[i] == ']' || c[i] == ')') {
               b = popOut(s,c[i]);
            }
        }

        if(!s.isEmpty())
            b = false;

        System.out.println(b);
    }
    static boolean popOut(Stack s,char c) {

        if(s.isEmpty())
            return false;
       else  {
            if (c == '}' && s.peek().equals('{')) {
                s.pop();
            } else if (c == ')' && s.peek().equals('(')) {
                s.pop();
            } else if (c == ']' && s.peek().equals('[')) {
                s.pop();
            }
            else {
                return false;
            }
        }
        return true;
    }
}

/*
Short version of this code

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (!stack.isEmpty() && isMatching(stack.peek(), c)) {
            stack.pop();
        } else {
            return false;
        }
    }

    return stack.isEmpty();
}

private boolean isMatching(char open, char close) {
    return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
}


 */
