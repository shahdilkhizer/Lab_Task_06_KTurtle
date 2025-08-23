.

🐢 Turtle Graphics – Command Pattern (Version 2)
📌 Project Overview

This project is an implementation of Turtle Graphics using the Command Pattern in Java.
The main idea is to separate commands from the turtle (receiver) so that each action (move, turn, draw) is encapsulated as a reusable command object.

This makes the system:

Flexible – Easy to add new commands without changing existing code.

Organized – Clear separation of responsibilities (Invoker, Receiver, Commands).

Extensible – Supports undo/redo, macros, and history tracking.

📂 Project Structure
app/
 ├── geometry/                # Geometric utilities (shapes, positions, vectors)
 ├── drawingcomponents/       # Drawing and rendering logic
 ├── turtle/                  # Turtle class (receiver) + movement logic
 ├── commands/
 │    ├── abstractCommand/    # Abstract base for commands
 │    ├── receiverClass/      # Receiver references (Turtle & Drawing classes)
 │    └── concreteCommand/    # Concrete commands (Move, Turn, PenUp, PenDown, etc.)
 ├── App.java                 # Entry point for running turtle operations
Main.java                     # Starts the application

⚡ Benefits of This Implementation

Readability & Maintainability
Code is structured with clear folders and responsibilities, making it easy for other developers to follow.

Extensibility
New commands can be added without modifying core logic. For example, adding a "DrawCircleCommand" only requires creating a new class.

Reusability
Commands are reusable objects that can be combined into sequences (macros) or stored for history/undo features.

Scalability
The system can grow by adding new drawing components or more complex commands without rewriting the whole project.

Real-World Relevance
The same pattern is used in text editors, graphics software, and even robotics for separating actions from receivers.

🚀 How to Run

Compile the project:

javac app/geometry/*.java app/drawingcomponents/*.java app/turtle/*.java app/commands/abstractCommand/*.java app/commands/receiverClass/*.java app/commands/concreteCommand/*.java app/App.java Main.java


Run the main program:

java Main

🌟 Key Learning

Encapsulating actions as Command objects increases flexibility.

Separating logic into Receiver (Turtle), Command, and Invoker makes the design professional.

This structure is reusable across multiple projects, not just Turtle Graphics.
