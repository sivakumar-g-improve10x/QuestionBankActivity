package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionAndAnswersActivity extends AppCompatActivity {
    TextView text1Txt;
    RadioButton radio1Btn;
    RadioButton radio2Btn;
    RadioButton radio3Btn;
    RadioButton radio4Btn;
    String question1;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_and_answers);
        handleInitView();
        getQuestionData();
        displayQuestions();

    }

    private void displayQuestions() {
        text1Txt.setText(question1);
        radio1Btn.setText(optionA);
        radio1Btn.setText(optionB);
        radio1Btn.setText(optionC);
        radio1Btn.setText(optionD);

    }
    private void handleInitView() {
        text1Txt = findViewById(R.id.text1_txt);
        radio1Btn = findViewById(R.id.radio1_rb);
        radio2Btn = findViewById(R.id.radio2_rb);
        radio3Btn = findViewById(R.id.radio3_rb);
        radio4Btn = findViewById(R.id.radio4_rb);
    }
    public  void getQuestionData(){
        Intent intent = getIntent();
        question1 = intent.getStringExtra("Question1");
        optionA = intent.getStringExtra("option 1");
        optionB = intent.getStringExtra("option 2");
        optionC = intent.getStringExtra("option 3");
        optionD = intent.getStringExtra("option 4");
    }
}