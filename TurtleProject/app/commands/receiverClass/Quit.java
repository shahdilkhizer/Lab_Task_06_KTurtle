package app.commands.receiverClass;
import app.turtle.*;
import app.App;
import java.util.Scanner;

public class Quit
{
  private Turtle KTurtle;
  private Scanner sc;
  public Quit(Turtle KTurtle, Scanner sc)
  {
    this.KTurtle = KTurtle;
    this.sc = sc;
  }
  public int endProgram()
  {
    System.out.println("Goodbye!");
    System.out.println("Program Finished..");
    sc.close();
    return -1;
  }
}