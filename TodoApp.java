import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static TodoList todoList = new TodoList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskAsCompleted();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    listTasks();
                    break;
                case 5:
                    System.out.println("Exiting Todo App. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n----- Todo App Menu -----");
        System.out.println("1. Add Task");
        System.out.println("2. Mark Task as Completed");
        System.out.println("3. Remove Task");
        System.out.println("4. List Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        todoList.addTask(description);
        System.out.println("Task added successfully!");
    }

    private static void markTaskAsCompleted() {
        listTasks();
        System.out.print("Enter the index of the task to mark as completed: ");
        int index = scanner.nextInt();
        todoList.markTaskAsCompleted(index);
        System.out.println("Task marked as completed!");
    }

    private static void removeTask() {
        listTasks();
        System.out.print("Enter the index of the task to remove: ");
        int index = scanner.nextInt();
        todoList.removeTask(index);
        System.out.println("Task removed successfully!");
    }

    private static void listTasks() {
        System.out.println("\n----- Tasks -----");
        List<Task> tasks = todoList.getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }
}
