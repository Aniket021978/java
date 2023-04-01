import java.util.*;
public class mergesort {
    public static void merge(int arr[],int s,int e,int mid){
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1 <=mid && idx2<=e){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=e){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void mergesorting (int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesorting (arr,s,mid);
        mergesorting (arr, mid+1, e);
        merge(arr, s, e, mid);
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            }
            mergesorting (arr, 0, size-1);
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
}
