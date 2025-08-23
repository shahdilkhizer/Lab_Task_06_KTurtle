package app.commands.receiverClass;
 
import app.turtle.*;

public class CustomShapes
{
    private String input;
    private Turtle KTurtle;
    public CustomShapes(String input, Turtle KTurtle)
    {
        this.input = input;
        this.KTurtle = KTurtle;
    }
    
    public void parse()
    {
        try{
                String[] inputsArray = this.input.split("");
                for(int i = 0; i < inputsArray.length; i++)
                {
                    if(inputsArray[i].toLowerCase().equals("f"))
                        KTurtle.forward();

                    else if(inputsArray[i].equals("m"))
                        KTurtle.move();

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
        catch(Exception e)
            {
                System.out.println("Invalid input : "+ e.getMessage());
            }
        
    }
    
}