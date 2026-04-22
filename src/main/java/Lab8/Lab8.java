package Lab8;

import java.util.Scanner;
import java.util.random.RandomGenerator;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class Lab8 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        println("Введіть розмір матриці m: ");
        int m = sc.nextInt();
        int[][] matrix = generateRandomMatrix(m);

        println("Матриця до сортування:");
        printMatrix(matrix, m);

        int[] arr = getDiagonal(matrix, m);
        shellSortArray(arr);
        setDiagonal(matrix, arr, m);

        println("Матриця після сортування:");
        printMatrix(matrix, m);
    }

    static int[][] generateRandomMatrix(int m) {
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = RandomGenerator.getDefault().nextInt(100);
            }
        }
        return arr;
    }

    static void printMatrix(int[][] a, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                print(a[i][j] + "\t");
            }
            println();
        }
    }

    static int[] getDiagonal(int[][] a, int m) {
        int[] diag = new int[m];
        for (int i = 0; i < m; i++) {
            diag[i] = a[i][i];
        }
        return diag;
    }

    static void setDiagonal(int[][] a, int[] diag, int m) {
        for (int i = 0; i < m; i++) {
            a[i][i] = diag[i];
        }
    }

    static void shellSortArray(int[] arr) {
        int n = arr.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }
}
