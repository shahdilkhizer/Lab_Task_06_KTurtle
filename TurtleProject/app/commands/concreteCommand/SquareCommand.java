package app.commands.concreteCommand;

import app.turtle.*;
import java.util.Scanner;
import app.commands.abstractCommand.ICommand;
import app.commands.receiverClass.Square;

public class SquareCommand implements ICommand
{
    Square square;
    public int execute(Turtle KTurtle, Scanner sc)
    {
        square = new Square(KTurtle, sc);
        square.draw();

        return 0;
        
    }

    public String toString() {
          return "Square";
       }
}