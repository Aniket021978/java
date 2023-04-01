import java.util.*;
class eight{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        int button=sc.nextInt();

        //lengthy process:

        // if(button==1){
        //     System.out.println("hello");
        // }
        // else if(button==2){
        //  System.out.println("namaste");
        // }
        // else if(button==3){
        //  System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("invalid");
        // }

         switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjour");
            break;
           default:System.out.println("invalid");

         }
    }
    }
}