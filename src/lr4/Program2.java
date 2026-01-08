package lr4;

public class Program2 {
	
    public static void main(String[] args) {
    	
        int height = 11;
        
        for (int i = 1; i <= height; i++) {
            System.out.print("cтрока " + i + ": ");
            int count = 0;
            
            for (int j = 0; j < i; j++) {
                System.out.print("+");
                count++;
            }
            
            System.out.println(" кол-во символов: " + count);
        }
    }
}