package app.commands.receiverClass;

import app.turtle.*;
import java.util.Scanner;
public class Square
{
private Turtle KTurtle;
private Scanner sc;
   public Square(Turtle KTurtle, Scanner sc)
    {
      this.KTurtle = KTurtle;
      this.sc = sc;
    }
  
    public void draw()
   {
    // Square Shape..
     //System.out.print("Enter Step Size: ");
    // int stepSize = sc.nextInt();
     //this.KTurtle.setStepSize(stepSize);
	this.KTurtle.setStepSize(80);
    for(int i = 0; i < 4; i++)
    {
      KTurtle.forward();
      KTurtle.turnRight();
    }
  }
}