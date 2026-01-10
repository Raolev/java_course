package lr7;

public class ClassB extends ClassA {
    public String str1;
    
    // Конструктор с параметрами
    public ClassB(char charEx, String strEx) {
        super(charEx);
        this.str1 = strEx;
    }
    
    // Конструктор создания копии
    public ClassB(ClassB obj) {
        super(obj);
        this.str1 = obj.str1;
    }
    
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
               " char 1 = " + this.char1 + "\n" +
               " str 1 = " + this.str1;
    }
    
    public String getStr1() {
        return str1;
    }
    
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}