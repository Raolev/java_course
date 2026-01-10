package lr7;

public class FirstClass {
    public int int1;
    
    public FirstClass(int intEx) {
        this.int1 = intEx;
    }
    
    FirstClass() {
    }
    
    public void setField(int intEx) {
        this.int1 = intEx;
    }
    
    @Override
    public String toString() {
        return "super" + "\n" +
               " Class name: " + this.getClass().getSimpleName() + "\n" +
               " int 1 = " + this.int1;
    }
    
    public int getInt1() {
        return int1;
    }
    
    public void setInt1(int int1) {
        this.int1 = int1;
    }
}