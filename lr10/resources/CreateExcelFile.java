package lr10.resources;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Row;

public class CreateExcelFile {
    public static void main(String[] args) throws IOException {

        // Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");  // Исправлено: убрал "Задача: "

        // Создаем заголовок (строка 0)
        Row headerRow = sheet.createRow(0);  // Исправлено: было createRow(0, 0)
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристика");
        headerRow.createCell(2).setCellValue("Стоимость");

        // Первая строка данных (строка 1)
        Row dataRow1 = sheet.createRow(1);  // Исправлено: было createRow(0, 1)
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Java Programming");
        dataRow1.createCell(2).setCellValue(1500.0);

        // Вторая строка данных (строка 2)
        Row dataRow2 = sheet.createRow(2);  // Исправлено: было createRow(0, 2)
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, ОЗУ: 16GB");
        dataRow2.createCell(2).setCellValue(75000.0);

        // Записываем книгу Excel в файл
        String fileName = "src/lr10/resources/products.xlsx";
        FileOutputStream outputStream = new FileOutputStream(fileName);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + fileName);
    }
}