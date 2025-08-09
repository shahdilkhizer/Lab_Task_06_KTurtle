package app.drawingcomponents;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import app.geometry.*;  

public class Canvas extends JPanel
{
    private List<Line> lines = new ArrayList<>();
    
    public void addLine(Point p1, Point p2)
    {
        lines.add(new Line(p1, p2));
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Line line : lines)
        {
            Point startPoint = line.getStartPoint();
            Point endPoint = line.getEndPoint();
            g.drawLine(startPoint.getX(),startPoint.getY(), endPoint.getX(), endPoint.getY());
        }
    }
}