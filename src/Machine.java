/**
 * Created by Тим on 28.03.2017.
 */
public class Machine implements IMachine{
    boolean isOn;



    public void turnOn(){
        isOn = true;
        System.out.println("Machine is On");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Machine is Off");
    }

    @Override
    public boolean checkisOn() {
        if (isOn) {
            return true;

        } else {
            return false;
        }
    }

    public Machine(boolean isOn) {
        this.isOn = isOn;
    }
}
