/**
 * Created by ABondarev on 15.03.2017.
 */
public class Printer implements IMachine {
    IMachine iMachine;
    String modelNumber;
    PaperTray paperTray;

    public Printer(boolean isOn, String modelNumber) {
        this.iMachine = new Machine(false);
        this.modelNumber = modelNumber;
        this.paperTray = new PaperTray();
    }

    /**
     * Вывести сведения о принтере
     */
    void print() {
        System.out.println(this.toString());
    }

    /**
     * Печать текста
     *
     * @param
     */
    @Override
    public void turnOn() {
        System.out.println("Warning up printer");

    }

    @Override
    public void turnOff() {
        System.out.println("Printer is Off");
    }

    @Override
    public boolean checkisOn() {
       return iMachine.checkisOn();
    }

    void print(String text, int copies) {
        if (checkisOn()) {
            while((!paperTray.isEmpty())&&(copies>0)){
                System.out.println(text);
                paperTray.pages--;
                copies--;
            }
            if(paperTray.isEmpty()){
                System.out.println("There is no paper");
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
        if (checkisOn())
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
    public void loadPaper(int cound){
        paperTray.addPaper(cound);
    }
}
