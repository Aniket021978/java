import java.util.*;
public class intersection
{
    public static void i(int arr1[],int arr2[]){
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
            System.out.print(count);
        
    }
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int arr2[]={3,4,5,1};
		i(arr1,arr2);
	}
}
