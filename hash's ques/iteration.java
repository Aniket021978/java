import java.util.*;
public class iteration{
    public static String gs(HashMap<String,String>tic){
        HashMap<String,String>rev=new HashMap<>();
        for(String key:tic.keySet()){
            rev.put(tic.get(key), key);
        }
        for(String key:tic.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> newt=new HashMap<>();
        newt.put("chennai","bengaluru");
        newt.put("mumbai","delhi");
        newt.put("goa","chennai");
        newt.put("delhi","goa");
        String start=gs(newt);
        while(newt.containsKey(start)){
            System.out.println(start);
            start=newt.get(start);
        }
        System.out.print(start);
    }

}