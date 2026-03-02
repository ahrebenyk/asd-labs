package lab4;

import java.util.Scanner;

import static java.lang.IO.println;

public class Lab4v6 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        println("Введіть чотиризначне число:");
        int x = scanner.nextInt();
        boolean result = isPalindrome(x);
        if (result) {
            println("Число паліндром");
        } else {
            println("Число не паліндром");
        }
    }

    static boolean isPalindrome(int x) {
        int n1 = x / 1000;
        x = x % 1000;
        int n2 = x / 100;
        x = x % 100;
        int n3 = x / 10;
        x = x % 10;
        int n4 = x;

        return (n1 == n4) && (n2 == n3);
    }
}
