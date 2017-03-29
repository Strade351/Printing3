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
        Printer <ColorCartridge> fprinter = new Printer<ColorCartridge>(true,"HP",new ColorCartridge());
        //fprinter.print();
        Printer <BWCartridge> sprinter = new Printer<BWCartridge>(true,"Cannon",new BWCartridge());
        /*fprinter.printUsingCartridge(new ColorCartridge(), "txt");
        fprinter.printUsingCartridge(new BWCartridge(),"txt");*/
        print1(sprinter);
        print1(fprinter);
    }
    public static void print1(Printer<? extends ICartridge> p){
        System.out.println(p.cartridge.getFillPercentage());
    }
}
