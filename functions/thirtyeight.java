import java.util.*;
class thirtyeight{
    public static double calculate(int r){
        double c=2*3.14*r;
        return c;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int r=sc.nextInt();
           System.out.println(calculate(r));
        }
    }
}
