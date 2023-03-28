package com.codeup.codeupspring.blog.models;
import jakarta.persistence.*;
import org.springframework.stereotype.Controller;

import java.io.Serializable;

@Entity
@Table(name= "Dogs")
public class Dog implements Serializable {

    public Dog(){}
    public Dog(int id, long age, String name, String resideState) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    private int id;
    @Column(nullable = false, columnDefinition = "TINYINT(3) UNSIGNED")
    private long age;


    @Column(nullable = false)
    private String name;
    @Column(nullable = false, columnDefinition = "VARCHAR(2)")
    private String resideState;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }

}
