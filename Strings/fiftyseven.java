import java.util.*;
public class fiftyseven{
    public static void main(String args[]){
        //0101  pos==2;
        try(Scanner sc=new Scanner(System.in)){
            int op=sc.nextInt();
            int n=5;
            int pos=2;
            int bitmask=1<<pos;
            if(op==0){
                int number=bitmask|n;
                System.out.println(number);
            }else{
                int notbit=~(bitmask)&n;
                System.out.println(notbit);
            }
        }
}
}
