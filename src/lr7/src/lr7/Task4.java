package lr7;

public class Task4 {
	
    public static void main(String[] args) {
    	
        // Создание оригинальных объектов
        ClassA objA1 = new ClassA('A');
        ClassB objB1 = new ClassB('B', "Hello");
        ClassC objC1 = new ClassC('C', "World", 100);
        
        System.out.println("=== Оригинальные объекты ===");
        System.out.println(objA1.toString());
        System.out.println("\n" + objB1.toString());
        System.out.println("\n" + objC1.toString());
        
        // Создание копий
        ClassA objA2 = new ClassA(objA1);
        ClassB objB2 = new ClassB(objB1);
        ClassC objC2 = new ClassC(objC1);
        
        System.out.println("\n=== Копии объектов ===");
        System.out.println(objA2.toString());
        System.out.println("\n" + objB2.toString());
        System.out.println("\n" + objC2.toString());
        
        // Изменение оригинала и проверка копии
        System.out.println("\n=== Проверка независимости копий ===");
        objC1.char1 = 'X';
        objC1.str1 = "Changed";
        objC1.int1 = 999;
        
        System.out.println("Оригинал ClassC после изменений:");
        System.out.println(objC1.toString());
        
        System.out.println("\nКопия ClassC (должна остаться без изменений):");
        System.out.println(objC2.toString());
    }
}