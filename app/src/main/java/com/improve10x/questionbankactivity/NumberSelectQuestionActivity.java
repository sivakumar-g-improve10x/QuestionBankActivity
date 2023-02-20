package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IMethodsActivity{
 TextView textSeekBarTxt;
 SeekBar seekBarSb;
 Button seekBarVerifyBtn;
 String question;
 String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        handleInitView();
        getQuestionsData();
        displayQuestions();
        handleSubmitBtn();
    }

    private void handleInitView() {
        textSeekBarTxt = findViewById(R.id.text_seekbar_txt);
        seekBarSb = findViewById(R.id.seekbar_sb);
        seekBarVerifyBtn = findViewById(R.id.seekbar_verify_btn);

    }

    @Override
    public void handleSubmitBtn() {
        seekBarVerifyBtn.setOnClickListener(v -> {
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
        int progress = seekBarSb.getProgress();
        return progress + "" ;
    }

    @Override
    public void displayQuestions() {
        textSeekBarTxt.setText(question);
    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        answer = intent.getStringExtra("answer");
    }
}