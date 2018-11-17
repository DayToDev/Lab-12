
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle outerEar1 = new RightTriangle(new Point(475, 100), 90, 90, Color.PINK, true);
        RightTriangle innerEar1 = new RightTriangle(new Point(475, 100), 70, 70, Color.ORANGE, true);
        RightTriangle outerEar2 = new RightTriangle(new Point(275, 100), 90, 90, Color.PINK, true);
        RightTriangle innerEar2 = new RightTriangle(new Point(275, 100), 70, 70, Color.ORANGE, true);
        
        // Eyes:
        Oval leftCornea = new Oval(new Point(350, 225), 75, 75, Color.WHITE, true);
        Oval rightCornea = new Oval(new Point(450, 225), 75, 75, Color.WHITE, true);
        Oval leftIris = new Oval(new Point(350, 225), 50, 50, Color.BLACK, true);
        Oval rightIris = new Oval(new Point(450, 225), 50, 50, Color.BLACK, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400,250), 40, Color.BLACK, true);
        
        PolyLine lWhisker1 = new PolyLine(new Point(225,250), new Point(300, 300), 15, Color.BLACK, true);
        PolyLine lWhisker2 = new PolyLine(new Point(225,300), new Point(300, 350), 15, Color.BLACK, true);
        PolyLine lWhisker3 = new PolyLine(new Point(225,350), new Point(300, 400), 15, Color.BLACK, true);
        
        PolyLine rWhisker1 = new PolyLine(new Point(500,300), new Point(575, 250), 15, Color.BLACK, true);
        PolyLine rWhisker2 = new PolyLine(new Point(500,350), new Point(575, 300), 15, Color.BLACK, true);
        PolyLine rWhisker3 = new PolyLine(new Point(500,400), new Point(575, 350), 15, Color.BLACK, true);
        
        // Collar:
        Oval baseCollar = new Oval(new Point(400, 500), 400, 70, Color.BLACK, true);
        
        Circle bigButton = new Circle(new Point(400, 500), 90, Color.RED, true);
        Circle smaButton = new Circle(new Point(400,500), 75, Color.GREEN, false);
        
        // Square around the dog:
        Square border = new Square(new Point(400, 300), 500, Color.BLACK, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outerEar1);
        drawPanel.addShape(innerEar1);
        drawPanel.addShape(outerEar2);
        drawPanel.addShape(innerEar2);
        drawPanel.addShape(leftCornea);
        drawPanel.addShape(rightCornea);
        drawPanel.addShape(leftIris);
        drawPanel.addShape(rightIris);
        drawPanel.addShape(nose);
        drawPanel.addShape(lWhisker1);
        drawPanel.addShape(lWhisker2);
        drawPanel.addShape(lWhisker3);
        drawPanel.addShape(rWhisker1);
        drawPanel.addShape(rWhisker2);
        drawPanel.addShape(rWhisker3);
        drawPanel.addShape(baseCollar);
        drawPanel.addShape(bigButton);
        drawPanel.addShape(smaButton);
        drawPanel.addShape(border);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
