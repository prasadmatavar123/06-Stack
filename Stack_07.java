import java.util.Stack;
public class Stack_07{
    public static void pushAtBottom(int data , Stack<Integer> s1){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushAtBottom(data, s1);
        s1.push(top);

    }

    public static void reverse(Stack<Integer> s1){
        if(s1.isEmpty()){
            return;
        }
        int top = s1.pop();
        reverse(s1);
        pushAtBottom(top, s1);
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        reverse(s1);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}