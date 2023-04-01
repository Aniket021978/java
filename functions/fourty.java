import java.util.*;
class fourty{
    public static int gcd(int a,int b){
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
}