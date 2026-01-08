package lr4;

public class Program7 {
    
    public static void main(String[] args) {
        
        int rows = 9;
        int cols = 9;
        
        int[][] snake = new int[rows][cols];
        int value = 1;
        
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < cols; j++) {
                    snake[i][j] = value++;
                }
            } else {

                for (int j = cols - 1; j >= 0; j--) {
                    snake[i][j] = value++;
                }
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", snake[i][j]);
            }
            System.out.println();
        }
    }
}