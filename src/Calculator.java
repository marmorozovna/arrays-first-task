public class Calculator {

    static int calculateEven(int[] numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    static int calculateOdd(int[] numbers) {
        int oddNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    static int calculateDiffEvenOdd(int[] numbers) {
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

    static int calculateZeros(int[] numbers) {
        int zeroQuantity = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == 0) {
                zeroQuantity++;
            }
        }
        return zeroQuantity;
    }

    static int calculatePrimeNumbers(int[] numbers) {
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
        return 10 - compositeNumbers;
    }
}

