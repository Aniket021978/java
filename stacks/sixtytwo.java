//reverse stack
import java.util.*;

public class sixtytwo {
    public static void pushbottom(int data,Stack <Integer>s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack <Integer>s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushbottom(top, s);
    }
    public static void main(String args[]){
        Stack <Integer>s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while(!s.empty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
