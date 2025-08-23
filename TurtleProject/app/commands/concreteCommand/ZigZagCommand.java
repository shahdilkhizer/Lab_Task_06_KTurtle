package app.commands.concreteCommand;

import app.turtle.*;
import java.util.Scanner;
import app.commands.abstractCommand.*;
import app.commands.receiverClass.*;

public class ZigZagCommand implements ICommand
{
    ZigZag zigzag;
    public int execute(Turtle KTurtle, Scanner sc)
    {
        zigzag = new ZigZag(KTurtle, sc);
        zigzag.draw();
        return 0;
    }

    public String toString() {
          return "ZigZag";
       }
}