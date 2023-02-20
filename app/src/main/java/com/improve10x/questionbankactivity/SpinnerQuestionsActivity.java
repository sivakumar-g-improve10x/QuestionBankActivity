package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerQuestionsActivity extends AppCompatActivity implements IMethodsActivity {
    TextView spinnerQuestionTxt;
    Spinner spinnerOptionSp;
    Button verifyBtn;
    ArrayAdapter adapter;
    String question;
    String answer;
    String[] option = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_questions);
        initView();
        getQuestionsData();
        displayQuestions();
        setupAdapter();
        connectAdapter();
        handleSubmitBtn();

    }

    private void setupAdapter() {
        adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, option);
    }

    private void connectAdapter() {
        spinnerOptionSp.setAdapter(adapter);
    }

    private void initView() {
        spinnerQuestionTxt = findViewById(R.id.spinner_question_txt);
        spinnerOptionSp = findViewById(R.id.spinner_option_sp);
        verifyBtn = findViewById(R.id.verify_btn);
    }

    @Override
    public void handleSubmitBtn() {
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    ;

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if (answer.equals(selectedAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOptions() {
String selectedItem = (String) spinnerOptionSp.getSelectedItem();

        return selectedItem;
    }

    @Override
    public void displayQuestions() {

        spinnerQuestionTxt.setText(question);
    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent() ;
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");
        option = intent.getStringArrayExtra("option");
    }
}