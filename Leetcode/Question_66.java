public class Question_66 {
     public static int[] fun(int n[]){
        int x = n.length-1;
        while(x>=0 && n[x]==9){
            x--;
        }
        if(x==-1){
            int result[] = new int[n.length+1];
            result[0]=1;
            return result;
        }
           int result[]= new int[n.length];
            result[x]=n[x]+1;
            for(int y = 0;y<x;y++){
                result[y]= n[y];
            }
        
        return result;
     }
     public static void main(String args[]){
        int n[]={1,2,3,4};
        int m[]=fun(n);
        for(int i =0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        System.out.println();
     }
        
      
}