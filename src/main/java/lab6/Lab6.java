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
        long temp = number;
        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
            temp /= 10;
        }

        IO.println("Цифра %s зустрічається %s раз в числі %s".formatted(digit, count, number));
    }
}
