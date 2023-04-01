import java.util.*;
class thirtyfive{
    public static void calculate(int age){
        if(age>18){
            System.out.print("eligible");
        }else{
            System.out.print("not eligible");
        }
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int age=sc.nextInt();
            calculate(age);
        }
    }
}
