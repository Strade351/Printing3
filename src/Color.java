/**
 * Created by Anatoliy on 22.03.2017.
 */
public enum Color {
    RED("Red", 0xff0000),
    GREEN("Green", 0x00ff00),
    BlUE("Blue", 0x0000ff);

    String name;
    int code;

    Color(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
