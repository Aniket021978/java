import java.util.*;
public class selectionsort {
    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int size=sc.nextInt();
            int arr[]=new int[size];
             for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
             }
             for(int i=0;i<size-1;i++){
                for(int j=i+1;j<size;j++){
                    if(arr[i]>arr[j]){
                       int temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                    }
                }
             }
             print(arr,size);
        }
    }
    
}
