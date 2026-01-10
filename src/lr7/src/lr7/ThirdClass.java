package lr7;

public class ThirdClass extends SecondClass {
    public String str1;
    
    public ThirdClass(int intEx, char charEx, String strEx) {
        super(intEx, charEx);
        this.str1 = strEx;
    }
    
    ThirdClass() {
    }
    
    // Перегрузка метода
    public void setField(int intEx, char charEx, String strEx) {
        super.setField(intEx, charEx);
        this.str1 = strEx;
    }
    
    @Override
    public String toString() {
        return "super" + "\n" +
               " Class name: " + this.getClass().getSimpleName() + "\n" +
               " int 1 = " + this.int1 + "\n" +
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