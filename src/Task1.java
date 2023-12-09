import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        if (n > 7) {
            System.out.println("Привет!");
        }
    }
}
