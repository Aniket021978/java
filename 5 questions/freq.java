import java.util.*;
class freq{
    public static void f(int arr[]){
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.print(key);
            }
        }
        }
    public static void main(String args[]){
        int arr[]={1,2,1,3,4,1,5};
        f(arr);
    }
}
