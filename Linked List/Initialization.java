public class Initialization {
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
    //adding will at first position and last position

    public void addfirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head;

        //step3 = head = newNode
        head = newNode;
    }
    public void addlast(int data){
        //step1 = create a node (newnode)
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = tail.next =newnode
        tail.next = newNode;

        //step3 = tail = newnode
        tail = newNode;
    }
    public void printlinkelist(){
       if(head == null){
        System.out.println("linkedlist is empty");
        return;
       }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String args[]){
        Initialization ll = new Initialization();
        // this is the process to add value in linked list.
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // now we use methods to define the linked list such add
        //add()
        //remove()
        ll.printlinkelist();
        ll.addfirst(3);
        ll.printlinkelist();
        ll.addfirst(2);
        ll.printlinkelist();
        ll.addfirst(1);
        ll.printlinkelist();
        ll.addlast(4);
        ll.addlast(5); 
        ll.printlinkelist();
        ll.addlast(6);
        ll.printlinkelist();


    }
}