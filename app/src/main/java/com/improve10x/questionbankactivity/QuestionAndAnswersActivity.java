package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionAndAnswersActivity extends AppCompatActivity  implements IMethodsActivity {
    TextView text1Txt;
    RadioButton radio1Btn;
    RadioButton radio2Btn;
    RadioButton radio3Btn;
    RadioButton radio4Btn;
    RadioGroup radioRg;
    Button submitBtn;
    String question1;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_and_answers);
        handleInitView();
        getQuestionsData();
        displayQuestions();
        handleSubmitBtn();


    }

    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if (answer.equals(selectedAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    public String getSelectedOptions() {
        int selectedOption = radioRg.getCheckedRadioButtonId();
        String result = "";
        if (selectedOption == R.id.radio1_rb) {
            result = "a";
        } else if (selectedOption == R.id.radio2_rb) {
            result = "b";
        } else if (selectedOption == R.id.radio3_rb) {
            result = "c";
        } else if (selectedOption == R.id.radio4_rb) {
            result = "d";
        }
        return result;
    }

    public void displayQuestions() {
        text1Txt.setText(question1);
        radio1Btn.setText(optionA);
        radio2Btn.setText(optionB);
        radio3Btn.setText(optionC);
        radio4Btn.setText(optionD);

    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent();
        question1 = intent.getStringExtra("question");
        optionA = intent.getStringExtra("option 1");
        optionB = intent.getStringExtra("option 2");
        optionC = intent.getStringExtra("option 3");
        optionD = intent.getStringExtra("option 4");
        answer = intent.getStringExtra("answer");

    }

    private void handleInitView() {
        text1Txt = findViewById(R.id.text1_txt);
        radio1Btn = findViewById(R.id.radio1_rb);
        radio2Btn = findViewById(R.id.radio2_rb);
        radio3Btn = findViewById(R.id.radio3_rb);
        radio4Btn = findViewById(R.id.radio4_rb);
        submitBtn = findViewById(R.id.submit_btn);
        radioRg = findViewById(R.id.radio_rg);

    }

}

