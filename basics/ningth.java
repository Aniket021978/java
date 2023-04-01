import java.util.*;
class ningth{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("satuarday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        
            default:
            System.out.println("invalid");
        }
    }
    }
}