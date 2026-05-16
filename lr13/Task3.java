package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество элементов: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Количество элементов должно быть положительным.");
            }

            byte[] array = new byte[n];
            int sum = 0;  // Используем int для суммы, чтобы избежать переполнения в процессе суммирования

            System.out.println("Введите элементы (числа от -128 до 127):");
            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                if (input < Byte.MIN_VALUE || input > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Выход за границы типа byte: " + input);
                }
                array[i] = (byte) input;
                sum += array[i];
            }

            // Проверка, что сумма тоже не выходит за byte (хотя sum типа int, но если нужно привести к byte, может быть переполнение)
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Сумма выходит за границы типа byte.");
            }

            System.out.println("Сумма элементов (byte): " + (byte) sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}