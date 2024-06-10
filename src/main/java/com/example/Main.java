package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudService crudService = new CrudService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Type a number to choose an operation: add(1), remove(2), update(3), read(4), exit(5)");
            String operation = scanner.nextLine();

            switch (operation.toLowerCase()) {
                case "1":
                    crudService.add();
                    break;
                case "2":
                    crudService.remove();
                    
                    break;
                case "3":
                    crudService.update();
                    break;
                case "4":
                    crudService.read();
                    break;
                case "5":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }

        scanner.close();
    }
}
