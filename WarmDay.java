public class WarmDay {
    public static int[] solution(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1]=0;
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    ans[i]=j-1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void printArr(int arr[]){
        
        for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" "); 
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        int arr[] = {73,74,75,71,69,72,76,73};
        printArr(arr);
        int sol[] = solution(arr);
        printArr(sol);
    }
}