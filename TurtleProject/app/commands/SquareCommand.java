package app.commands;

import app.turtle.*;

public class SquareCommand implements Command
{
    public void defaultShapes(Turtle Kturtle)
    {
        // Square Shape..
        Kturtle.forward();
        Kturtle.turnRight();
        Kturtle.forward();
        Kturtle.turnRight();
        Kturtle.forward();
        Kturtle.turnRight();
        Kturtle.forward();
        
    }
}