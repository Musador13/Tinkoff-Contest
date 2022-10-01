package edu.tinkoff;

import java.util.Scanner;

/**
 * Задача A. Мобайл.
 */
public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        scanner.close();

        int sum;

        if (d <= b) {
            sum = a;
        } else {
            sum = a + ((d - b) * c);
        }

        System.out.println(sum);
    }
}
