package com.example;

import com.example.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudService {

    private ArrayList<Task> list;
    Scanner scanner;

    // public void add(){};
    // public void remove(){};

    public CrudService() {
        this.list = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void add() {
        Task task = new Task();

        // ASK USSER FOR THE DESCRIPTION
        System.out.println("Enter the description of the new task: ");
        String taskDescription = this.scanner.nextLine();

        // feature add task
        task.setTitle(taskDescription);
        this.list.add(task);
        System.out.println("Task added successfully");

    }

    // feature Delete task
    public void remove() {
        System.out.println("Choose which task would you like to delete: ");
        // int userChoice = taskToModify();
        this.list.remove(taskToModify());
        System.out.println("Task removed successfully");

    }

    // feature update
    public void update() {
        System.out.println("Choose which task would you like to change: ");
        // int userChoice = taskToModify();
        Task objectToModify = this.list.get(taskToModify());
        objectToModify.setIsCompleted(true);
        System.out.println("Task modified successfully");

    }

    // feature leer
    public ArrayList<Task> read() {
        int i = 0;
        for (Task t : this.list) {
            boolean crossedTask = t.getIsCompleted();
            String crossed = "";
            if (crossedTask == true) {
                crossed = ".[X]";
            } else {
                crossed = ".[ ]";
            }
            i++;
            System.out.println(i + crossed + t.getTitle());
        }
        return this.list;

    }

    public int taskToModify() {

        System.out.println("Insert the number of the task you want to change: ");
        int userChoice = this.scanner.nextInt();
        int taskToChange = userChoice - 1;
        return taskToChange;
    }
}
