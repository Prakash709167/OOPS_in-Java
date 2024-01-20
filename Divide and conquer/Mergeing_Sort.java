public class Mergeing_Sort {
    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temo[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
         while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temo[k]=arr[i];
                i++;
            }
            else{
                temo[k]=arr[j];
                j++;
            }
            k++;
         }
         while(i<=mid){
            temo[k++]=arr[i++];
         }
         while(j<=ei){
            temo[k++]=arr[j++];
         }

         for(k=0, i=si;k<temo.length; k++,i++){
            arr[i]=temo[k];
         }
    }
    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printarray(arr);
    }
}