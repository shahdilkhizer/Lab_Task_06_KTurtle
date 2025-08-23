package app.drawingcomponents;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import app.geometry.Point;  
import app.geometry.Line;  
import app.turtle.Turtle;  
import app.App;  

public class Canvas extends JPanel
{
    private List<Line> lines = new ArrayList<>();
    private Point turtlePosition;
    
    public void addLine(Point p1, Point p2)
    {
        lines.add(new Line(p1, p2));
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.translate(200,200);
        g.setColor(Color.BLACK);
        g.fillOval(this.turtlePosition.getX(), this.turtlePosition.getY(), 10, 10);
        for(Line line : lines)
        {
            Point startPoint = line.getStartPoint();
            Point endPoint = line.getEndPoint();
            g.drawLine(startPoint.getX(),startPoint.getY(), endPoint.getX(), endPoint.getY());
        }
    }
    public void TurtlePosition(Point p)
    {
        this.turtlePosition = p;
    }

   
}