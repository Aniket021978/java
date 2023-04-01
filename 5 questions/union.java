import java.util.*;

public class union {
    public static int u(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static void main(String args[]){
        int arr1[]={1,2,3};
        int arr2[]={2,3,4};
        System.out.print(u(arr1,arr2));
    }
}
