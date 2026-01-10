package lr7;

public class SuperClass2 {
    private String str1;
    
    public SuperClass2(String strEx) {
        this.str1 = strEx;
    }
    
    SuperClass2() {
    }
    
    public void setField(String strEx) {
        this.str1 = strEx;
    }
    
    public int getLength() {
        return str1.length();
    }
    
    @Override
    public String toString() {
        return "super" + "\n" +
               " Class name: " + this.getClass().getSimpleName() + "\n" +
               " str 1 = " + this.getStr1() + "\n" +
               " str length = " + this.getLength();
    }
    
    public String getStr1() {
        return str1;
    }
    
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}