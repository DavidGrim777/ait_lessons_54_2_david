package de.ait.lesson30.Homework1.Homework30;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();


        post.like();
        post.like();
        post.like();


        post.addComment("Great post!");
        post.addComment("Thanks for the information!");


        System.out.println("Number of likes: " + post.getLikesCount());
        System.out.println("Comments: " + post.getComments());
    }
}

