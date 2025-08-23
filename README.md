🐢 Turtle Drawing App – Command Pattern

This project is a Java implementation of the Turtle Graphics idea using the Command Pattern.
It allows the user to draw shapes (like squares, zigzags, custom shapes) on a canvas by executing commands.
```
📂 Project Structure
app/
│
├── geometry/               # Classes for geometry (e.g., Point, Line, Shape)
│
├── drawingcomponents/      # Canvas, drawing panel, and rendering logic
│
├── turtle/                 # Turtle class (movement, position, angle, pen up/down)
│
├── commands/
│   ├── abstractCommand/    # ICommand interface + abstract base classes
│   ├── receiverClass/      # Classes that receive and execute drawing logic
│   └── concreteCommand/    # Actual command implementations (SquareCommand, ZigZagCommand, etc.)
│
├── App.java                # Main application logic, initializes commands
└── Main.java               # Entry point to run the program
```
```
⚡ Command Pattern Implementation

ICommand (Interface)

Declares the execute() method.

All commands must implement this.

Concrete Commands (in concreteCommand/)

SquareCommand, ZigZagCommand, CustomShapeCmd, QuitCmd

Each command defines what action to perform.

Receiver (in receiverClass/)

Contains the actual logic for drawing on the canvas.

Example: moving the turtle, drawing lines, clearing canvas.

Invoker (App.java)

Stores and calls commands.

Example:

```
```
.

🖌️ How Drawing Works

The user selects a command (e.g., Square).

The Invoker (App) calls the command’s execute() method.

The Concrete Command delegates work to the Receiver.

The Receiver updates the Turtle state and draws on the Canvas.
```
```
.

🎯 Benefits of Command Pattern Here

Separation of Concerns

You separated logic into different packages (geometry, drawingcomponents, turtle, commands).

This makes each package responsible for its own task, so the code is cleaner and easier to understand.

Command Pattern Advantage

Each action (SquareCommand, ZigZagCommand, CustomShapeCmd, QuitCmd) is wrapped as an independent command class.

This allows new commands to be added in the future without modifying existing code (Open/Closed Principle).

Reusability

Since each command implements the same interface (ICommand), you can reuse these commands in different contexts (menu system, toolbar, scripts).

Extensibility

If you want to add a new shape or drawing style, you just create a new command class.

No need to touch the existing command execution logic in App.java.

Maintainability

Clear package organization means if there’s a bug in drawing logic, you know it’s inside drawingcomponents or geometry.

If the problem is with execution flow, you only check commands or App.java.

Undo/Redo Support (Future Ready)

Because of the Command Pattern, you can easily add undo/redo features by storing executed commands in a history list.

Scalability

The structure is ready to scale: more shapes, more drawing styles, even advanced features (like saving/loading drawings).
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
