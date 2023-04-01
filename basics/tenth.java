import java.util.*;
class tenth{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int op=sc.nextInt();
        switch(op){
        case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:if(b==0){
                System.out.println("invalid");
            }else{
                System.out.println(a/b);
            }
                break;
            case 5:if(b==0){
                System.out.println("invalid");
            }
            else{
                System.out.println(a%b);
            }
                break;
            default:
            System.out.println("invalid");
        }
    }
    }
}