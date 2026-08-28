package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userId;
    private String username;
    private String password;

    private List<Note> notes = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);
        note.setUser(this);
    }

    public void getSummary() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
    }

    public void login() {
        System.out.println(username + " login สำเร็จ");
    }
}