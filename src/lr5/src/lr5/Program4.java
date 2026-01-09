package lr5;

public class Program4 {
    private char symbol;
    private int number;
    
    // Конструктор с двумя аргументами
    public Program4(int number, char symbol) {
        this.symbol = symbol;
        this.number = number;
    }
    
    // Конструктор с одним аргументом double
    public Program4(double value) {
        // Целая часть определяет код символа
        int intPart = (int) value;
        this.symbol = (char) intPart;
        
        // Дробная часть (только десятые и сотые) определяет целое число
        double fractional = value - intPart;
        // Умножаем на 100, берем целую часть
        this.number = (int) (fractional * 100);
    }
    
    public void display() {
        System.out.println("Символ: " + symbol + " (код: " + (int) symbol + 
                          "), Число: " + number);
    }
    
    public static void main(String[] args) {
    	Program4 obj1 = new Program4(12, 'A');
    	Program4 obj2 = new Program4(65.1267);
        
        obj1.display();
        obj2.display();
    }
}