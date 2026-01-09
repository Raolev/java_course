package lr5;

public class Program6 {
    private int max;
    private int min;
    
    // Конструктор без аргументов
    public Program6() {
        setValues(0, 0);
    }
    
    // Конструктор с одним аргументом
    public Program6(int value) {
        setValues(value);
    }
    
    // Конструктор с двумя аргументами
    public Program6(int value1, int value2) {
        setValues(value1, value2);
    }
    
    // Метод с одним аргументом
    public void setValues(int value) {
        setValues(value, value);
    }
    
    // Метод с двумя аргументами
    public void setValues(int value1, int value2) {
        // Сравниваем текущие значения и новые
        int currentMin = Math.min(min, Math.min(value1, value2));
        int currentMax = Math.max(max, Math.max(value1, value2));
        
        // Присваиваем новые значения
        this.min = Math.min(currentMin, currentMax);
        this.max = Math.max(currentMin, currentMax);
    }
    
    // Метод для отображения значений
    public void display() {
        System.out.println("Min: " + min + ", Max: " + max);
    }
    
    // Пример использования
    public static void main(String[] args) {
    	Program6 obj1 = new Program6();
    	Program6 obj2 = new Program6(10);
    	Program6 obj3 = new Program6(30, 20);
        
        System.out.println("Начальные значения:");
        obj1.display();
        obj2.display();
        obj3.display();
        
        // Изменение значений
        obj1.setValues(50, 25);
        obj2.setValues(15); // Один аргумент
        obj3.setValues(5, 40);
        
        System.out.println("\nПосле изменения:");
        obj1.display();
        obj2.display();
        obj3.display();
        
        // Проверка с разными значениями
        obj1.setValues(100, 200);
        System.out.println("\nПосле setValues(100, 200):");
        obj1.display();
    }
}