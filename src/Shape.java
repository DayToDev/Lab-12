import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Drawable
{
    //ArrayList that will store locations of a shape's point(s).
    protected Point[] location;
    
    //Color a shape is assigned.
    private Color color;
    
    //Boolean that tells whether a shape is filled or not.
    private Boolean filled;
    
    //Constructor that all shapes will inherit from.
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    //Getter for a shape's color.
    public Color getColor()
    {
        return this.color;
    }
    
    //Checks if a shape is filled or not.
    public boolean isFilled()
    {
        return this.filled;
    }
    
    //Gets point(s) in the location array, returns as an ArrayList of Points.
    public Point[] getLocation()
    {
        return this.location;
    }
    
    //Draw method that each class will have
    public abstract void draw(Graphics g);
    
}
