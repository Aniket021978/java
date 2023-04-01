import java.util.*;
 class fourtythree {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter size of array");
            int size=sc.nextInt();
            int numbers[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("enter your numbers");
                numbers[i]=sc.nextInt();
            }
            boolean isAsc=true;
            for(int i=0;i<size-1;i++){
                if(numbers[i]>numbers[i+1]){
                    isAsc=false;
                }
            }
            if(isAsc){
                System.out.println("sorted");
            }else{
                System.out.print("not sorted");
            }
        }
    }
}
