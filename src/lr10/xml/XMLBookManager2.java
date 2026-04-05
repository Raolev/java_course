package lr10.xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XMLBookManager2 {
    private static final String FILE_PATH = "src/lr10/resources/books.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- XML КНИГИ ---");
            System.out.println("1. Показать все книги");
            System.out.println("2. Добавить книгу");
            System.out.println("3. Поиск по автору");
            System.out.println("4. Поиск по году");
            System.out.println("5. Удалить книгу по названию");
            System.out.println("6. Выход");
            System.out.print("Выберите: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> showAllBooks();
                case 2 -> addBook(scanner);
                case 3 -> searchByAuthor(scanner);
                case 4 -> searchByYear(scanner);
                case 5 -> deleteBookByTitle(scanner);
                case 6 -> {
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private static Document loadDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(new File(FILE_PATH));
    }

    private static void saveDocument(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }

    private static void showAllBooks() {
        try {
            Document doc = loadDocument();
            NodeList books = doc.getElementsByTagName("book");
            System.out.println("\n=== ВСЕ КНИГИ ===");
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год: " + book.getElementsByTagName("year").item(0).getTextContent());
                System.out.println("---");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBook(Scanner scanner) {
        try {
            Document doc = loadDocument();
            Element library = doc.getDocumentElement();

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.print("Введите автора: ");
            String author = scanner.nextLine();
            System.out.print("Введите год издания: ");
            String year = scanner.nextLine();

            Element newBook = doc.createElement("book");
            Element titleElem = doc.createElement("title");
            titleElem.setTextContent(title);
            Element authorElem = doc.createElement("author");
            authorElem.setTextContent(author);
            Element yearElem = doc.createElement("year");
            yearElem.setTextContent(year);

            newBook.appendChild(titleElem);
            newBook.appendChild(authorElem);
            newBook.appendChild(yearElem);
            library.appendChild(newBook);

            saveDocument(doc);
            System.out.println("Книга добавлена!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchByAuthor(Scanner scanner) {
        try {
            Document doc = loadDocument();
            NodeList books = doc.getElementsByTagName("book");
            System.out.print("Введите автора для поиска: ");
            String searchAuthor = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                if (author.equalsIgnoreCase(searchAuthor)) {
                    System.out.println("Найдена: " + book.getElementsByTagName("title").item(0).getTextContent());
                    found = true;
                }
            }
            if (!found) System.out.println("Книги автора \"" + searchAuthor + "\" не найдены.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchByYear(Scanner scanner) {
        try {
            Document doc = loadDocument();
            NodeList books = doc.getElementsByTagName("book");
            System.out.print("Введите год издания: ");
            String searchYear = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                String year = book.getElementsByTagName("year").item(0).getTextContent();
                if (year.equals(searchYear)) {
                    System.out.println("Найдена: " + book.getElementsByTagName("title").item(0).getTextContent());
                    found = true;
                }
            }
            if (!found) System.out.println("Книг за " + searchYear + " год не найдено.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookByTitle(Scanner scanner) {
        try {
            Document doc = loadDocument();
            NodeList books = doc.getElementsByTagName("book");
            System.out.print("Введите название книги для удаления: ");
            String titleToDelete = scanner.nextLine();
            boolean deleted = false;
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                if (title.equalsIgnoreCase(titleToDelete)) {
                    book.getParentNode().removeChild(book);
                    deleted = true;
                    break;
                }
            }
            if (deleted) {
                saveDocument(doc);
                System.out.println("Книга удалена!");
            } else {
                System.out.println("Книга не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}