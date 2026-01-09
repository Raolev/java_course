package lr6;

public class Task2 {
	
    public static void main(String[] args) {
    	
        // Вызовем метод несколько раз
        Counter.displayAndIncrement();
        Counter.displayAndIncrement();
        Counter.displayAndIncrement();
        Counter.displayAndIncrement();
        Counter.displayAndIncrement();
    }
}

class Counter {
    private static int value = 0;
    
    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + value);
        value++;
    }
}