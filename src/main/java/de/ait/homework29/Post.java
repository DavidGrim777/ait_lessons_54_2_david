package de.ait.homework29;

public class Post extends User{
    private User author;
    private String content;
    private int likes;

    public Post(User author, String content) {
        super(author, content);
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    public void like(){
        likes++;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }
}

