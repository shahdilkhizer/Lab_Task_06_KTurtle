package app.geometry;
public class Point
{
    private int x, y;
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }   
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }   
    
    public Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
    }
    
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(int x)
    {
        this.x = x;
        // this.y = y;
    }
    public void setY(int y)
    {
        // this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
       return this.x; 
    }
    
    public int getY()
    {
       return this.y; 
    }
    
    public Point add(Point p)
    {
        return new Point(this.x + p.x, this.y + p.y);
    }
    
    
}