import java.util.*;
public class fiftythree{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int r=0;
            int z=n;
            while(n>0){
                r=(r*10)+n%10;
                n=n/10;
            }
            if(r==z){
                System.out.println("palindrome");
            }else{
                System.out.print("not plaindrome");
            }
    }
}
}
