public class Removefirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int rmfirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        else if(head==tail){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public static void printll(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[]){
        addlast(10);
        addlast(20);
        addlast(30);
        addlast(40);
        addlast(50);
        printll();
        rmfirst();
        printll();
        rmfirst();
        printll();
        rmfirst();
        printll();
        rmfirst();
        printll();
        rmfirst();
        printll();

    }
}