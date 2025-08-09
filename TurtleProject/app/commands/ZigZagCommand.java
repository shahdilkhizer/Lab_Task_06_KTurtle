package app.commands;

import app.turtle.*;

public class ZigZagCommand implements Command
{
    public void defaultShapes(Turtle Kturtle)
    {
        // ZigZag Figure..
        Kturtle.forward();
        Kturtle.turnLeft();
        Kturtle.forward();
        Kturtle.turnLeft();
        Kturtle.forward();
        Kturtle.turnLeft();
        Kturtle.forward();
    }
}