package de.ait.lesson30.Homework1.Homework30;

import java.util.ArrayList;
import java.util.List;

public class Post implements Likable, Commentable {
    private int likesCount;
    private List<String> comments;

    public Post(int likesCount, List<String> comments) {
        this.likesCount = 0;
        this.comments = new ArrayList<>();
    }

    public Post() {

    }


    @Override
    public void addComment(String comment) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(comment);

    }

    @Override
    public List<String> getComments() {
        return this.comments;
    }

    @Override
    public void like() {
        this.likesCount = this.likesCount + 1;

    }

    @Override
    public int getLikesCount() {

        return this.likesCount;
    }
}

