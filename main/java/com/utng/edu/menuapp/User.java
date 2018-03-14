package com.utng.edu.menuapp;

/**
 * Created by alo_m on 12/03/2018.
 */

public class User {
    private String uid,name,comment;

    public User() {
    }

    public User(String uid, String name, String comment) {
        this.uid = uid;   // Primary key and key
        this.name = name;
        this.comment = comment;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
