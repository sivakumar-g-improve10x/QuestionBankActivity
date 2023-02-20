package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IMethodsActivity {
    TextView trueFalseTextViewTxt;
    Button radioOneBtn;
    Button radioTwoBtn;
    RadioGroup radioGroupRg;
    Button verifyBtn;
    String Question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false_question);
        handleInitView();
        getQuestionsData();
        displayQuestions();
        handleSubmitBtn();
    }

    private void handleInitView() {
        trueFalseTextViewTxt = findViewById(R.id.true_false_text_view_txt);
        radioOneBtn = findViewById(R.id.radio_one_btn);
        radioTwoBtn = findViewById(R.id.radio_two_btn);
        radioGroupRg = findViewById(R.id.radio_group_rg);
        verifyBtn = findViewById(R.id.verify_btn);
    }
    @Override
    public void handleSubmitBtn() {
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    public void getQuestionsData() {
        Intent intent = getIntent();
        Question = intent.getStringExtra("Question");
        answer = intent.getStringExtra("answer");
    }

    public void displayQuestions() {

        trueFalseTextViewTxt.setText(Question);
    }

    public String getSelectedOptions() {
        int selectedId = radioGroupRg.getCheckedRadioButtonId();
        RadioButton selectedOptionRb = findViewById(selectedId);
        String text = selectedOptionRb.getText().toString();
        return text;

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
}
