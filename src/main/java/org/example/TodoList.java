package org.example;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
    public void editTask(int taskId, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                break;
            }
        }
    }
    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }
    public void markTaskAsCompleted(int taskId) {
        for (Task task: tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                break;
            }
        }
    }
    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println("Task ID: " + task.getId());
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed?: " + (task.isCompleted() ? "Yes" : "No"));
        }
    }
}
