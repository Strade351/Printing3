/**
 * Created by ABondarev on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Printer printer = new Printer(true, "SUPER_PRINTER");
        printer.print();
        printer.print("Nine Inch Nails", 9);
        printer.printColors();
    }
}
