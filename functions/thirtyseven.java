import java.util.*;
class thirtyseven{
    public static void calculate(int n){
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=n;i++){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            calculate(n);
        }
    }
}
