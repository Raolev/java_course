package lr6;

import java.util.Arrays;

public class Task6 {
	
    public static void main(String[] args) {
    	
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Исходный массив: " + Arrays.toString(original));
        
        // Берем первые 3 элемента
        int[] result1 = ArrayUtils.copyFirstElements(original, 3);
        System.out.println("Первые 3 элемента: " + Arrays.toString(result1));
        
        // Берем первые 5 элементов
        int[] result2 = ArrayUtils.copyFirstElements(original, 5);
        System.out.println("Первые 5 элементов: " + Arrays.toString(result2));
        
        // Пытаемся взять больше элементов, чем есть
        int[] result3 = ArrayUtils.copyFirstElements(original, 15);
        System.out.println("Первые 15 элементов (копия всего массива): " + 
                          Arrays.toString(result3));
        
        // Проверяем, что это действительно копия
        System.out.println("Копия равна оригиналу: " + Arrays.equals(original, result3));
        System.out.println("Копия это тот же объект? " + (original == result3));
    }
}

class ArrayUtils {
    public static int[] copyFirstElements(int[] array, int count) {
        // Если запрашиваем больше элементов, чем есть, возвращаем копию всего массива
        if (count >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        
        // Иначе возвращаем первые count элементов
        return Arrays.copyOf(array, count);
    }
}