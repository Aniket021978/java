import java.util.*;
class thirtytwo{
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(average(a,b,c));
        }
    }
}
