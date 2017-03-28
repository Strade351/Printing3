/**
 * Created by Тим on 28.03.2017.
 */
public class Machine implements IMachine {
    boolean isOn;



    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public Machine(boolean isOn) {
        this.isOn = isOn;
    }
}
