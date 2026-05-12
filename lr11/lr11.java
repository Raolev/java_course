import java.util.*;
import java.util.stream.*;

public class lr11 {

    // 1. Четные числа из массива
    public static int[] filterEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    // 2. Общие элементы двух массивов
    public static int[] commonElements(int[] arr1, int[] arr2) {
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr1)
                .distinct()  // если нужно без повторов
                .filter(x -> set2.contains(x))
                .toArray();
    }

    // 3. Строки, начинающиеся с большой буквы
    public static List<String> startsWithUpperCase(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    // 4. Список квадратов чисел
    public static List<Integer> squares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 5/ Числа, большие заданного значения
    public static List<Integer> greaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    // Демонстрация работы всех методов
    public static void main(String[] args) {
        // 1. Четные числа
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Четные: " + Arrays.toString(filterEven(arr1)));

        // 2. Общие элементы
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        System.out.println("Общие: " + Arrays.toString(commonElements(a, b)));

        // 3. Строки с большой буквы
        List<String> words = Arrays.asList("apple", "Banana", "Cherry", "", null, "dog");
        System.out.println("С большой буквы: " + startsWithUpperCase(words));

        // 4. Квадраты чисел
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        System.out.println("Квадраты: " + squares(nums));

        // 5. Числа больше 3
        System.out.println("Больше 3: " + greaterThan(nums, 3));
    }
}