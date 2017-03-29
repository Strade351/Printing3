/**
 * Created by MUtemov on 29.03.2017.
 */
public class BWCartridge implements ICartridge {
    @Override
    public String toString() {
        return "BW";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }
}
