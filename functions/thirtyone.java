import java.util.*;
class thirtyone{
    public static int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.println(fact(n));
        }
    }
}
