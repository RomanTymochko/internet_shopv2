package ua.com.owu.Entity.Dictionaries;
/**
 * Created by Roman Tymochko on 22.08.2017.
 */
public enum DeliveryType {
    POSTAL("POSTAL"),
    COURIER("COURIER"),
    PICK_UP("PICK_UP");

    private final String text;

    private DeliveryType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
