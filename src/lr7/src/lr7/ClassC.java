package lr7;

public class ClassC extends ClassB {
    public int int1;
    
    // Конструктор с параметрами
    public ClassC(char charEx, String strEx, int intEx) {
        super(charEx, strEx);
        this.int1 = intEx;
    }
    
    // Конструктор создания копии
    public ClassC(ClassC obj) {
        super(obj);
        this.int1 = obj.int1;
    }
    
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
               " char 1 = " + this.char1 + "\n" +
               " str 1 = " + this.str1 + "\n" +
               " int 1 = " + this.int1;
    }
    
    public int getInt1() {
        return int1;
    }
    
    public void setInt1(int int1) {
        this.int1 = int1;
    }
}