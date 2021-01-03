import java.awt.*;

/**
 * The cyclinder shape class for shape inheritance hw. Recycled from lab.
 * 
 * @author Deepali Juneja
 * @version 28 April 2020
 */
public class Cylinder extends Shape {

    private int radius;
    private int height;

    /**
     * Below is an empty constructor
     */
    public Cylinder() {
        super();
        this.setRadius(0);
        this.setHeight(0);
    }

    /**
     * Helps set x and y for cylinder.
     * @param x 
     * @param y 
     */
    public Cylinder(int x, int y) {
        super(x, y);
        this.setRadius(0);
        this.setHeight(0);
    }

    /**
     * Below is the full constructor but no color is present.
     * @param x
     * @param y
     * @param radius
     * @param height
     */
    public Cylinder(int x, int y, int radius, int height) {
        super(x, y);
        this.setRadius(radius);
        this.setHeight(height);
    }

    /**
     * Below is the full constructor when color is present.
     * @param x
     * @param y
     * @param radius
     * @param height
     * @param color
     */
    public Cylinder(int x, int y, int radius, int height, Color color) {
        super(x, y, color);
        this.setRadius(radius);
        this.setHeight(height);
    }

    /**
     * Setter for height.
     * @param height 
     */
    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height needs to be greater than 0.");
        }
    }

    /**
     * Setter for radius
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius needs to be greater than 0");
        }
    }

    /**
     * Getter for radius
     * @return
     */
    public int getRadius() {
        int valueRad = this.radius;
        return valueRad;
    }

    /**
     * Getter for height
     * @return
     */
    public int getHeight() {
        int valueHeight = this.height;
        return valueHeight;
    }

    /**
     * Getter for area.
     */
    @Override
    public double getArea() {
        double area = 2 * Math.PI * (double) getRadius() * (double) getHeight();
        area += 2 * Math.PI * Math.pow((double) getRadius(), 2);
        return area;
    }

    /**
     * Final method to draw the cylinder. 
     */
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(super.color);

        g2d.drawOval(getX(), getY(), this.getRadius() * 2, this.getHeight()/ 10);// needed help from geeksforgeeks

        g2d.drawLine(getX(), getY() + (this.getHeight()/20), getX(), (getY() + this.getHeight()));
        g2d.drawLine(getX() + (this.getRadius() * 2), getY() + (this.getHeight() / 20), getX() + this.getRadius() * 2, getY() + this.getHeight());
        
        g2d.drawOval(getX(), getY() + this.getHeight() - (this.getHeight() / 20), this.getRadius() * 2,this.getHeight() / 10);
    }
}