package activities.activity4;

import java.io.Serializable;

public class Table  implements Serializable {
    private String color;
    private int numberOfLegs;

    public Table(String color, int numberOfLegs) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Mesa -> color: " + this.color + ", número de patas: " + this.numberOfLegs + ".";
    }
}
