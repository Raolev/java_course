package lr6;

import java.util.Random;

public class Task3 {
	
    public static void main(String[] args) {
    	
        Random random = new Random();
        
        // Генерируем случайное количество чисел (от 5 до 15)
        int count = random.nextInt(11) + 5;
        
        // Пример с произвольным количеством аргументов (случайные числа)
        System.out.println("Генерация " + count + " случайных чисел:");
        
        // Создаем массив случайных чисел
        int[] randomNumbers = new int[count];
        System.out.print("Числа: ");
        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        
        // Вызываем методы с использованием varargs
        System.out.println("\nРезультаты с varargs:");
        System.out.println("Максимум: " + Calculator.max(randomNumbers));
        System.out.println("Минимум: " + Calculator.min(randomNumbers));
        System.out.println("Среднее: " + String.format("%.2f", Calculator.average(randomNumbers)));
        
        // Альтернативный вариант: передаем числа напрямую
        System.out.println("\n--- Второй пример с другими случайными числами ---");
        
        // Генерируем случайные числа напрямую в вызове метода
        System.out.println("Максимум из 7 случайных: " + 
            Calculator.max(
                random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)
            ));
            
        System.out.println("Минимум из 5 случайных: " + 
            Calculator.min(
                random.nextInt(500),
                random.nextInt(500),
                random.nextInt(500),
                random.nextInt(500),
                random.nextInt(500)
            ));
            
        System.out.println("Среднее из 10 случайных: " + 
            String.format("%.2f", Calculator.average(
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200)
            )));
    }
}

class Calculator {
    // Методы с переменным числом аргументов
    
    public static int max(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static int min(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }
    
    public static double average(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    // Отдельные методы для работы с массивом
    
    public static int maxFromArray(int[] array) {
        if (array.length == 0) return 0;
        
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static int minFromArray(int[] array) {
        if (array.length == 0) return 0;
        
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }
    
    public static double averageFromArray(int[] array) {
        if (array.length == 0) return 0;
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}