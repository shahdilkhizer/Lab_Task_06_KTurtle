package app.commands.abstractCommand;
import app.turtle.*;
import java.util.Scanner;

public interface ICommand
{
    int execute(Turtle Kturtle, Scanner sc);
}