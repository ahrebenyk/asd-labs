package lab4;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab4v5 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        println("Введіть чотиризначне число:");
        int x = scanner.nextInt();
        boolean result = has3EqualDigits(x);
        if (result) {
            println("Число містить 3 однакові цифри");
        } else {
            println("Число не містить 3 однакові цифри");
        }
    }

    static boolean has3EqualDigits(int x) {
        int n1 = x / 1000;
        x = x % 1000;
        int n2 = x / 100;
        x = x % 100;
        int n3 = x / 10;
        x = x % 10;
        int n4 = x;

        return (n1 == n2 && n2 == n3) ||
                (n1 == n2 && n2 == n4) ||
                (n1 == n3 && n3 == n4) ||
                (n2 == n3 && n3 == n4);
    }
}
