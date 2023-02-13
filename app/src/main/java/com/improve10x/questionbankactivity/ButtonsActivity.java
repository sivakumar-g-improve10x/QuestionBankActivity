package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button questionBtn;
    Button question2Btn;
    Button question3Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initView();
        question1();
        question2Btn();
        question3Btn();
    }

    private void question3Btn() {

    }

    private void question2Btn() {

    }

    private void question1() {
        questionBtn.setOnClickListener(view -> {
            String question1 = "How many planets are in the solar system";
            String optionA = "10";
            String optionB = "8";
            String optionC = "12";
            String optionD = "9";
         navigateToQuestionsAndAnswerActivity(question1,optionA,optionB,optionC,optionD );
        });
    }

    private void initView() {
        questionBtn = findViewById(R.id.question_btn);
        question2Btn = findViewById(R.id.Question_2_btn);
        question3Btn = findViewById(R.id.question_3_btn);
    }
    private void navigateToQuestionsAndAnswerActivity(String question, String optionA,String optionB,String optionC,String optionD) {
        Intent questionAndAnswerIntent = new Intent(this,QuestionAndAnswersActivity.class);
        questionAndAnswerIntent .putExtra("question",question);
        questionAndAnswerIntent.putExtra("option 1",optionA);
        questionAndAnswerIntent.putExtra("option 2",optionB);
        questionAndAnswerIntent.putExtra("option 3",optionC);
        questionAndAnswerIntent.putExtra("option 4",optionD);
        startActivity(questionAndAnswerIntent);
    }

}