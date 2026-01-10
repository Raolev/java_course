package lr7;

public class SecondClass extends FirstClass {
    public char char1;
    
    public SecondClass(int intEx, char charEx) {
        super(intEx);
        this.char1 = charEx;
    }
    
    SecondClass() {
    }
    
    // Перегрузка метода
    public void setField(int intEx, char charEx) {
        super.setField(intEx);
        this.char1 = charEx;
    }
    
    @Override
    public String toString() {
        return "super" + "\n" +
               " Class name: " + this.getClass().getSimpleName() + "\n" +
               " int 1 = " + this.int1 + "\n" +
               " char 1 = " + this.char1;
    }
    
    public char getChar1() {
        return char1;
    }
    
    public void setChar1(char char1) {
        this.char1 = char1;
    }
}