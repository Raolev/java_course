package lr8;

import java.io.*;

public class Task2 {
	
    public static void main(String[] args) {
    	
        try {
            // Создание исходного файла
            DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("input.bin"));
            
            // Запись двух строк UTF-8
            dos.writeUTF("Первая строка текста");
            dos.writeUTF("Вторая строка текста");
            
            // Запись 5 чисел double
            double[] numbers = {3.14, -2.5, 10.0, -7.8, 15.3};
            for (double num : numbers) {
                dos.writeDouble(num);
            }
            
            dos.close();
            
            // Чтение исходного файла и запись результата
            DataInputStream dis = new DataInputStream(
                new FileInputStream("input.bin"));
            DataOutputStream dosResult = new DataOutputStream(
                new FileOutputStream("output.bin"));
            
            // Пропускаем первую строку
            dis.readUTF();
            
            // Читаем и записываем вторую строку
            String secondLine = dis.readUTF();
            dosResult.writeUTF(secondLine);
            
            // Читаем 5 чисел и записываем положительные
            for (int i = 0; i < 5; i++) {
                double num = dis.readDouble();
                if (num > 0) {
                    dosResult.writeDouble(num);
                }
            }
            
            dis.close();
            dosResult.close();
            
            System.out.println("Вторая строка: " + secondLine);
            System.out.println("Положительные числа записаны в output.bin");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}