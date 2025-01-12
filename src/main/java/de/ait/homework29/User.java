package de.ait.homework29;

public class User {
    protected int id;
    protected String name;
    protected String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public void printInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    public void checkPermissions(){
        System.out.println(name + " has basic user permissions.");
    }
}

