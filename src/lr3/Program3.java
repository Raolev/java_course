package lr3;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во чисел Фибоначчи: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Число должно быть положительным");
        } else if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1 1");
        } else {
            long a = 1, b = 1;
            System.out.print("1 1 ");

            for (int i = 3; i <= n; i++) {
                long c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }

        scanner.close();
    }
}
