import java.util.Stack;
public class Implement_Stack {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Element: " + stack);
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack Peek: " + stack.peek());
    }
    
}
