import java.util.*;
class seven{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }
        else if(a>b){
         System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
    }
}