package lr7;

public class ClassA {
    public char char1;
    
    // Конструктор с параметром
    public ClassA(char charEx) {
        this.char1 = charEx;
    }
    
    // Конструктор создания копии
    public ClassA(ClassA obj) {
        this.char1 = obj.char1;
    }
    
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
               " char 1 = " + this.char1;
    }
    
    public char getChar1() {
        return char1;
    }
    
    public void setChar1(char char1) {
        this.char1 = char1;
    }
}