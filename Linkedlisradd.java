public class Linkedlisradd {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addlast(int data){
        //create a newnode
        Node newnode = new Node(data);
        
        //corner case
        if(head == null){
            head = tail = newnode;
            return;
        }    

        //connect with tail
        tail.next=newnode;

        //make newnode as tail
        tail = newnode;
    }
    public static void printll(){
        //corner case
        if(head == null){
            System.out.println("null");
            return;
        }
        //traversing and printing actual linkedlist
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        printll();
        addlast(10);
        printll();
        addlast(20);
        printll();
        addlast(30);
        printll();
        addlast(40);
        printll();
        addlast(50);
        printll();

    }
}