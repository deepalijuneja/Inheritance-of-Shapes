import java.awt.*;

/**
 * The circle class for shape inheritance homework (from lab)
 * @author Deepali Juneja
 * @version 28 April 2020
 */
public class Circle extends Shape {
    private int radius;

    /**
     * Below is the empty constructor.
     */
    public Circle() {
        super();
    }

    /**
     * Below constructor does not account for color.
     */
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.setRadius(radius);
    }

    /**
     * Below is the full constructor for the class
     * @param x  The width
     * @param y  The height
     * @param radius
     * @param color
     */
    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.setRadius(radius);
    }

    /**
     * Getter for area.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /**
     * Getter for radius
     * @return
     */
    public int getRadius() {
        int valueR = this.radius;
        return valueR;
    }

    /**
     * Setter for radius
     * @param circleRad
     */
    public void setRadius(int circleRad) {
        if (circleRad >= 0) {
            this.radius = circleRad;
        } else {
            throw new ArithmeticException("Radius cannot be less than 0");
        }
    }

    /**
     * Final method to draw the circle.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(super.color);
        g.drawOval(getX(), getY(), this.getRadius(), this.getRadius());
    }
}