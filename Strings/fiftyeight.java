//Write a program to find if a number is a power of 2 or not.
import java.util.*;
class fiftyeight{
    public static boolean powerOfTwoBitwise(int n)
    {
      return (n & n-1)==0;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(powerOfTwoBitwise(n)){
              System.out.println("yes");
            }else{
              System.out.println("no");
            }
        }
    }
}
 