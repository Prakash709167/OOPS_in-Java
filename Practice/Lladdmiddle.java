public class Lladdmiddle {
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
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void addmiddle(int index, int data){
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void printll(){
        if(head == null){
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
        addmiddle(3,35);
        addmiddle(1,15);
        addmiddle(3,25);
        addmiddle(7,45);
        printll();
    }
}