package lr3;

import java.util.Scanner;

public class Program5_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во чисел: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Кол-во должно быть положительным");
        } else {
            int sum = 0;
            int count = 1;
            System.out.println("Числа, удовлетворяющие условиям:");

            do {
                if (count % 5 == 2 || count % 3 == 1) {
                    System.out.print(count + " ");
                    sum += count;
                }
                count++;
            } while (count <= n);

            System.out.println("\nСумма: " + sum);
        }

        scanner.close();
    }
}