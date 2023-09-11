package ru.morozevich.arraysapp.util;

public class Calculator {

    public static int countEven(int[] numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    public static int countOdd(int[] numbers) {
        int oddNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int calculateDiffEvenOdd(int[] numbers) {
        int sumEvenNum = 0;
        int sumOddNum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumEvenNum += numbers[i];
            } else {
                sumOddNum += numbers[i];
            }
        }
        return sumEvenNum - sumOddNum;
    }

    public static int countZeros(int[] numbers) {
        int zeroQuantity = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == 0) {
                zeroQuantity++;
            }
        }
        return zeroQuantity;
    }

    public static int countPrimeNumbers(int[] numbers) {
        int compositeNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] <= 1) {
                compositeNumbers++;
            } else {
                for (int divider = 2; divider <= Math.sqrt(numbers[i]); divider++) {
                    if (numbers[i] % divider == 0) {
                        compositeNumbers++;
                        break;
                    }
                }
            }
        }
        return numbers.length - compositeNumbers;
    }
}

