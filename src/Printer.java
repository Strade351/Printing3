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

    /**
     * Вывести сведения о принтере
     */
    void print() {
        System.out.println(this.toString());
    }

    /**
     * Печать текста
     * @param
     */
    void print(String text, int copies) {
        if (isOn == true) {
            for (int i = 0; i < copies; i++) {
                System.out.println(text);
            }
        }
        else
            System.out.println(modelNumber + " is off");
    }

    /**
     * Печать цветов
     * @param
     */
    void printColors() {
        for (Color x: Color.values()) {
            System.out.println(x.name + " " + Integer.toHexString(x.code));
        }
    }

    /**
     * Возвращает строковое представление состояния
     * @return
     */
    private String getState() {
        if (isOn == true)
            return "On";
        else
            return "Off";
    }

    void printString(String s) {
        System.out.println(s);
    }

    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Этот метод возвращает текущее состояние в виде строки
     * @return String
     */

    @Override
    public String toString() {
        String s = "Printer model: " + modelNumber + "\n Current state: " + getState();
        return s;
    }
}
