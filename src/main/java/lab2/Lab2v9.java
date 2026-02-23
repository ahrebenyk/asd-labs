package lab2;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab2v9 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введіть чотиризначне число");
        int n = scanner.nextInt();
        println("Сотні: %s, Десятки: %s".formatted(hundreds(n), tens(n)));
    }

    static int hundreds(int n) {
        return (n / 100) % 10;
    }

    static int tens(int n) {
        return (n / 10) % 10;
    }
}
