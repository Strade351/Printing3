/**
 * Created by ABondarev on 15.03.2017.
 */
public class Printer {

    boolean isOn;
    String modelNumber;

    public Printer(boolean isOn, String modelNumber) {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    void print() {
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
        return "Printer{" +
                "isOn=" + isOn +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }
}
