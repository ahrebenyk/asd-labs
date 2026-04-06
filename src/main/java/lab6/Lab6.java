package lab6;

import java.util.Scanner;

public class Lab6 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Введіть ціле число:");
        long number = sc.nextLong();
        IO.println("Введіть цифру:");
        int digit = sc.nextInt();

        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }

        IO.println("Цифра %s зустрічається %s раз".formatted(digit, count));
    }
}
