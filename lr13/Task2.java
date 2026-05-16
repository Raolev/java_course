package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер столбца (начиная с 0): ");
            int col = scanner.nextInt();

            if (col < 0 || col >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует.");
            }

            System.out.println("Столбец " + col + ":");
            for (int[] row : matrix) {
                System.out.println(row[col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}