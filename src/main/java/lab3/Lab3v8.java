package lab3;

import java.util.Scanner;

public class Lab3v8 {

    static void main() {
        IO.println("Введіть секунди з початку доби");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int result = getSecondsFromLastMinute(seconds);
        IO.println("Секунди з початку останньої хвилини: %s".formatted(result));
    }

    public static int getSecondsFromLastMinute(int seconds) {
        return seconds % 60;
    }
}
