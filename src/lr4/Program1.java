package lr4;

public class Program1 {
    
	public static void main(String[] args) {
        
		int height = 11;
        int width = 23;
        
        for (int i = 1; i <= height; i++) {
            System.out.print("cтрока " + i + ": ");
            int count = 0;
            
            for (int j = 0; j < width; j++) {
                System.out.print("+");
                count++;
            }
            
            System.out.println(" кол-во символов: " + count);
        }
    }
}