Turtle Graphics Drawing App
This is a Java Swing-based Turtle Graphics application that allows you to draw shapes on a canvas using either built-in commands (like Square and ZigZag) or custom commands (e.g., F+F+F-F).
It demonstrates object-oriented programming, command pattern, and 2D graphics rendering in Java.
📂 Project Structure
src/
├── Main.java
└── app/
    ├── App.java
    ├── commands/
    │   ├── Command.java
    │   ├── CommandParser.java
    │   ├── SquareCommand.java
    │   └── ZigZagCommand.java
    ├── drawingcomponents/
    │   ├── Canvas.java
    │   └── Pen.java
    ├── geometry/
    │   ├── Line.java
    │   └── Point.java
    └── turtle/
        └── Turtle.java
How It Works
Main Entry Point

Main.java runs the program by calling new App().run().

App Initialization

Creates a JFrame with a Canvas to draw lines.

Initializes a Turtle object that can move and turn on the canvas.

Loads available commands (Square, ZigZag).

User Choices

Option 1: Choose from built-in shapes.

Option 2: Enter a custom command string like:

r
Copy
Edit
F+F+F+F
F → Move forward

+ → Turn right 90°

- → Turn left 90°

Drawing

The Turtle moves based on commands, drawing lines on the canvas using Pen and Canvas.

📜 Example Usage
Compilation

bash
Copy
Edit
javac app/geometry/*.java app/drawingcomponents/*.java app/turtle/*.java app/commands/*.java Main.java
Run

bash
Copy
Edit
java Main
Sample Run

markdown
Copy
Edit
Available drawing commands:
 1. Use Built-in Commands
 2. Custom Shapes
Choose: 1
1. SquareCommand
2. ZigZagCommand
Choose a command (1 or 2): 1
Or:

r
Copy
Edit
Available drawing commands:
 1. Use Built-in Commands
 2. Custom Shapes
Choose: 2
Give your Custom one e.g. F+F+F+F or F-F-F-F
 'F' = forward, '+' = turn right and '-' = turn left
: F+F-F+F
🛠 Key Classes
Turtle: Extends Pen, moves and draws lines based on direction and step size.

Canvas: A JPanel that stores and renders drawn lines.

Command Interface: Defines a contract for shape commands.

CommandParser: Reads custom strings and controls the turtle.

SquareCommand / ZigZagCommand: Example built-in shapes.

💡 Features
✅ Custom shape commands (F, +, -)
✅ Built-in shape commands
✅ Modular design with Command pattern
✅ Real-time drawing in Swing Canvas
✅ Simple user interaction through console
