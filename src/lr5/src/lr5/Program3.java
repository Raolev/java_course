package lr5;

public class Program3 {
    private int first;
    private int second;
    
    // Конструктор без аргументов
    public Program3() {
        this.first = 0;
        this.second = 0;
    }
    
    // Конструктор с одним аргументом
    public Program3(int value) {
        this.first = value;
        this.second = value;
    }
    
    // Конструктор с двумя аргументами
    public Program3(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public void display() {
        System.out.println("Первое поле: " + first + ", Второе поле: " + second);
    }
    
    public static void main(String[] args) {
    	Program3 obj1 = new Program3();
    	Program3 obj2 = new Program3(10);
    	Program3 obj3 = new Program3(10, 20);
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}