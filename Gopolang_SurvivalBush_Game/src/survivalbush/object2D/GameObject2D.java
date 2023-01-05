package survivalbush.object2D;

import javafx.scene.shape.Rectangle;

/**
 * Class for placing entities
 * @author Gopolang Mmutlwane
 *
 */

public class GameObject2D extends Rectangle {

    private String name;

    // movement and placement properties
    private double velocity = 0;

    /**
     * CONSTRUCTOR
     * 
     * @param name
     * @param width
     * @param height
     * @param x
     * @param y
     */

    public GameObject2D(String name, double width, double height, double x, double y) {
        this.name = name;
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);
    }

    public String getName() {
        return name;
    }


    public double getVelocity() {
        return velocity;
    }

    /** SETTERS
     * @param name 
     **/

    public void setName(String name) {
        this.name = name;
    }
    
    /** SETTERS
     * @param v
     **/
    public void setVelocity(double v) {
        velocity = v;
    }
}
