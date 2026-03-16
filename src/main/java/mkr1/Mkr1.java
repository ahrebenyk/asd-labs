package mkr1;

import java.util.Scanner;

import static java.lang.IO.println;

public class Mkr1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введіть тризначне число:");
        int x = scanner.nextInt();
        println("Результат перестановки 1 та 2 цифри:\n" + replace12(x));
    }

    static int replace12(int x) {
        int n1 = x / 100;
        x = x % 100;
        int n2 = x / 10;
        x = x % 10;
        int n3 = x;
        return n2 * 100 + n1 * 10 + n3;
    }
}
