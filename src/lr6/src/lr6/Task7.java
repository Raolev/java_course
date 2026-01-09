package lr6;

import java.util.Arrays;

public class Task7 {
	
    public static void main(String[] args) {
    	
        char[] charArray = {'H', 'e', 'l', 'l', 'o', '!', ' ', 'J', 'a', 'v', 'a'};
        
        System.out.println("Исходный символьный массив: " + 
                          Arrays.toString(charArray));
        
        int[] codeArray = Converter.charArrayToCodes(charArray);
        
        System.out.println("Массив кодов символов: " + 
                          Arrays.toString(codeArray));
        
        // Выведем символы и их коды
        System.out.println("\nСимволы и их коды:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.printf("'%c' -> %d\n", charArray[i], codeArray[i]);
        }
    }
}

class Converter {
    public static int[] charArrayToCodes(char[] chars) {
        int[] codes = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i]; // Преобразуем char в int (код символа)
        }
        
        return codes;
    }
}