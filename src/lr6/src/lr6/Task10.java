package lr6;

import java.util.Arrays;

public class Task10 {
	
    public static void main(String[] args) {
        
        int[] result1 = MinMaxFinder.findMinMax(5, 2, 8, 1, 9, 3);
        System.out.println("Аргументы: 5, 2, 8, 1, 9, 3");
        System.out.println("[min, max] = " + Arrays.toString(result1));
        
        int[] result2 = MinMaxFinder.findMinMax(10);
        System.out.println("\nАргумент: 10");
        System.out.println("[min, max] = " + Arrays.toString(result2));
        
        int[] result3 = MinMaxFinder.findMinMax(7, 3, 15, 4, 2, 8, 6);
        System.out.println("\nАргументы: 7, 3, 15, 4, 2, 8, 6");
        System.out.println("[min, max] = " + Arrays.toString(result3));
        
        int[] result4 = MinMaxFinder.findMinMax();
        System.out.println("\nБез аргументов");
        System.out.println("[min, max] = " + Arrays.toString(result4));
    }
}

class MinMaxFinder {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            // Возвращаем массив с нулями, если нет аргументов
            return new int[]{0, 0};
        }
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return new int[]{min, max};
    }
}