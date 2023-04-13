import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n / 10) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            case 5:
                System.out.print("E");
                break;
            default:
                System.out.print("F");
                break;
        }
    }
}