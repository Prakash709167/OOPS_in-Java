public class IsArraySortedOrNot {
    public static boolean isSort(int n[], int i){
        if(i==n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return isSort(n,i+1);
    }
    public static void main(String args []){
        int arr[] = {1,2,3,6,7};
        System.out.println(isSort(arr,0));
    }
}