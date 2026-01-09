package lr6;

import java.util.Arrays;

public class Task9 {
	
    public static void main(String[] args) {
    	
        char[] array1 = {'A', 'B', 'C', 'D', 'E'};
        char[] array2 = {'1', '2', '3', '4', '5', '6'};
        char[] array3 = {'J', 'a', 'v', 'a'};
        
        System.out.println("Исходный массив 1: " + Arrays.toString(array1));
        ArrayProcessor.swapElements(array1);
        System.out.println("После замены:      " + Arrays.toString(array1));
        
        System.out.println("\nИсходный массив 2: " + Arrays.toString(array2));
        ArrayProcessor.swapElements(array2);
        System.out.println("После замены:      " + Arrays.toString(array2));
        
        System.out.println("\nИсходный массив 3: " + Arrays.toString(array3));
        ArrayProcessor.swapElements(array3);
        System.out.println("После замены:      " + Arrays.toString(array3));
    }
}

class ArrayProcessor {
    public static void swapElements(char[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Меняем местами элементы
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Переходим к следующей паре
            left++;
            right--;
        }
    }
}