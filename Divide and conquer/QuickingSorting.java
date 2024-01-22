public class QuickingSorting {
    public static void QuicSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx = particiation(arr,si,ei);
        QuicSort(arr,si,pidx-1);
        QuicSort(arr,pidx+1,ei);

    }
    public static int particiation(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei;j++){
          if(arr[j]<=pivot){
            i++;
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
          }  
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;    
    }
    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5,-5,-3};
        QuicSort(arr,0,arr.length-1);
        printarray(arr);
    }
}