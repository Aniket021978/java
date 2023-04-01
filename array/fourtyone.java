import java.util.*;
 class fourtyone {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter size of array");
            int size=sc.nextInt();
            int numbers[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("enter your numbers");
                numbers[i]=sc.nextInt();
            }
            System.out.println("enter searching number");
            int x=sc.nextInt();
            for(int i=0;i<size;i++){
                if(x==numbers[i]){
                    System.out.print(i);
                }
            }
        }
    }
}
