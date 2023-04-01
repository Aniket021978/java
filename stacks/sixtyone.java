//push in bottom of stack
import java.util.*;

public class sixtyone {
    public static void pushbottom(int data,Stack <Integer>s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(data, s);
        s.push(top);
    }
    public static void main(String args[]){
        Stack <Integer>s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushbottom(5, s);
        while(!s.empty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
