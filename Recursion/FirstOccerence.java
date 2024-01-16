public class FirstOccerence {
    public static int Occerence(int n[], int key, int i){
        if(i==n.length){
            return -1;
        }
        if (n[i]==key){
            return i;
        }
        return Occerence(n,key,i+1);
    }
    public static int LastOccerence(int n[],int key,int i){
        if(i==n.length){
            return -1;
        }
        int isFound = LastOccerence(n,key,i+1);
        if(isFound==-1 && n[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args []){
        int n[]={1,5,3,4,6,5,2};
        System.out.println(Occerence(n,5,0));
        System.out.println(LastOccerence(n,5,0));

    }
}