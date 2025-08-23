package app.commands.concreteCommand;
import app.turtle.*;
import app.App;
import java.util.Scanner;
import app.commands.abstractCommand.ICommand;
import app.commands.receiverClass.Quit;

public class QuitCmd implements ICommand
{
  Quit quit;
  public int execute(Turtle KTurtle, Scanner sc)
    {
       quit = new Quit(KTurtle, sc);
       return this.quit.endProgram();
    }

  
  public String toString() {
      return "quit";
   }
 
} 