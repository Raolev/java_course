package lr3;

import java.util.Scanner;

public class Program3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во чисел Фибоначчи: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Число должно быть положительным");
        } else {
            long a = 1, b = 1;
            int count = 1;

            while (count <= n) {
                if (count == 1) {
                    System.out.print("1 ");
                } else if (count == 2) {
                    System.out.print("1 ");
                } else {
                    long c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
                count++;
            }
            System.out.println();
        }

        scanner.close();
    }
}