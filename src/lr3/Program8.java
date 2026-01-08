package lr3;

public class Program8 {

    public static void main(String[] args) {

        int size = 10;
        char[] array = new char[size];

        char currentChar = 'B'; // Начинаем с B (A пропускаем)
        int index = 0;

        while (index < size) {
            // Проверяем, не является ли буква гласной
            if (currentChar != 'A' && currentChar != 'E' &&
                    currentChar != 'I' && currentChar != 'O' &&
                    currentChar != 'U' && currentChar != 'Y') {
                array[index] = currentChar;
                index++;
            }
            currentChar++;

            // Если дошли до Z, возвращаемся к A
            if (currentChar > 'Z') {
                currentChar = 'A';
            }
        }

        System.out.println("Массив согласных букв:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}