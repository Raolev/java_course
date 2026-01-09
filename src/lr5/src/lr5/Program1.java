package lr5;

public class Program1 {
    private char symbol;
    
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    public int getCharCode() {
        return (int) symbol;
    }
    
    public void printCharAndCode() {
        System.out.println("Символ: " + symbol + ", Код: " + (int) symbol);
    }
    
    public static void main(String[] args) {
        Program1 holder = new Program1();
        holder.setSymbol('A');
        holder.printCharAndCode();
        System.out.println("Код символа: " + holder.getCharCode());
    }
}