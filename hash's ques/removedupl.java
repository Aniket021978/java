
// time complexity o(n)
import java.util.*;

public class removedupl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                result[index++] = arr[i];
            }
        }
        return Arrays.copyOf(result, index);
    }
}
