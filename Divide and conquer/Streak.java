public class Streak {
    public static int[] sum(int nums[],int target){
        for(int i =0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[]={1,7,2,5,6};
        int res[]=sum(nums,11);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}