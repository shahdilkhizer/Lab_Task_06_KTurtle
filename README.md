Turtle Graphics Application
A simple Java console application that uses a "turtle" to draw shapes on a graphical canvas. You can either choose from built-in shapes or create your own custom designs by providing commands.

Features
Built-in Shapes: Draw pre-defined shapes like a square or a zig-zag pattern.

Custom Commands: Create your own drawings by using a sequence of commands:

F: Move the turtle forward.

+: Turn the turtle 90 degrees to the right.

-: Turn the turtle 90 degrees to the left.

Graphical Interface: The application uses a JFrame to display the canvas and the resulting drawings.

How to Run
Prerequisites
Java Development Kit (JDK) 8 or higher installed on your machine.

Compilation
Open your terminal or command prompt and navigate to the root directory of the project (where the Main.java file is located). Then, run the following command to compile all the Java files:

javac app/geometry/*.java app/drawingcomponents/*.java app/turtle/*.java app/commands/*.java Main.java

Execution
After compiling successfully, run the application using the following command:

java Main

Usage
When you run the application, you will be presented with a console menu:

Available drawing commands: 
 1. Use Built-in Commands 
 2. Custom Shapes

Option 1: Built-in Commands
Enter 1 and press Enter.

The console will show you the available built-in shapes, like SquareCommand and ZigZagCommand.

Enter the corresponding number for the shape you want to draw (e.g., 1 for a square or 2 for a zig-zag) and press Enter.

The shape will be drawn on the graphical canvas that appears.

Option 2: Custom Shapes
Enter 2 and press Enter.

You will be prompted to enter a sequence of commands.

Use F, +, and - to create your custom design. For example, to draw a square, you would type F+F+F+F.

Press Enter to draw your custom shape on the canvas.

Example:
To draw a square using custom commands:

Give your Custom one e.g. F+F+F+F or F-F-F-F 
 'F' = forward, '+' = turn right and '-' = turn left
 :F+F+F+F


## Installation

Install my-project with npm

```bash
npm install my-project
cd my-project
```

## Usage/Examples

```javascript
import Component from 'my-project'

function App() {
  return <Component />
}
```

## License

[MIT](https://choosealicense.com/licenses/mit/)
