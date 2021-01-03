import java.awt.*;

/**
 * The rectangle class for shape inheritance hw.
 * 
 * @author Deepali Juneja
 * @version 29 May 2020
 */
public class Rectangle extends Shape {

    private int w;
    private int h;

    /**
     * Below is the empty constructor.
     */
    public Rectangle() {
        super();
        this.setHeight(0);
        this.setWidth(0);
    }

    /**
     * Below is the second constructor.
     * @param x
     * @param y
     */
    public Rectangle(int x, int y) {
        super(x, y);
        this.setHeight(0);
        this.setWidth(0);
    }

    /**
     * Below is the constructor for rectangle but no color.
     * @param x
     * @param y
     * @param height
     * @param width
     */
    public Rectangle(int x, int y, int h, int w) {
        super(x, y);
        this.setHeight(h);
        this.setWidth(w);
    }

    /**
     * This is the full constructor that initializes the x,y,height,width,and color
     * @param x
     * @param y
     * @param height
     * @param width
     * @param color
     */
    public Rectangle(int x, int y, int h, int w, Color color) {
        super(x, y, color);
        this.setHeight(h);
        this.setWidth(w);
    }

    /**
     * Getter for width
     */
    public int getWidth() {
        int valueWidth = this.w;
        return valueWidth;
    }

    /**
     * Setter for width
     * @param newWidth
     */
    public void setWidth(int newWidth) {
        if (newWidth >= 0) {
            this.w = newWidth;
        } else {
            throw new IllegalArgumentException("Keep width more than 0.");
        }
    }

    /**
     * Getter for height.
     * @return
     */
    public int getHeight() {
        int valueHeight = this.h;
        return valueHeight;
    }

    /**
     * Setter for height
     * @param newHeight
     */
    public void setHeight(int newHeight) {
        if (newHeight >= 0) {
            this.h = newHeight;
        } else {
            throw new IllegalArgumentException("Height cannot be lesser than 0");
        }
    }

    /**
     * Finally the draw method to draw the rectangle.
     */
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(super.color);
        g2d.drawRect(getX(), getY(), this.getWidth(), this.getHeight());
    }

    /**
     * Method for area of the rectangle.
     */
    @Override
    public double getArea() {
        double area = (double) this.getHeight() * (double) this.getWidth();
        return area;
    }

}