package lr6;

public class Task5 {
	
    public static void main(String[] args) {
    	
        int n = 10;
        
        int sum = SquareSum.sumOfSquares(n);
        int formulaResult = SquareSum.sumOfSquaresFormula(n);
        
        System.out.println("Сумма квадратов от 1 до " + n + " (цикл): " + sum);
        System.out.println("Сумма квадратов от 1 до " + n + " (формула): " + formulaResult);
        System.out.println("Результаты совпадают: " + (sum == formulaResult));
        
        // Проверка разных значений
        System.out.println("\nПроверка для n=5: " + SquareSum.sumOfSquares(5) + 
                         " = " + SquareSum.sumOfSquaresFormula(5));
        System.out.println("Проверка для n=15: " + SquareSum.sumOfSquares(15) + 
                         " = " + SquareSum.sumOfSquaresFormula(15));
    }
}

class SquareSum {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    
    public static int sumOfSquaresFormula(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}