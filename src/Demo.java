/**
 * Created by ABondarev on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        //new branch
        Printer printer = new Printer(true, "SUPER_PRINTER");
        printer.print("welcome to the machine", 2);
        printer.turnOff();
        printer.print("Nine Inch Nails", 9);

    }
}
