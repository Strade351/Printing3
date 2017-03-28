/**
 * Created by Тим on 28.03.2017.
 */
public class Scanner implements IMachine{
    IMachine iMachine;

    public Scanner() {
        this.iMachine = new Machine(false);
    }

    @Override
    public void turnOn() {
        iMachine.turnOn();
        System.out.println("scaner");
    }

    @Override
    public void turnOff() {
        iMachine.turnOff();
        System.out.println("scanner");

    }

    @Override
    public boolean checkisOn() {
        return iMachine.checkisOn();
    }
}
