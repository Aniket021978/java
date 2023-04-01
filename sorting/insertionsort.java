import java.util.*;
public class insertionsort {
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
             for(int i=1;i<size;i++){
                int ele=arr[i];
                int j=i-1;
                while(j>=0&&arr[j]>ele){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=ele;
             }
             print(arr,size);
        }
    }
    
}
