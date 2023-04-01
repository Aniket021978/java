import java.util.*;
public class thirteen {
    public static void main(String args[]){
    try(Scanner sc=new Scanner(System.in)){
        int input;
        do{
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("this is good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("this is also good");
            }
            else{
                System.out.println("this good as well");
            }
            System.out.println("plz tell wheteher you are 1 or not");
            input=sc.nextInt();
        }while(input==1);
    }
}
}
