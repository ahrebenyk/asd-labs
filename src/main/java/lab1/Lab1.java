package lab1;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        println("x8 = " + x8(x));
        println("x10 = " + x10(x));
        println("x13 = " + x13(x));
        println("x17 = " + x17(x));
    }

    static int x8(int x) {
        int x2 = x * x;
        int x4 = x2 * x2;
        return x4 * x4;
    }

    static int x10(int x) {
        int x2 = x * x;
        int x4 = x2 * x2;
        int x8 = x4 * x4;
        return x8 * x2;
    }

    static int x13(int x) {
        int x2 = x * x;
        int x4 = x2 * x2;
        int x8 = x4 * x4;
        return x8 * x4 * x;
    }

    static int x17(int x) {
        int x2 = x * x;
        int x4 = x2 * x2;
        int x8 = x4 * x4;
        return x8 * x8 * x;
    }
}
