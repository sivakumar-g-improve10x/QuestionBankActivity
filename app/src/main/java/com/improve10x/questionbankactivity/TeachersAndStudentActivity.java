package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TeachersAndStudentActivity extends AppCompatActivity {
    Button teacherBtn;
    Button studentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_and_student);
        initView();
        handleStudentBtn();
    }

    private void handleStudentBtn() {
        studentBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,ButtonsActivity.class);
            startActivity(intent);
        });
    }
    private void initView() {
        teacherBtn=findViewById(R.id.teacher_btn);
        studentBtn=findViewById(R.id.student_btn);
    }
}