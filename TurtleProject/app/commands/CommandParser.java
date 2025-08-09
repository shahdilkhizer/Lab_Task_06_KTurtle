package app.commands;
 
import app.turtle.*;

public class CommandParser
{
    private String input;
    private Turtle KTurtle;
    public CommandParser(String input, Turtle KTurtle)
    {
        this.input = input;
        this.KTurtle = KTurtle;
    }
    
    public void parse()
    {
        String[] inputsArray = this.input.split("");
        for(int i = 0; i < inputsArray.length; i++)
        {
            if(inputsArray[i].equals("F"))
                KTurtle.forward();
                
            else if(inputsArray[i].equals("+"))
                KTurtle.turnRight();
                
            else if(inputsArray[i].equals("-"))
                KTurtle.turnLeft();
                
            else 
            {
            System.out.println("Invalid input");
            break;
            }
        }
        
    }
    
}