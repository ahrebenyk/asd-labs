package mkr2;

import java.util.Scanner;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class Mkr2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        println("Введіть число а:");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                print(i + " ");
            }
        }
    }
}
