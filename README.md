# Todo-App
The Todo App is a basic console-based application written in Java that allows users to manage a list of tasks. The app enables users to perform common todo list operations such as adding tasks, marking tasks as completed, removing tasks, and listing all tasks.
Task Class:

1. The Task class represents an individual task and has the following attributes:
description: A string describing the task.
completed: A boolean indicating whether the task is completed or not.
The class provides methods to get the task description, check if the task is completed, mark the task as completed, and override the toString method for user-friendly task representation.

2. TodoList Class:

The TodoList class manages a list of tasks and has the following functionalities:
tasks: A list of Task objects.
addTask(String description): Adds a new task to the list.
markTaskAsCompleted(int index): Marks a task as completed by its index in the list.
removeTask(int index): Removes a task from the list by its index.
getTasks(): Retrieves the list of tasks.

3. TodoApp Class (Main):

The TodoApp class serves as the main class for the application and includes the main logic for user interaction.
It contains a TodoList instance to manage tasks and a Scanner object for user input.
The main loop of the application presents a menu to the user with the following options:
-Add Task
-Mark Task as Completed
-Remove Task
-List Tasks
-Exit
The user can choose an option by entering the corresponding number.
Methods in the TodoApp class handle each menu option:
- addTask(): Prompts the user for a task description and adds the task to the list.
- markTaskAsCompleted(): Displays the current tasks, asks the user to choose a task to mark as completed, and updates the task status.
- removeTask(): Displays the current tasks, asks the user to choose a task to remove, and removes the task from the list.
- listTasks(): Displays the current list of tasks.
- The application continues running until the user chooses the "Exit" option.

How to Use the Todo App:

Run the TodoApp class.
Follow the menu options to interact with the todo list: add tasks, mark tasks as completed, remove tasks, list tasks, or exit the application.
