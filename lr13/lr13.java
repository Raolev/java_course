package lr13;

public class lr13 {

    // Пример 1
    public static void example1() {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }

    // Пример 2
    public static void example2() {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }

    // Пример 3
    public static void example3() {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }

    // Пример 4
    public static void example4() {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
    }

    // Пример 5 – НЕ перехвачено (демонстрация)
    public static void example5() {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }

    // Пример 6 – ошибка компиляции, закомментирован
    /*
    public static void example6() {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
    */

    // Пример 7 – исключение внутри catch не ловится соседним catch
    public static void example7() {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        // System.out.println("3"); // недостижимый код
    }

    // Пример 8
    public static int m8() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
    public static void example8() {
        try {
            System.out.println(m8());
        } catch (RuntimeException e) {
            System.out.println("Исключение перехвачено в main");
        }
    }

    // Пример 9
    public static int m9() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
    public static void example9() {
        System.out.println(m9());
    }

    // Пример 10
    public static int m10() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }
    public static void example10() {
        System.out.println(m10());
    }

    // Пример 11
    public static void example11() {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }

    // Пример 12
    public static void m12(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void example12() {
        try {
            m12(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Пример 13
    public static void example13(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }

    // Пример 14
    public static void m14(int x) throws ArithmeticException {
        int h = 10 / x;
    }
    public static void example14(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m14(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }

    // -----------------------------------------------------------------
    // main с защитой от падения на примерах 5 и 7
    public static void main(String[] args) {
        System.out.println("Пример 1:");
        example1();

        System.out.println("\nПример 2:");
        example2();

        System.out.println("\nПример 3:");
        example3();

        System.out.println("\nПример 4:");
        example4();

        System.out.println("\nПример 5:");
        try {
            example5();
        } catch (RuntimeException e) {
            System.out.println("Перехвачено в main: " + e);
        }

        System.out.println("\nПример 7:");
        try {
            example7();
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено в main: " + e);
        }

        System.out.println("\nПример 8:");
        example8();

        System.out.println("\nПример 9:");
        example9();

        System.out.println("\nПример 10:");
        example10();

        System.out.println("\nПример 11:");
        example11();

        System.out.println("\nПример 12:");
        example12();

        System.out.println("\nПример 13:");
        example13(new String[]{});

        System.out.println("\nПример 14:");
        example14(new String[]{});
    }
}