import java.util.*;
public class MaxAreainHistogram {
    public static void maxArea(int arr[]){
        int max_Area = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //Next smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller Left
        s = new Stack<>();
        for(int i = 0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Area
        for(int i = 0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            max_Area = Math.max(currArea, max_Area);
        }
        System.out.println("Max Area in HistoGram = " + max_Area);
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}