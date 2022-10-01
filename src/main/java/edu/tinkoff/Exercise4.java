package edu.tinkoff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Задача D. Бумажка с числами.
 */
public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        List<Long> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            int weight = 1;

            while (arr[i] > 0) {
                int digit = arr[i] % 10;
                long gain = (long) (9 - digit) * weight;
                values.add(gain);
                weight *= 10;
                arr[i] /= 10;
            }
        }

        scanner.close();

        long afterSum = values.stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .reduce(0L, Long::sum);

        System.out.println(afterSum);
    }
}
