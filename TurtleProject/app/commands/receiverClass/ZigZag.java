package app.commands.receiverClass;

import app.turtle.*;
import java.util.Scanner;
public class ZigZag
{
  private Turtle KTurtle;
  private Scanner sc;
  public ZigZag(Turtle KTurtle, Scanner sc)
  {
    this.KTurtle = KTurtle;;
    this.sc = sc;
  }
    public void draw()
   {
      // ZigZag Figure..
      for(int i = 0; i < 2; i++)
          {
              KTurtle.forward();
              KTurtle.turnLeft(45);
            KTurtle.forward();
            KTurtle.turnRight(45);
          }

    }
  }
