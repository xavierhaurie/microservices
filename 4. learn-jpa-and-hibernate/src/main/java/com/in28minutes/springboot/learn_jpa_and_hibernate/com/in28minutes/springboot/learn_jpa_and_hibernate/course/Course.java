package com.in28minutes.springboot.learn_jpa_and_hibernate.com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity(name="Course") -- no need to specify name since the SQL table has the same name
@Entity
public class Course {

    @Id
    private long id;

//    @Column(name="name") -- no need to specify name since the column in the SQL table has the same name
    @Column
    private String name;

//    @Column(name="author") -- no need to specify name since the column in the SQL table has the same name
    @Column
    private String author;

    public Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
