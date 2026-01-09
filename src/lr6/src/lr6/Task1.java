package lr6;

public class Task1 {
	
    public static void main(String[] args) {
    	
        MyClass obj = new MyClass();
        
        // Вызов метода с символьным аргументом
        obj.setValue('A');
        System.out.println("charField: " + obj.getCharField());
        
        // Вызов метода с текстовым аргументом
        obj.setValue("Hello World");
        System.out.println("textField: " + obj.getTextField());
        
        // Вызов метода с массивом из одного элемента
        obj.setValue(new char[]{'B'});
        System.out.println("charField: " + obj.getCharField());
        
        // Вызов метода с массивом из нескольких элементов
        obj.setValue(new char[]{'J', 'a', 'v', 'a'});
        System.out.println("textField: " + obj.getTextField());
    }
}

class MyClass {
    private char charField;
    private String textField;
    
    // Метод для символьного аргумента
    public void setValue(char ch) {
        charField = ch;
    }
    
    // Метод для текстового аргумента
    public void setValue(String str) {
        textField = str;
    }
    
    // Метод для символьного массива
    public void setValue(char[] chars) {
        if (chars.length == 1) {
            charField = chars[0];
        } else {
            textField = new String(chars);
        }
    }
    
    // Геттеры
    public char getCharField() {
        return charField;
    }
    
    public String getTextField() {
        return textField;
    }
}