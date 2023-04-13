import java.util.*;

public class center {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int nu = 0;
        for (int i = 1; i <= (rows / 2) + 1; i++) {
            for (int j = 1; j <= (rows / 2) + 1 - i; j++) {
                System.out.print("  ");
            }
            nu = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(nu++ + " ");
            }
            nu -= 2;
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(nu-- + " ");
            }
            System.out.println();
        }
        for (int i = (rows / 2); i >= 1; i--) {
            for (int j = 1; j <= (rows / 2) + 1 - i; j++) {
                System.out.print("  ");
            }
            nu = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(nu++ + " ");
            }
            nu -= 2;
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(nu-- + " ");
            }
            System.out.println();
        }
    }
}