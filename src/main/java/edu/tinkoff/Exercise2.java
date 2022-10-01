package edu.tinkoff;

import java.util.Scanner;

/**
 * Задача B. Рулет.
 */
public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(bit1(a));

        scanner.close();
    }

    static int bit1(int x) {
        int k;

        if ((x & (x - 1)) == 0) {
            k = -1;
        } else {
            k = 0;
        }

        while (x != 0) {
            k++;
            x /= 2;
        }
        return k;
    }
}
