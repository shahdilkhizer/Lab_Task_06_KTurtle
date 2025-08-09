package app.turtle;
import app.geometry.*;
import app.drawingcomponents.*;
public class Turtle extends Pen {
    private Point position;
    private double currentAngle;
    private int stepSize;

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
    }

    public void turnRight() {
        currentAngle = (currentAngle + 90) % 360;
    }

    public void turnLeft() {
        currentAngle = (currentAngle - 90 + 360) % 360;
    }
}
