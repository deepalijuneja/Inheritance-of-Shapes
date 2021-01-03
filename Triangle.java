import java.awt.*;

/**
 * The triangle shape class for shape inheritance hw. 
 * 
 * @author Deepali Juneja
 * @version 29 April 2020
 */
public class Triangle extends Shape {
    private int triangleSideL; 

    /**
     * This is the empty constructor of the class
     */
    public Triangle() {
        super();
        this.setSideLength(0);
    }

    /**
     * First, setter constructor.
     * @param x
     * @param y
     */
    public Triangle(int x, int y) {
        super(x, y);
        this.setSideLength(0);
    }

    /**
     * Full constructor but no color.
     */
    public Triangle(int x, int y, int sdLen) {
        super(x, y);
        this.setSideLength(sdLen);
    }

    /**
     * Fill constructor will all parameters.
     * @param x
     * @param y
     * @param sdLen
     * @param color
     */
    public Triangle(int x, int y, int sdLen, Color color) {
        super(x, y, color);
        this.setSideLength(sdLen);
    }

    /**
     * Getter for length of the side.
     * @return
     */
    public int getSideLength() {
        int valueSL = this.triangleSideL;
        return valueSL;
    }

    /**
     * Setter for length of the side.
     * @param sdLen
     */
    public void setSideLength(int sdLen) {
        if (sdLen >= 0) {
            this.triangleSideL= sdLen;
        } else {
            throw new IllegalArgumentException("Keep sidelength more than 0.");
        }
    }

    @Override
    /**
     * Finally, draw method for triangle.
     * Source for reference: https://stackoverflow.com/questions/29447994/how-do-i-draw-a-triangle-in-java
     */
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(super.color);

        int[] valueXvals = { getX(), (getX() + getSideLength() / 2), (getX() + getSideLength() / 2) };
        int[] valueYvals = { getY(), (getY() - getSideLength() / 2), getY() + getSideLength() / 2 };

        g2d.drawPolygon(valueXvals, valueYvals, 3);

    }

    /**
     *Getter for triangle area.
     */
    @Override
    public double getArea(){
        double area = ((double)getX() *(double)getSideLength()/2);
        return area;
    }
}