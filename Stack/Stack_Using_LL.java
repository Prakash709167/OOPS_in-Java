public class Stack_Using_LL {
    static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        // isEmpty function
        public boolean isEmpty(){
            return head == null;
        }

        // push function
        public void push(int val){
            Node newnode = new Node(val);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // pop function
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        // peek function
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}