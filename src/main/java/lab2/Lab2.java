package lab2;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        println("result = " + replace23(x));
    }

    static int replace23(int x) {
        int n1 = x / 1000;
        x = x % 1000;
        int n2 = x / 100;
        x = x % 100;
        int n3 = x / 10;
        x = x % 10;
        int n4 = x;

        return n1 * 1000 + n3 * 100 + n2 * 10 + n4;
    }
}
