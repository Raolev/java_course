package lr6;

import java.util.Arrays;

public class Task8 {
	
    public static void main(String[] args) {
    	
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50, 60};
        int[] array3 = {5, 10, 15};
        
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Среднее: " + ArrayMath.calculateAverage(array1));
        
        System.out.println("\nМассив 2: " + Arrays.toString(array2));
        System.out.println("Среднее: " + ArrayMath.calculateAverage(array2));
        
        System.out.println("\nМассив 3: " + Arrays.toString(array3));
        System.out.println("Среднее: " + ArrayMath.calculateAverage(array3));
        
        // Пример с пустым массивом
        int[] emptyArray = {};
        System.out.println("\nПустой массив: " + Arrays.toString(emptyArray));
        System.out.println("Среднее: " + ArrayMath.calculateAverage(emptyArray));
    }
}

class ArrayMath {
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        return (double) sum / array.length;
    }
}