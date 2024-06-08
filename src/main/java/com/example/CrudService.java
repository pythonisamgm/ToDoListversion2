package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudService {

    private ArrayList<Object> list;
    Scanner scanner = new Scanner(System.in);

    // public void add(){};
    // public void remove(){};

    public void update() {
    };

    public CrudService(ArrayList<Object> list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void add(Scanner scanner) {
        Task task1 = new Task();

        // ASK USSER FOR THE DESCRIPTION
        System.out.println("Enter the description of the new task: ");
        String taskDescription = scanner.nextLine();

        // feature add task
        task1.setTitle(taskDescription);
        list.add(task1);
        System.out.println("Task added successfully");

        // feature Delete task
        task1.setTitle(taskDescription);
        list.remove(task1);
        System.out.println("Task added successfully");

        scanner.close();
    }

    // feature leer
    public ArrayList<Object> read() {
        for (Object t : list)
            
            return System.out.println("");

    };

    public void remove() {// feature Delete task
        System.out.println("Choose which task would you like to delete: ");
        list.remove(task1);
        System.out.println("Task removed successfully");
        scanner.close();
    }

}
