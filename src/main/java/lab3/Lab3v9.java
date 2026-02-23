package lab3;

import java.util.Scanner;

public class Lab3v9 {

    static void main() {
        IO.println("Введіть координати першого поля шахівниці");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        IO.println("Введіть координати другого поля шахівниці");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        boolean result = isSameColor(k, l, m, n);
        IO.println("Поля одного кольору: %s".formatted(result));
    }

    public static boolean isSameColor(int k, int l, int m, int n) {
        return (k + l) % 2 == (m + n) % 2;
    }
}
