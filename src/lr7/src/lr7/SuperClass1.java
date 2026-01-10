package lr7;

public class SuperClass1 {
	
	private String str1;
	
	public SuperClass1(String strEx) {
		this.str1 = strEx;
	}
 
	SuperClass1() {
	}
 
	@Override
	public String toString() {
		String superClassNameAndFieldValue;
		superClassNameAndFieldValue = "super" + "\n" +
			 " Class name: " + this.getClass().getSimpleName() + "\n" +
			 " str 1 = " + this.getStr1();
	 
		return superClassNameAndFieldValue;
	}
 
	public String getStr1() {
		return str1;
	}
 
	public void setStr1(String str1) {
		this.str1 = str1;
	}
 
}