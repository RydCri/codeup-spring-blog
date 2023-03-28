package com.codeup.codeupspring.blog.models;

import java.io.Serializable;

public class Post implements Serializable {
    private String title;
    private String body;
    private int id;

    public Post(){}
    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}

