package lr6;

public class Task4 {
	
    public static void main(String[] args) {
    	
        System.out.println("5!! = " + Factorial.doubleFactorial(5));
        System.out.println("6!! = " + Factorial.doubleFactorial(6));
        System.out.println("7!! = " + Factorial.doubleFactorial(7));
        System.out.println("8!! = " + Factorial.doubleFactorial(8));
        System.out.println("9!! = " + Factorial.doubleFactorial(9));
        System.out.println("10!! = " + Factorial.doubleFactorial(10));
    }
}

class Factorial {
    public static long doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}