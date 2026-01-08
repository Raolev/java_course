package lr4;

import java.util.Scanner;

public class Program8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();
        
        System.out.println("Введите ключ (целое число):");
        int key = scanner.nextInt();
        scanner.nextLine();
        
        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().toLowerCase();
            
            if (answer.equals("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Обратное преобразование: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        
        scanner.close();
    }
    
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        
        for (char character : text.toCharArray()) {
            if (character >= 'А' && character <= 'Я') {

                char shifted = (char) ('А' + (character - 'А' + key) % 32);
                result.append(shifted);
            } else if (character >= 'а' && character <= 'я') {

                char shifted = (char) ('а' + (character - 'а' + key) % 32);
                result.append(shifted);
            } else if (character >= 'A' && character <= 'Z') {

                char shifted = (char) ('A' + (character - 'A' + key) % 26);
                result.append(shifted);
            } else if (character >= 'a' && character <= 'z') {

                char shifted = (char) ('a' + (character - 'a' + key) % 26);
                result.append(shifted);
            } else {

                result.append(character);
            }
        }
        
        return result.toString();
    }
    

    public static String decrypt(String text, int key) {

        return encrypt(text, -key);
    }
}