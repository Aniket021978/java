import java.util.*;
class thirtythree{
    public static void calculate(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(i%2!=0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("sum of all odd number is : "+sum);
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            calculate(n);
        }
    }
}
