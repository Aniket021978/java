import java.util.*;
 class fourtytwo {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter size of array");
            int size=sc.nextInt();
            int numbers[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("enter your numbers");
                numbers[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
                if(numbers[i]<min){
                    min=numbers[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}
