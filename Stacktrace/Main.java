
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker passwordChecker = new PasswordChecker();

        try {
            System.out.print("Введите минимальное количество символов: ");
            passwordChecker.setMinLength(parseInt(scanner.nextLine()));
            System.out.print("Введите максимальное число повторов одного символа подряд: ");
            passwordChecker.setMaxRepeats(parseInt(scanner.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                System.out.print("Введите пароль или end для завершения: ");
                String password = scanner.nextLine();
                if ("end".equals(password)) {
                    System.out.println("Программа завершена!");
                    break;
                }
                System.out.println(passwordChecker.verify(password) ? "Подходит!" : "Не подходит!");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}