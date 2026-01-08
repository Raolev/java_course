package lr4;

public class Program3 {
	
    public static void main(String[] args) {
    	
        int rows = 11;
        int cols = 23;
        
        int[][] rtg = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rtg[i][j] = 2;

            }

        }

        for (int i = 0; i < rows; i++) {
            System.out.print("cтрока " + (i+1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print(rtg[i][j]);
            }
            System.out.println();
        }
    }
}