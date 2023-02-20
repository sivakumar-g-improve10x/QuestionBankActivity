package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TextQuestionActivity extends AppCompatActivity implements IMethodsActivity{
    TextView javaQsnTxt;
    TextView answerTxt;
    Button blankVerifyBtn;
    String question;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
        initViews();
        getQuestionsData();
        displayQuestions();
        handleSubmitBtn();
    }

    private void initViews() {
        javaQsnTxt = findViewById(R.id.java_qsn_txt);
        answerTxt = findViewById(R.id.answer_txt);
        blankVerifyBtn = findViewById(R.id.blank_verify_btn);
    }

    @Override
    public void handleSubmitBtn() {
        blankVerifyBtn.setOnClickListener(v -> {
            verifyAnswer();

        });

    }

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(selectedAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Answer ):", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOptions() {
  String enterAnswer = answerTxt.getText().toString();
        return enterAnswer;
    }

    @Override
    public void displayQuestions() {
        javaQsnTxt.setText(question);
    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        answer = intent.getStringExtra("answer");
    }
}