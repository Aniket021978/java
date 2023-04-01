import java.util.*;
class twentyeight{
    public static void print(String name){
        System.out.print(name);
        return;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            String name=sc.nextLine();
            print(name);
        }
    }
}
