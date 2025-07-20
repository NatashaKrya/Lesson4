import java.util.Scanner;

public class Average {

    public static double getAverage(int a, int b) {
        int sum = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    public static double getAverageEven(int fromNumber, int toNumber) {
        int sum = 0;
        int count = 0;

        for (int i = fromNumber; i <= toNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число для вычисления среднего арифметического:");
        int a = scanner.nextInt();

        System.out.println("Введите конечное число для вычисления среднего арифметического:");
        int b = scanner.nextInt();

        System.out.println("Среднее арифметическое чисел в диапазоне от " + a + " до " + b + " равно " + getAverage(a, b));

        //---------------------------------------//

        int startNumber = 18;
        int endNumber = 50;

        System.out.println("Среднее арифметическое чисел в диапазоне от " + startNumber + " до " + endNumber + " равно " + getAverage(startNumber, endNumber));

        //---------------------------------------//

        System.out.println("Среднее арифметическое четных чисел " + " равно " + getAverageEven(5, 28));
    }
}