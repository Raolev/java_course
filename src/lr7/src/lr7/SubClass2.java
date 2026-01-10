package lr7;

public class SubClass2 extends SuperClass2 {
    public int int1;
    
    public SubClass2(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }
    
    // Метод без параметров
    public void setField() {
        super.setField("default");
        this.int1 = 0;
    }
    
    // Метод с текстовым параметром (переопределение)
    @Override
    public void setField(String strEx) {
        super.setField(strEx);
    }
    
    // Метод с целочисленным параметром (перегрузка)
    public void setField(int intEx) {
        this.int1 = intEx;
    }
    
    // Метод с двумя параметрами (перегрузка)
    public void setField(String strEx, int intEx) {
        super.setField(strEx);
        this.int1 = intEx;
    }
    
    @Override
    public String toString() {
        return "sub" + "\n" +
               " Class name: " + this.getClass().getSimpleName() + "\n" +
               " str 1 = " + this.getStr1() + "\n" +
               " str length = " + this.getLength() + "\n" +
               " int 1 = " + this.int1;
    }
    
    public int getInt1() {
        return int1;
    }
    
    public void setInt1(int int1) {
        this.int1 = int1;
    }
}