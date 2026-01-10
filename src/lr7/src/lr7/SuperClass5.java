package lr7;

public class SuperClass5 {
    private String str1;
    
    public SuperClass5(String strEx) {
        this.str1 = strEx;
    }
    
    SuperClass5() {
    }
    
    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" str 1 = " + this.getStr1());
    }
    
    public String getStr1() {
        return str1;
    }
    
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}