package lr8;

import java.io.*;

public class Primer10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        
        try {
            br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\MyFile1.txt"), "cp1251"));
            
            out = new PrintWriter("C:\\MyFile2.txt", "cp1251");
            
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}