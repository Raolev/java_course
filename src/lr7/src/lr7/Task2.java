package lr7;

public class Task2 {
	
    public static void main(String[] args) {
    	
        SuperClass2 superClassObject = 
            new SuperClass2("Текст суперкласса");
        System.out.println(superClassObject.toString());
        
        SubClass2 subClassObject = 
            new SubClass2("Текст подкласса", 100);
        System.out.println("\n" + subClassObject.toString());
        
        // Проверка методов setField
        System.out.println("\n=== Проверка методов setField ===");
        
        subClassObject.setField();
        System.out.println("После setField(): " + subClassObject.getStr1() + 
                          ", " + subClassObject.getInt1());
        
        subClassObject.setField("Новый текст");
        System.out.println("После setField(String): " + subClassObject.getStr1() + 
                          ", " + subClassObject.getInt1());
        
        subClassObject.setField(200);
        System.out.println("После setField(int): " + subClassObject.getStr1() + 
                          ", " + subClassObject.getInt1());
        
        subClassObject.setField("Еще текст", 300);
        System.out.println("После setField(String, int): " + subClassObject.getStr1() + 
                          ", " + subClassObject.getInt1());
    }
}