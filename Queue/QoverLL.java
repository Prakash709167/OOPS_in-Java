public class QoverLL {
    static class Node{
        int data;
        Node next;
        Node(int value){
            this.data = value;
            this.next = null;
        }
    }
    static class Queue{
        public static Node head;
        public static Node tail;
        //isEmpty
        public boolean isEmpty(){
            return head == null & tail == null;
        }
        //add
        public void add(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty ........");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty ...........");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String args []){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}