package app.commands.concreteCommand;

import app.turtle.*;
import java.util.Scanner;
import app.commands.abstractCommand.*;
import app.commands.receiverClass.*;

public class CustomShapeCmd implements ICommand
{
    public int execute(Turtle Kturtle, Scanner sc)
  {
      // Custom Shape..
      String details = "Enter your Custom Shape\n";
      details += "\n Give your Custom one e.g. F+F+F+F or F-F-F-F \n";
      details += " 'F' = forward, '+' = turn right and '-' = turn left\n :";
      
      System.out.print(details);
        sc.nextLine();
        String customChoice = sc.nextLine();
        new CustomShapes(customChoice, Kturtle).parse();
        return 0;
  }

  public String toString() {
      return "Draw Custom Shapes";
   }
}