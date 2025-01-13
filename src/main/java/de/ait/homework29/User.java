package de.ait.homework29;

import java.util.ArrayList;

public class User {
    protected int id;
    protected String name;
    protected String email;
    protected ArrayList<User> friends;
    protected ArrayList<Post> posts;

    public User(int id, String name, String email, ArrayList<User> friends, ArrayList<Post> posts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.friends = friends;
        this.posts = posts;
    }

    public void printInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    public void checkPermissions() {
        System.out.println(name + " has basic user permissions.");
    }

    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            System.out.println(name + " added as friend " + user.name);
        } else {
            System.out.println(user.name + " already on the friends list.");
        }
    }

    public void removeFriend(User user) {
        if (friends.remove(user)) {
            System.out.println(name + " removed from friends " + user.name);
        } else {
            System.out.println(user.name + " not found in friends list.");
        }
    }

    public Post createPost(String content) {
        Post post = new Post(this, content);
        posts.add(post);
        System.out.println(name + " created a post: " + content);
        return post;
    }

    public void viewFriendsPosts() {
        System.out.println("Posts by user's friends " + name + ":");
        for (User friend : friends) {
            for (Post post : friend.posts) {
                System.out.println("- From " + friend.name + ": " + post.getContent() + " (Likes: " + post.getLikes() + ")");
            }
        }
    }}



