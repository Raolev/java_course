package lr4;

import java.util.Random;

public class Program5 {
    
    public static void main(String[] args) {
        
        int rows = 3;
        int cols = 5;
        
        int[][] original = new int[rows][cols];
        Random random = new Random();
        
        System.out.println("Исходный массив " + rows + "x" + cols + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = random.nextInt(100);  // числа от 0 до 99
                System.out.print(original[i][j] + "\t");
            }
            System.out.println();
        }
        
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }
        
        System.out.println("\nМассив после транспонирования " + cols + "x" + rows + ":");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
    }
}