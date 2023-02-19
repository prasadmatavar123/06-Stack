import java.util.Stack;

public class Stack_01 {
    public static void main(String[] args) {
        Stack<Integer> s2 = new Stack<Integer>();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        s2.push(50);

        // System.out.println(s2);

        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
   
    }
}

//Pop methods