import java.util.*;
public class quicksort {
    public static int partiton(int arr[],int s,int e){
        int pivott=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<pivott){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;
        return i+1;
    }
    public static void quick(int arr[],int s,int e){
        if(s<e){
        int pi=partiton(arr,s,e);
        quick(arr,s,pi-1);
        quick(arr,pi+1,e);
        }
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int size=sc.nextInt();
            int arr[]=new int[size];
             for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
             }
             quick(arr,0,size-1);
             for(int i=0;i<size;i++){
             System.out.print(arr[i]);
                }
    }
}
}
