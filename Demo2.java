public class Demo2{
    public static int fun(int nums[],int target){
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;

        int si = 0;
        int ei = nums.length-1;
        int mid;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
            
        }
        return si;
        
    }
    public static void main(String args[]){
        int nums[]={1,3,4,5};
        int target = 0;
        System.out.println(fun(nums,target));
    }
}