public class AddingatFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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
        AddingatFirst ll = new AddingatFirst();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.printlinkelist();

     }
}