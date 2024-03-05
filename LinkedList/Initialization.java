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
    public static int size;
    //adding will at first position and last position

    public void addfirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = tail.next =newnode
        tail.next = newNode;

        //step3 = tail = newnode
        tail = newNode;
    }
    public void addMidlle(int index, int data){
        if(index == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }
    public int iterSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

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
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5); 
        ll.addlast(6);
        ll.addMidlle(3,9);
        ll.printlinkelist();
        System.out.println("Total size of linkedlist is : "+size);
        ll.removeFirst();
        ll.printlinkelist();
        System.out.println("new size of linkedlist is : "+size);
        ll.removeLast();
        ll.printlinkelist();
        ll.removeLast();
        ll.printlinkelist();
        System.out.println("new size of linkedlist is : "+size);

        System.out.println(ll.iterSearch(4));
        System.out.println(ll.iterSearch(5));
    }
}