package lr3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным");
                return;
            }

            int[] array = new int[size];
            int number = 2;

            for (int i = 0; i < size; i++) {
                array[i] = number;
                number += 5;
            }

            System.out.println("Массив чисел (остаток 2 при делении на 5):");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        } catch (NegativeArraySizeException e) {
            System.out.println("Размер массива должен быть положительным числом");
        } finally {
            scanner.close();
        }
    }
}