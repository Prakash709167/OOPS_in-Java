public class LinkedList {
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
    public static int size;

    public static void addfirst(int data){
        //create a node
        Node newnode = new Node(data);
        size++;

        //corner case
        if(head == null){
            head = tail = newnode;
            return;
        }

        //link newnode with head
        newnode.next = head;

        //make newnode as head
        head = newnode;
    }
    public static void printll(){
        //corner case
        if(head == null){
            System.out.println("null");
            return;
        }
        //printing all linkedlist
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        printll();
        addfirst(50);
        printll();
        addfirst(40);
        printll();
        addfirst(30);
        printll();
        addfirst(20);
        printll();
        addfirst(10);
        printll();
        System.out.println("Total length of linkedlist is "+size);
    }
}