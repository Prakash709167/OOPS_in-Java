public class ReverseList {
    class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void add(int data){
        Node newnode1 = new Node(data);
        size++;

        //corner case
        if(head == null){
            head = tail = newnode1;
            return;
        }
        newnode1.next = head;
        head = newnode1;

    }
    public void Reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public void printll(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
        System.out.println(size);
    }
    public static void main(String args []){
        ReverseList ll = new ReverseList();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.printll();
        ll.Reverse();
        ll.printll();
        
    }
}