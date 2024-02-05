public class ChangeArray {
    public static void funct(int arr[],int i,int val){
        // Base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // Recurrsion
        arr[i]=val;
        funct(arr, i+1, val+1); //func call itself
        arr[i] = val-2;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[] = new int[5];
        funct(arr,0,1);
        printArr(arr);
    }
}