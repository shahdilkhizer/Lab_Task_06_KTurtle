package app;

import app.commands.abstractCommand.*;
import app.commands.concreteCommand.*;
import app.commands.receiverClass.*;
  
import app.drawingcomponents.*;  
import app.turtle.*;  
import app.geometry.*;
import java.util.Scanner;
import javax.swing.*;
//------------------------------------
public class App
{
    public Turtle KTurtle;
    private ICommand[] commands;
    private JFrame frame;
    private Scanner sc;
    private boolean done;
    private int current;
    Canvas blankPage;
    
    public App() // -- Constructor
    {
        commands = new ICommand[]
        { // Available Commands
            new SquareCommand(),
            new ZigZagCommand(),
            new CustomShapeCmd(),
            new QuitCmd()
        };
            frame         = new JFrame("My Canvas");
            blankPage     = new Canvas();
            KTurtle       = new Turtle(50, 0); // stepSize, startingAngle
            sc            = new Scanner(System.in);
                                       
            configFrame("Shahdil's Canvas", 400, 400);
        
    }

    
    public void run() 
    {
        
        String usermessage = constructMessage();
        
      try
          {
              while(!done)
                  {
                      System.out.print(usermessage);
                      int cnum = sc.nextInt();
                      if(!validateInput(cnum)) continue;
                      processCommand(cnum);
                  }
          }
        catch(Exception e)
          {
            System.out.println("Invalid Input");
          }
        
    }

 private String constructMessage() 
    {
     String result = "Enter Command\n\t";
        for (int i = 0; i < commands.length; i++) 
        {
            result += (i + 1) + ". " + commands[i].getClass().getSimpleName()+ " \n\t";
        }
     return result + "Type : ";
    }
    
     private void processCommand(int cnum) 
     {
            current = commands[cnum -1].execute(KTurtle, sc);
           if (current < 0) terminateProgram();
     }
    
    private boolean validateInput(int cnum)
    {
        boolean bool = cnum > 0 && cnum <= commands.length;
        if(!bool)
            System.out.println("Invalid Input");
            frame.setVisible(bool); // Hide the frame if input is invalid
        
        return bool;       
    }

    private void terminateProgram()
    {
        done = true;
        System.exit(0);
    }

    public Turtle getTurtle()
    { 
        return KTurtle;
    }
    public void configFrame(String title, int height ,int width)
    {
        frame.setTitle(title);
        frame.setSize(height, width);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(blankPage);
        frame.setVisible(false);
        KTurtle.setCanvas(blankPage); // This will set the canvas for the Pen class b/c 
        //this method is not in turtle but for now we override it in turtle class
        KTurtle.setPosition(new Point(0, 0));
        blankPage.TurtlePosition(KTurtle.getCurrentPosition());
    }
}// class