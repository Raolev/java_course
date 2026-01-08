package lr3;

import java.util.Scanner;

public class Program5
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во чисел: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Кол-во должно быть положительным");
        } else {
            int sum = 0;
            System.out.println("Числа, удовлетворяющие условиям:");

            for (int i = 1; i <= n; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }

            System.out.println("\nСумма: " + sum);
        }

        scanner.close();
    }
}