package app;

import app.commands.*;  
import app.drawingcomponents.*;  
import app.turtle.*;  
import app.geometry.*;
import java.util.Scanner;
import javax.swing.*;

public class App
{
    private Turtle KTurtle;
    private Command[] commands;
    
    public App() {
    JFrame frame = new JFrame("Shahdil Canvas");
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas blankPage = new Canvas();
    frame.add(blankPage);
    frame.setVisible(true);

    KTurtle = new Turtle(50, 0); // stepSize, startingAngle
    KTurtle.setCanvas(blankPage);
    KTurtle.setPosition(new Point(50, 50));

    commands = new Command[]{ new SquareCommand(), new ZigZagCommand() };
}

    
    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available drawing commands: \n 1. Use Built-in Commands \n 2. Custom Shapes");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            
            for (int i = 0; i < commands.length; i++) {
                System.out.println((i + 1) + ". " + commands[i].getClass().getSimpleName());
            }
        
            System.out.print("Choose a command (1 or 2): ");
            // System.out.print("Or draw Custom Shapes using Command --> F+F+F+F or F-F-F-F : ");
            int defaultChoiceSet = sc.nextInt();
            sc.nextLine();
            if (defaultChoiceSet >= 1 && defaultChoiceSet <= commands.length) 
                commands[defaultChoiceSet - 1].defaultShapes(KTurtle);
            else 
                System.out.println("Invalid choice.");
            
        }// if
        else if (choice == 2)
        {
            System.out.print("\n Give your Custom one e.g. F+F+F+F or F-F-F-F \n"+
            " 'F' = forward, '+' = turn right and '-' = turn left\n :"
            );
            String customChoice = sc.nextLine();
            new CommandParser(customChoice, KTurtle).parse();
        }
        else
            System.out.println("Wrong Number..");
        
        sc.close();
        System.out.println("Program Finished..");
    }

        
}