import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorki");
        //Задание 1
        System.out.println("я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        //Задание 2
        System.out.println((46 + 10) * (10 / 3f));
        System.out.println((29) * (4) * (-15));
        //Задание 3
        int number = 10500;
        float result = ((number / 10f) / 10f);
        System.out.println(result);
        //Задание 4
        result = 3.6f * 4.1f * 5.9f;
        System.out.println(result);
        //Задание 5
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //Задание 6

        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        }
        if (b % 2 == 0) {
            System.out.println("Четное");
        }
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }
}