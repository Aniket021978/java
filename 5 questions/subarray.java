import java.util.*;
public class subarray {
    public static void main(String args[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.print(ans);
    }
}
