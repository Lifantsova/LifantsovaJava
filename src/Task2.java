import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String nameTemplate = "Вячеслав";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");

        String name = scanner.next();

        greeting(name, nameTemplate);
    }

    private static void greeting(String s, String nameTemplate) {
        if (s.equals(nameTemplate)) {
            System.out.println("Привет, " + nameTemplate + "!");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
