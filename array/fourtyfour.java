import java.util.*;
 class fourtyfour {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int rows=sc.nextInt();
            int col=sc.nextInt();
            int numbers[][]=new int[rows][col];
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter searching number");
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                if(x==numbers[i][j]){
                    System.out.print(i+" "+j);
                }
            }
            }
        }
    }
}
