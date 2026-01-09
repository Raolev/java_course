package lr5;

public class Program2 {
    private char start;
    private char end;
    
    public void setRange(char start, char end) {
        this.start = start;
        this.end = end;
    }
    
    public void printRange() {

        char min = start < end ? start : end;
        char max = start < end ? end : start;
        
        System.out.print("Символы от " + start + " до " + end + ": ");
        for (char c = min; c <= max; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Program2 printer = new Program2();
        printer.setRange('A', 'D');
        printer.printRange();
    }
}