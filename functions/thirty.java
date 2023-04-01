import java.util.*;
class thirty{
    public static int calculate(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int product=calculate(a,b);
            System.out.println(product);
        }
    }
}
