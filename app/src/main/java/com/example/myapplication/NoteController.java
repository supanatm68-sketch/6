package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class NoteController {

    private List<Note> notes = new ArrayList<>();

    public void addTextNote(
            User user,
            String title,
            String createdDate,
            String content) {

        TextNote note = new TextNote();

        note.setTitle(title);
        note.setCreatedDate(createdDate);
        note.setContent(content);

        user.addNote(note);
        notes.add(note);
    }

    public void addCheckListNote(
            User user,
            String title,
            String createdDate,
            String items) {

        CheckListNote note = new CheckListNote();

        note.setTitle(title);
        note.setCreatedDate(createdDate);
        note.setItems(items);

        user.addNote(note);
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void showNotes() {
        for (Note note : notes) {
            note.getSummary();
        }
    }
}