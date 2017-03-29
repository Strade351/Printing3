/**
 * Created by ABondarev on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        //new branch
        /*Scanner scanner = new Scanner();
        scanner.turnOn();
        scanner.turnOff();*/
        //Generic branch
        ColorCartridge cc = new ColorCartridge();
        Printer <ColorCartridge> printer = new Printer<ColorCartridge>(true,"HP",cc);
        printer.print();
    }
}
