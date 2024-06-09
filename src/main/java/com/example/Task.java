package com.example;

public class Task extends CrudService {
    // attributes
    private String title;
    private boolean isCompleted;

    // constructor
    public Task() {
       super();
        this.isCompleted = false;
    }

    // methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}