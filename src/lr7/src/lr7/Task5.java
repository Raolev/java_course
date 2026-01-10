package lr7;

public class Task5 {
	
    public static void main(String[] args) {
    	
        // Создание объектов
        SuperClass5 superClassObject = 
            new SuperClass5("Суперкласс");
        SubClass5A subClassObjectA = 
            new SubClass5A("Подкласс A", 100);
        SubClass5B subClassObjectB = 
            new SubClass5B("Подкласс B", 'X');
        
        System.out.println("=== Прямой вызов display() ===");
        superClassObject.display();
        System.out.println();
        subClassObjectA.display();
        System.out.println();
        subClassObjectB.display();
        
        System.out.println("\n=== Вызов через переменную суперкласса ===");
        SuperClass5 ref;
        
        ref = superClassObject;
        System.out.println("Ссылка на SuperClass5:");
        ref.display();
        
        ref = subClassObjectA;  // ссылка суперкласса на объект подкласса A
        System.out.println("\nСсылка SuperClass5 на SubClass5A:");
        ref.display();  // будет вызван переопределенный метод SubClass5A!
        
        ref = subClassObjectB;  // ссылка суперкласса на объект подкласса B
        System.out.println("\nСсылка SuperClass5 на SubClass5B:");
        ref.display();  // будет вызван переопределенный метод SubClass5B!
    }
}