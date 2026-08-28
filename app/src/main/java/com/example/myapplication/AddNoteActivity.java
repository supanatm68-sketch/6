package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText editTitle;
    private EditText editContent;
    private Button buttonAdd;

    private NoteController noteController;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_note);

        editTitle = findViewById(R.id.editTitle);
        editContent = findViewById(R.id.editContent);
        buttonAdd = findViewById(R.id.buttonAdd);

        noteController = new NoteController();

        user = new User();
        user.setUserId("6812247030");
        user.setUsername("Supanat");
        user.setPassword("123456");

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String title = editTitle.getText().toString();
                String content = editContent.getText().toString();

                noteController.addTextNote(
                        user,
                        title,
                        "31/07/2026",
                        content
                );

                Toast.makeText(
                        AddNoteActivity.this,
                        "เพิ่ม Note สำเร็จ",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}