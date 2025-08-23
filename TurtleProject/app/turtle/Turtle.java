package app.turtle;
import app.geometry.*;
import app.drawingcomponents.*;
public class Turtle extends Pen {
    private Point position;
    private double currentAngle;
    private int stepSize;
    // private Canvas canvas; 

    public Turtle(int stepSize, double currentAngle) {
        this.position = new Point();
        this.stepSize = stepSize;
        this.currentAngle = currentAngle;
        setPosition(this.position);
    }

    public void forward() {
        double rad = Math.toRadians(currentAngle);
        int newX = (int) Math.round(position.getX() + stepSize * Math.cos(rad));
        int newY = (int) Math.round(position.getY() + stepSize * Math.sin(rad));
        
        Point newPoint = new Point(newX, newY);
        drawLineFromCurrentPointTo(newPoint);
        position = newPoint;
        setPositionInCanvas(position);
    }

    public void forward(float x, float y) {
        double rad = Math.toRadians(currentAngle);
        int newX = (int) Math.round(x + stepSize * Math.cos(rad));
        int newY = (int) Math.round(y + stepSize * Math.sin(rad));

        Point newPoint = new Point(newX, newY);
        drawLineFromCurrentPointTo(newPoint);
        position = newPoint;
        setPositionInCanvas(position);
    }

    public void move() {
        double rad = Math.toRadians(currentAngle);
        int newX = (int) Math.round(position.getX() + stepSize * Math.cos(rad));
        int newY = (int) Math.round(position.getY() + stepSize * Math.sin(rad));

        Point newPoint = new Point(newX, newY);
            movePenFromCurrentPointTo(newPoint);
        position = newPoint;
        setPositionInCanvas(position);
    }

    public void move(float x, float y) {
        double rad = Math.toRadians(currentAngle);
        int newX = (int) Math.round(x + stepSize * Math.cos(rad));
        int newY = (int) Math.round(y + stepSize * Math.sin(rad));

        Point newPoint = new Point(newX, newY);
            movePenFromCurrentPointTo(newPoint);
        position = newPoint;
        setPositionInCanvas(position);
    }
    
    public void turnRight() {
        currentAngle = (currentAngle + 90) % 360;
    }
    public void turnRight(float n) {
        currentAngle = (currentAngle + n) % 360;
    }

    public void turnLeft() {
        currentAngle = (currentAngle - 90 + 360) % 360;
    }
    public void turnLeft(float n )
    {
        if(n <= 360)
            currentAngle = (currentAngle - n + 360) % 360;
        else
            System.out.println("Angle must be less than 360");
    }
    private void setPositionInCanvas(Point p)
    {
        Canvas cvs = getCanvas();   // Pen ka canvas use karo
        if(cvs != null)
            cvs.TurtlePosition(new Point(p));
    }

    public void setStepSize(int stepSize)
    {
        this.stepSize = stepSize;
    }

    public Canvas getCanvas()
    {
        return super.getCanvas();
    }
    // private void setPositionInCanvas(Point p)
    // {
    //         canvas.TurtlePosition(new Point(p));
    // }
    // @Override
    // public void setCanvas(Canvas cvs)
    //     {
    //         this.canvas = cvs;
    //     }
    // We first need to set the canvas for pen class because turtle use pen methods so we use pen canvas in 
    // turtle class instead explicitly creating another canvas for turtle class 
    // If a method is not in child class and we use that methods then it works for parent like set or get canvas
    // for to use it in child class we need to override it in child class
}
