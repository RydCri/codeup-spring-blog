package com.codeup.codeupspring.blog.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Posts")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String body;

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


