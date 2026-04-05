package lr10.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;

public class CreateJsonFile {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        // Первая книга
        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        // Вторая книга
        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");  // Исправил опечатку "Булахов" -> "Булгаков"
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        // Исправлено: убрал "fileName:" и указал правильный путь
        try (FileWriter file = new FileWriter("src/lr10/resources/books.json")) {
            file.write(library.toJSONString());  // toJSONString() лучше, чем toString()
            System.out.println("JSON файл успешно создан по пути: src/lr10/resources/books.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}