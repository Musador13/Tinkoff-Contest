package edu.tinkoff;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача C. Лифты и переговорки.
 */
public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] floors = new int[n];

        for (int i = 0; i < n; i++) {
            floors[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        scanner.close();

        int max = Arrays.stream(floors).reduce(Integer::max).getAsInt();
        int min = Arrays.stream(floors).reduce(Integer::min).getAsInt();
        int dif = max - min;
        int res;

        int maxX = max - t;
        int minX = t + min;
        int x = floors[k - 1];

        if (minX >= x || maxX <= x) {
            res = max - min;
        } else {
            int toUp = dif + max - x;
            int toDown = dif + x - min;
            res = Math.min(toDown, toUp);
        }
        System.out.println(res);
    }
}
