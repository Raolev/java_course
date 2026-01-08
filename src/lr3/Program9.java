package lr3;

import java.util.Random;

public class Program9 {

    public static void main(String[] args) {

        Random random = new Random();
        int size = 15; // Можно изменить размер массива
        int[] array = new int[size];

        // Заполнение массива случайными числами
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // числа от 0 до 99
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Поиск минимального значения
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы элементов с минимальным значением: ");

        // Поиск всех индексов с минимальным значением
        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}