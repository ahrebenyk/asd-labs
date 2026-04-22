package lab7;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab7 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        println("Введіть число:");
        int number = sc.nextInt();
        println("Введіть степінь:");
        int exp = sc.nextInt();
        println("Результат: " + pow(number, exp));
    }

    static double pow(int number, int exp) {
        if (exp == 1) {
            return number;
        }
        if (exp < 0) {
            return 1 / pow(number, -exp);
        }
        return number * pow(number, exp - 1);
    }
}
