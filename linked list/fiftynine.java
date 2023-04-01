import java.util.*;
public class fiftynine {
    public static void main(String args[]){
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("is");
        list.addFirst("this");
        list.add("a");
        list.add("list");
        list.add(".");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(".");
        System.out.println(list);
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");
    }
}
