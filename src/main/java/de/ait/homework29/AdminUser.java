package de.ait.homework29;

import java.util.HashSet;

public class AdminUser extends User {
    private HashSet<Integer>bannedUsers;

    public AdminUser(int id, String name, String email) {
        super(id, name, email);
        this.bannedUsers = new HashSet<>();
    }
    public void banUser(User user){
        bannedUsers.add(user.id);
        System.out.println("User " + user.name + " has been banned.");
    }
    public boolean isUserBanned(User user) {
        return bannedUsers.contains(user.id);
    }
    @Override
    public void printInfo(){
        System.out.println("Admin privileges granted.");
    }
    @Override
    public void checkPermissions() {
        System.out.println(name + " has admin permissions.");
    }
}
