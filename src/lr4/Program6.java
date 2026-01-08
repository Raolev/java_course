package lr4;

import java.util.Random;

public class Program6 {
    
    public static void main(String[] args) {
        
        int rows = 5;
        int cols = 7;
        
        int[][] original = new int[rows][cols];
        Random random = new Random();
        
        System.out.println("Исходный массив " + rows + "x" + cols + ":");
        int counter = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = counter++;
                System.out.printf("%4d", original[i][j]);
            }
            System.out.println();
        }
        
        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);
        
        System.out.println("\nУдаляем строку " + (rowToRemove + 1) + 
                          " и столбец " + (colToRemove + 1));
        
        int[][] newArray = new int[rows - 1][cols - 1];
        
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) continue;
            
            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) continue;
                
                newArray[newRow][newCol] = original[i][j];
                newCol++;
            }
            newRow++;
        }
        
        System.out.println("\nНовый массив " + (rows-1) + "x" + (cols-1) + ":");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.printf("%4d", newArray[i][j]);
            }
            System.out.println();
        }
    }
}