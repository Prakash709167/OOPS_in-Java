class Ritik {

    public static void sol(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.print(j-1);
                }
                else{
                    count++;
                    System.out.print(count);
                    
                }
            }
        }
    }

    public static void printArr(int arr[]){
        
        for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" "); 
        }
        System.out.println();
        
    }


    public static void main(String [] args){
        int arr[]={73,74,75,71,69,72,76,73};
        // printArr(arr);
        sol(arr);
      
        }


    }
