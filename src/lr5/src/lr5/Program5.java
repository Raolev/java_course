package lr5;

public class Program5 {
    private int value;
    
    // Конструктор без аргументов
    public Program5() {
        setValue(); // Используем метод без аргументов
    }
    
    // Конструктор с аргументом
    public Program5(int value) {
        setValue(value); // Используем метод с аргументом
    }
    
    // Метод без аргументов
    public void setValue() {
        this.value = 0;
    }
    
    // Метод с аргументом
    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }
    
    // Метод для проверки значения поля
    public int getValue() {
        return value;
    }
    
    // Пример использования
    public static void main(String[] args) {
    	Program5 obj1 = new Program5();
    	Program5 obj2 = new Program5(50);
    	Program5 obj3 = new Program5(150);
        
        System.out.println("Значение obj1: " + obj1.getValue());
        System.out.println("Значение obj2: " + obj2.getValue());
        System.out.println("Значение obj3: " + obj3.getValue());
        
        // Изменение значений через методы
        obj1.setValue(75);
        obj2.setValue(200); // Будет ограничено до 100
        obj3.setValue(); // Сброс к 0
        
        System.out.println("\nПосле изменения:");
        System.out.println("Значение obj1: " + obj1.getValue());
        System.out.println("Значение obj2: " + obj2.getValue());
        System.out.println("Значение obj3: " + obj3.getValue());
    }
}