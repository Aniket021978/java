import java.util.*;
 class twentyfive {
    public static void main(String args[]){
          try(Scanner sc=new Scanner(System.in)){
                     int n=sc.nextInt();
                     for(int i=1;i<=n;i++){
                        for(int j=1;j<=n-i;j++){
                            System.out.print(" ");
                        }
                        for(int j=1;j<=n;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                            }
                    }
          }
        }