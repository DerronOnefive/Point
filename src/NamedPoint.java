/**
 * Author Derron
 * ClassName NamedPoint
 * 2/15/2024
 * Version 1.0
 */
public class NamedPoint extends Point {
    private String name;

    public NamedPoint(double x, double y, String name) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": " + super.toString();
    }
}
