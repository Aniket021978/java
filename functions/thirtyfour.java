import java.util.*;
class thirtyfour{
    public static void calculate(int a,int b){
        if(a>b){
            System.out.print(" a is greater");
        }else if(b>a){
            System.out.print("b is greater");
        }else{
            System.out.println("invalid");
        }
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            calculate(a, b);
        }
    }
}
