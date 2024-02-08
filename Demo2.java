public class Demo2{
    public static int fun(int nums[],int target){
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
        int nums[]={1,3,2,4,5,6,7};
        int target = 3;
        System.out.println(fun(nums,target));
    }
}