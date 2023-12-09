import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static List<Integer> elements(int[] source, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i % n == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую: ");

        String[] s = scanner.next().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(elements(arr, 3));
    }
}
