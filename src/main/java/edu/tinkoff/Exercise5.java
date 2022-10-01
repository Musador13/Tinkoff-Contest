package edu.tinkoff;

import java.util.Scanner;

/**
 * Задача E. Тестирование.
 */
public class Exercise5 {

    public static void main(String[] args) {

        long x;
        long count = 0;

        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong();
        long r = scanner.nextLong();

        for (int j = numberSize(l); j <= numberSize(r); j++) {
            for (int i = 1; i <= 9; i++) {

                x = i * repUnit(j);

                if (x >= l && x <= r) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    /**
     * Repunit calculation method in decimal number system.
     *
     * @param degree the number of copies of the digit 1 in base 10 representation.
     * @return simply repunit of the degree.
     */
    public static long repUnit(int degree) {

        return (degreeTen(degree) - 1) / 9;
    }


    /**
     * Quickly exponentiation of ten.
     *
     * @param n the exponent.
     * @return the value {@code 10}<sup>{@code n}</sup>.
     */
    public static long degreeTen(int n) {

        return switch (n) {
            case 1 -> 10;
            case 2 -> 100;
            case 3 -> 1000;
            case 4 -> 10000;
            case 5 -> 100000;
            case 6 -> 1_000_000;
            case 7 -> 10_000_000;
            case 8 -> 100_000_000;
            case 9 -> 1_000_000_000;
            case 10 -> 10_000_000_000L;
            case 11 -> 100_000_000_000L;
            case 12 -> 1_000_000_000_000L;
            case 13 -> 10_000_000_000_000L;
            case 14 -> 100_000_000_000_000L;
            case 15 -> 1_000_000_000_000_000L;
            case 16 -> 10_000_000_000_000_000L;
            case 17 -> 100_000_000_000_000_000L;
            case 18 -> 1_000_000_000_000_000_000L;
            default -> 1;
        };
    }

    public static int numberSize(long num) {

        long number = Math.abs(num);

        if (number < 100_000) {  //10^5
            if (number < 100) {
                if (number < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (number < 1_000) {
                    return 3;
                } else {
                    if (number < 10_000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else if (number < 10_000_000_000L) {  //10^10
            if (number < 10_000_000) {
                if (number < 1_000_000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (number < 100_000_000) {
                    return 8;
                } else {
                    if (number < 1_000_000_000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        } else if (number < 1_000_000_000_000_000L) {   //10^15
            if (number < 1_000_000_000_000L) {
                if (number < 100_000_000_000L) {
                    return 11;
                } else {
                    return 12;
                }
            } else {
                if (number < 10_000_000_000_000L) {
                    return 13;
                } else {
                    if (number < 100_000_000_000_000L) {
                        return 14;
                    } else {
                        return 15;
                    }
                }
            }
        } else if (number <= 1_000_000_000_000_000_000L) {    //10^18
            if (number < 100_000_000_000_000_000L) {
                if (number < 10_000_000_000_000_000L) {
                    return 16;
                } else {
                    return 17;
                }
            } else {
                return 18;
            }
        }
        return 0;
    }
}
