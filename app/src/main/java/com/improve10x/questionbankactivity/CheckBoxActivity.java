package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements IMethodsActivity {
    TextView textCbTxt;
    CheckBox optionACb;
    CheckBox optionBCb;
    CheckBox optionCCb;
    CheckBox optionDCb;
    Button verifyBtn;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box2);
        initView();
        getQuestionsData();
        displayQuestions();
        handleSubmitBtn();

    }
    private void initView() {
        textCbTxt = findViewById(R.id.text_cb_txt);
        optionACb = findViewById(R.id.optiona_cb);
        optionBCb = findViewById(R.id.optionb_cb);
        optionCCb = findViewById(R.id.optionc_cb);
        optionDCb = findViewById(R.id.optiond_cb);
        verifyBtn = findViewById(R.id.verify_btn);

    }

    @Override
    public void handleSubmitBtn() {
      verifyBtn.setOnClickListener(v -> {
          verifyAnswer();
      });
    }

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOptions(){
      String result = "";
      if (optionACb.isChecked()){
          result = result + "a";
      }
      if (optionBCb.isChecked()){
          result = result + "b";
      }
      if (optionCCb.isChecked()){
          result = result + "c";
      }if (optionDCb.isChecked()){
          result = result + "d";
        }
      return result;
    }

    @Override
    public void displayQuestions() {
        textCbTxt.setText(question);
        optionACb.setText(optionA);
        optionBCb.setText(optionB);
        optionCCb.setText(optionC);
        optionDCb.setText(optionD);
    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        optionA = intent.getStringExtra("optionA");
        optionB = intent.getStringExtra("optionB");
        optionC = intent.getStringExtra("optionC");
        optionD = intent.getStringExtra("optionD");
        answer = intent.getStringExtra("answer");

    }
}