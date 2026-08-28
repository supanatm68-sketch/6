package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        User user = new User();

        user.setUserId("6812247030");
        user.setUsername("Supanat");
        user.setPassword("123456");

        NoteController controller = new NoteController();

        controller.addTextNote(
                user,
                "การบ้าน Java",
                "31/07/2026",
                "เรียนรู้ MVC Pattern"
        );

        controller.addCheckListNote(
                user,
                "สิ่งที่ต้องทำ",
                "31/07/2026",
                "ทำการบ้าน, อ่านหนังสือ, ส่งงาน"
        );

        user.getSummary();

        controller.showNotes();
    }
}