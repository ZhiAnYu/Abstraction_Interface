
import java.util.Scanner;

public class PasswordChecker {
    private int minLength;
    private int maxRepeats;


    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Недопустимое число длины пароля!");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Недопустимое число повторов!");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if ((minLength - 1) < 0 || (maxRepeats - 1) < 0) {
            throw new IllegalStateException("Не заданы параметры для проверки.");
        }

        if (password.length() < minLength) {
            return false;
        }
        if (!verifyRepeats(password)) {
            return false;
        }
        return true;
    }

    //метод проверяющий на соответствие количеству повторов
    public boolean verifyRepeats(String password) {
        int[] counter = new int[password.length()];
        for (int i = 1; i < password.length(); i++) {
            if (password.toCharArray()[i - 1] == password.toCharArray()[i]) {
                counter[i] = 1 + counter[i - 1];
            }
        }
        for (int j : counter) {
            if (j + 1 > maxRepeats)
                return false;
        }
        return true;
    }
}