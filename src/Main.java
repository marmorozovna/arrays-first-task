public class Main {
    public static void main(String[] args) {
        int[] numbers = {37, 96, 0, 81, -102, 17, -19, 66, 40, 18};
        System.out.println("Количество четных числе: " + Calculator.calculateEven(numbers));
        System.out.println("Количество нечетных чисел: " + Calculator.calculateOdd(numbers));
        System.out.println("Количество простых чисел: " + Calculator.calculatePrimeNumbers(numbers));
        System.out.println("Cумма чисел: " + Calculator.calculateSum(numbers));
        System.out.println("Разность между суммой чисел с четным индексом в массиве и нечетным: " + Calculator.calculateDiffEvenOdd(numbers));
        System.out.println("Количество нулей: " + Calculator.calculateZeros(numbers));
    }
}