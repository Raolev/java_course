package lr8;

import java.io.*;
import java.util.regex.Pattern;

public class Task3 {
	
    public static void main(String[] args) {
    	
        // Подготовка текста
        String[] lines = {
        		"spring is green",
        		"summer is bright",
        		"autumn is yellow",
        		"winter is white"
        };
        
        // Записываем исходный текст в файл
        try (PrintWriter pw = new PrintWriter("Weather.txt", "UTF-8")) {
            for (String line : lines) {
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Обработка файла
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("Weather.txt"), "UTF-8"));
             PrintWriter pw = new PrintWriter("result.txt", "UTF-8")) {
            
            String line;
            int lineNumber = 0;
            
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("[\\s;,:!?.]+");
                int consonantWordsCount = 0;
                StringBuilder consonantWords = new StringBuilder();
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        char firstChar = Character.toLowerCase(word.charAt(0));
                        if (isConsonant(firstChar)) {
                            consonantWordsCount++;
                            consonantWords.append(word).append(" ");
                        }
                    }
                }
                
                if (consonantWordsCount > 0) {
                    pw.println("Строка " + lineNumber + ":");
                    pw.println("  Количество слов: " + consonantWordsCount);
                    pw.println("  Слова: " + consonantWords.toString());
                    pw.println();
                }
            }
            
            System.out.println("Обработка завершена. Результат в result.txt");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static boolean isConsonant(char c) {
        String consonants = "бвгджзйклмнпрстфхцчшщ";
        return consonants.indexOf(Character.toLowerCase(c)) != -1;
    }
}