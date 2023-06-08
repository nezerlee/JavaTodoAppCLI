package org.example;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("TodoApp - Choose an action:");
            System.out.println("1. Add task");
            System.out.println("2. Edit task");
            System.out.println("3. Delete task");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Display tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            String title, description;
            int id;
            switch (choice) {
                case 1:
                    System.out.println("TodoApp - What's the ID:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("TodoApp - Write a title:");
                    title = scanner.nextLine();
                    System.out.println("Write a Description:");
                    description = scanner.nextLine();
                    todoList.addTask(new Task(id, title, description, false));
                    break;
                case 2:
                    System.out.println("Here's a list of the tasks you have:");
                    todoList.displayTasks();
                    System.out.println("Now choose one by the ID so that you can edit:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("What is the new title:");
                    title = scanner.nextLine();
                    System.out.println("And the new description:");
                    description = scanner.nextLine();
                    todoList.editTask(id, new Task(
                            id, title, description, false
                    ));
                    break;
                case 3:
                    System.out.println("Here's a list of the tasks you have:");
                    todoList.displayTasks();
                    System.out.println("Now choose one by the ID so that you can delete:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    todoList.deleteTask(id);
                    System.out.println("Task Deleted!");
                    break;
                case 4:
                    System.out.println("Here's a list of the tasks you have:");
                    todoList.displayTasks();
                    System.out.println("Now choose one by the ID so that you can mark it as completed:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    todoList.markTaskAsCompleted(id);
                    break;
                case 5:
                    System.out.println("Here's a list of the tasks you have:");
                    todoList.displayTasks();
                    break;
                case 6:
                    System.out.println("Exiting..");
                    exit = true;
                    break;
                default:
                    System.out.println("You have not chosen the right option, please try again");
            }
        }
        System.out.println(" Goodbye!");


    }
}
