package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudService {

    private ArrayList<Task> list;
    Scanner scanner;

    public CrudService() {
        this.list = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void add() {
        Task task = new Task();
      
        System.out.println("Enter the description of the new task: ");
        String taskDescription = this.scanner.nextLine();

        
        task.setTitle(taskDescription);
        this.list.add(task);
        System.out.println("Task added successfully");

    }

    
    public void remove() {
        
        this.list.remove(taskToModify());
        System.out.println("Task removed successfully");

    }

    
    public void update() {
        
        Task objectToModify = this.list.get(taskToModify());
        objectToModify.setIsCompleted(true);
        System.out.println("Task modified successfully");

    }

    
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
