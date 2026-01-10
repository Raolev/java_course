package lr7;

public class Task3 {
	
    public static void main(String[] args) {
    	
        FirstClass firstClassObject = 
            new FirstClass(10);
        System.out.println(firstClassObject.toString());
        
        SecondClass secondClassObject = 
            new SecondClass(20, 'A');
        System.out.println("\n" + secondClassObject.toString());
        
        ThirdClass thirdClassObject = 
            new ThirdClass(30, 'B', "Hello");
        System.out.println("\n" + thirdClassObject.toString());
        
        // Проверка методов setField
        System.out.println("\n=== Проверка методов setField ===");
        
        firstClassObject.setField(100);
        System.out.println("FirstClass после setField(int):\n" + 
                          firstClassObject.toString());
        
        secondClassObject.setField(200, 'Z');
        System.out.println("\nSecondClass после setField(int, char):\n" + 
                          secondClassObject.toString());
        
        thirdClassObject.setField(300, 'X', "Новый текст");
        System.out.println("\nThirdClass после setField(int, char, String):\n" + 
                          thirdClassObject.toString());
    }
}