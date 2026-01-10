package lr7;

public class SubClass5B extends SuperClass5 {
    protected char char1;
    
    public SubClass5B(String strEx, char charEx) {
        super(strEx);
        this.char1 = charEx;
    }
    
    @Override
    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" str 1 = " + this.getStr1());
        System.out.println(" char 1 = " + this.char1);
    }
    
    public char getChar1() {
        return char1;
    }
    
    public void setChar1(char char1) {
        this.char1 = char1;
    }
}