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

    //helper method for checking palidrone
    // slow-fast approach

    public Node Findmid(Node head){
        Node slow = head;
        Node Fast = head;
        while(Fast!=null && Fast.next != null){
            slow = slow.next;//+1
            Fast = Fast.next.next;//+2
        }
        return slow;// slow is mid
    }
    //main function for palidrone
    public boolean checkpalidrone(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 find the mid
        Node mid = Findmid(head);
        //step 2 reverse the right half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;


        //step 3 check left and right half for palidrone

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(1);
        ll.printlinkelist();
        System.out.println(ll.checkpalidrone());

     }
}