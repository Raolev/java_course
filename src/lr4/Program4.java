package lr4;

public class Program4 {
    
    public static void main(String[] args) {
        
        int size = 11;
        
        char[][] triangle = new char[size][];
        
        for (int i = 0; i < size; i++) {
            triangle[i] = new char[i + 1];
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = '+';
            }
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print("строка " + (i+1) + ": ");
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}