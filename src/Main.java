import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 200000;
        int max = 100000;
        for (final int current : arr) {
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        for (final int current : arr) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int days = 30;
        for (int element : arr) {
            sum += element;
        }
        float average = (float) sum / days;
        System.out.println("Общая сумма трат за месяц " + sum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

