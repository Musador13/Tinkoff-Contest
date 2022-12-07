package edu.tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        test(n);
    }

    public static void test(int n) {

        String str = "-1 -1";

        if (n % 2 != 0) {
            System.out.println(str);
            scanner.close();
            return;
        }

        int[] array = new int[n + 1];

        int even = 0;   // четных
        int odd = 0;    // нечетных
        int count = 0;

        boolean[] oddArray = new boolean[n + 1];
        Arrays.fill(oddArray, true);
        oddArray[0] = false;

        for (int i = 1; i <= n; i++) {

            if (even > n / 2 || odd > n / 2) {
                System.out.println(str);
                scanner.close();
                return;
            }

            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                oddArray[i] = false;
                even++;
                odd = 0;
            } else {
                even = 0;
                odd++;
            }
        }

        if (Math.abs(even - odd) > 1) {
            System.out.println(str);
            return;
        }

        int a, b = 0;

        for (int j = 1; j <= n - 1; j += 2) {

            if (!oddArray[j]) {
                count++;
            }

            if (count > 1) {
                System.out.println(str);
                return;

            } else if (count == 1) {
                if (!oddArray[j]) {
                    a = array[j];

                    for (int l = 2; l <= n; l += 2) {
                        if (oddArray[l]) {
                            b = array[l];
                        }
                    }
                    System.out.println(b + " " + a);
                    return;
                }
            } else {
                System.out.println(str);
            }
        }
    }
}
