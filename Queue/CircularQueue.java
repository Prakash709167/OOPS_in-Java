public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear=-1;
            front = -1;
        }
        // isEmpty
        public boolean isEmpty(){
            return rear==-1 && front == -1;
        }
        //isfull
        public boolean isfull(){
            return (rear+1)%size == front;
        }
        //adding data
        public void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //removing data
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //last element of queue
            if(rear==front){
                front = rear =-1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q =new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        q.add(8);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" | ");
            q.remove();
        }
        System.out.println();
        q.remove();
        // System.out.println(q.peek());
    }
}