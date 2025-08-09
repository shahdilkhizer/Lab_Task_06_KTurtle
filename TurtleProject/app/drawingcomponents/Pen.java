package app.drawingcomponents;

import app.geometry.*;  
public class Pen
{
    private Point currentPosition;
    private Canvas canvas; // final --> Constructor
    
    public Pen()
    {
        currentPosition = new Point();
    }
    public void setCanvas(Canvas cvs)
    {
        this.canvas = cvs;
    }
    public void movePenFromCurrentPointTo(Point p)
    {
        this.currentPosition = new Point(p);
    }
    
    public void drawLineFromCurrentPointTo(Point p)
    {
        if (canvas != null){
            canvas.addLine(this.currentPosition, p);
            this.currentPosition = new Point(p);}
        else
            System.out.println("You didn't set the Cnavas");
    }
    
    public void setPosition(Point p)
    {
        this.currentPosition = new Point(p);
    }
    
    public Point getCurrentPosition()
    {
        return this.currentPosition;
    }
    
}