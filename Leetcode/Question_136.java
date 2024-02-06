import java.util.*;
public class Question_136 {
    public static int funct(int nums []){
        Arrays.sort(nums);
        int len = nums.length;
        int result = nums[len - 1]; 
        int i = 0;
        while (i < len - 2) {
          if (nums[i] == nums[i+1]) {
            i = i + 2;
          } 
          else {
            return nums[i];
          }
        }
        return result;
        
    }
    public static void main(String args[]){
        int nums[] = {4,1,2,1,2};
        System.out.println(funct(nums));
    }
}