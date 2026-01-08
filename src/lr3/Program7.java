package lr3;

public class Program7 {

    public static void main(String[] args) {

        int size = 10;
        char[] array = new char[size];

        char currentChar = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = currentChar;
            currentChar += 2;
        }

        System.out.println("Массив в обычном порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}