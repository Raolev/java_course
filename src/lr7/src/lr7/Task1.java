package lr7;

public class Task1 {
	 
	public static void main(String[] args) {
	 
		SuperClass1 superClassObject =
    		 new SuperClass1("Передал в конструктор суперкласса");
		String className = superClassObject.toString();
		System.out.println(className);
     
		SubClass1 subClassObject1 =
    		 new SubClass1("Передал в конструктор подкласса");
		String SubClass1 = subClassObject1.toString();
		System.out.println(SubClass1);
     
		SubClass1 subClassObject2 =
    		 new SubClass1("Передал в конструктор подкласса");
		String SubClass2 = subClassObject2.toString();
		System.out.println(SubClass2);
}
}