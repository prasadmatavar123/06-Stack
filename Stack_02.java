import java.util.Stack;

public class Stack_02 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(100);
        s1.push(200);
        s1.push(300);
        s1.push(400);

        System.out.println(s1.peek());
    }
}


// Peek methods