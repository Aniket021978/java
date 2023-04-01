import java.util.*;
import java.lang.Math;
class thirtynine{
    public static double calculate(int x,int n){
        return Math.pow(x,n);
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int x=sc.nextInt();
            int n=sc.nextInt();
           System.out.println(calculate(x,n));
        }
    }
}
