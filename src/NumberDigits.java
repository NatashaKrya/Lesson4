import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        System.out.println("Вы ввели число: " + number);

        int digitSum = 0;
        int oddDigitSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            int digit = number % 10;

            digitSum += digit;

            maxDigit = Math.max(maxDigit, digit);

            if (digit % 2 != 0) {
                oddDigitSum +=digit;
            }

            number = number / 10;
        }

        System.out.println("Сумма цифр числа равна: " + digitSum);
        System.out.println("Сумма нечетных цифр числа равна: " + oddDigitSum);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }
}