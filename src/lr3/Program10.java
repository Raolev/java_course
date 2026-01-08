package lr3;

import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Program10 {

    public static void main(String[] args) {

        Random random = new Random();
        int size = 10;
        Integer[] array = new Integer[size];

        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Массив после сортировки по убыванию:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Альтернативный способ - сортировка "пузырьком"
        Integer[] array2 = new Integer[size];
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextInt(100);
        }

        System.out.println("\nВторой массив (для альтернативной сортировки):");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Сортировка "пузырьком" по убыванию
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array2[j] < array2[j + 1]) {
                    // Обмен элементов
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }

        System.out.println("Второй массив после сортировки пузырьком по убыванию:");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}