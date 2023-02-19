public class Stack_04{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
           return head == null;
            
        }
        // Push function
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;

            }
            newNode.next = head;
            head = newNode;
        }

        // Pop function
        public static int Pop(){
            if(isEmpty()){
                return-1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //Peek function
        public static int peek(){
            if(isEmpty()){
                return-1;
            }
            return head.data;

        }
    }
    public static void main(String[] args) {
       Stack s1 = new Stack();
       s1.push(10);
       s1.push(20);
       s1.push(30);
       s1.push(40);
       s1.push(50);
       
       while(!s1.isEmpty()){
        System.out.println(s1.peek());
        s1.Pop();
       }
    }
}

// Stack implementaion using linked list