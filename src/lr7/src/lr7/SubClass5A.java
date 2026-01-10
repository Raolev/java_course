package lr7;

public class SubClass5A extends SuperClass5 {
    protected int int1;
    
    public SubClass5A(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }
    
    @Override
    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" str 1 = " + this.getStr1());
        System.out.println(" int 1 = " + this.int1);
    }
    
    public int getInt1() {
        return int1;
    }
    
    public void setInt1(int int1) {
        this.int1 = int1;
    }
}