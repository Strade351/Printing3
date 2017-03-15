/**
 * Created by ABondarev on 15.03.2017.
 */
public class Printer {

    private boolean isOn;
    private String modelNumber;

    public Printer(boolean isOn, String modelNumber) {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    void print() {
        if (isOn = true)
            System.out.println(toString());
    }

    void printString(String s) {
        System.out.println(s);
    }

    public boolean isOn() {
        return isOn;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public String toString() {
        return "Printer " + modelNumber + " включен";
    }
}
