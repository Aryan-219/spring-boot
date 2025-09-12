package com.mappings.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {
    //    Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "comment")
    private String comment;

    //    Constructors
    public Review() {
    }

    public Review(String comment) {
        this.comment = comment;
    }

    //    Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //    toString() method
    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", comment='" + comment + '\'' + '}';
    }
}
