/**
 * Created by ABondarev on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        //new branch
        IMachine machine1 = new Printer(false, "4124");
        machine1.turnOn();
        machine1.turnOff();
        Printer printer = new Printer(true, "SUPER_PRINTER");
        printer.loadPaper(1);
        printer.print("welcome to the machine", 2);


    }
}
