import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
//Grass is legal in Colorado

public class Grass
{
    private int diameter;
    private int width;
    private int length;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private Random randomx;
    private Random randomy;
    
    /**
     * Create Grass
     */
    public Grass()
    {
        randomx= new Random();
        randomy= new Random();
        length = 8;
        width = 3;
        diameter = 3;
        xPosition = randomx.nextInt(50);
        yPosition = randomy.nextInt(50);
        color = "green";
        //nextInt(int n)
    }

    /**
     * Make this Grass visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }



    /**
     * Draw the Grass with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          width, length));
            canvas.wait(60);
        }
    }

    /**
     * Erase the Grass on screen.
     */
    /*private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }*/
}
