package ua.com.owu.Entity.Dictionaries;
/**
 * Created by Roman Tymochko on 22.08.2017.
 */

public enum PaymentType {
    CASH("CASH"),
    CREDIT("CREDIT");


    private final String text;

    private PaymentType(String text) {
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
