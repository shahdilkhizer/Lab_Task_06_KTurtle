package app.geometry;

public class Line
{
    private Point start, end;
    
    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }
    
    public void setStartPoint(Point start)
    {
        this.start = start;
    }
    public void setEndPoint(Point end)
    {
       this.end = end;
    }
    
    public Point getStartPoint()
    {
        return this.start;
    }
    public Point getEndPoint()
    {
        return this.end;
    }
}