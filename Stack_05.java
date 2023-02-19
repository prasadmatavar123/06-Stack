import java.util.Stack;

public class Stack_05 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>(); 
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
