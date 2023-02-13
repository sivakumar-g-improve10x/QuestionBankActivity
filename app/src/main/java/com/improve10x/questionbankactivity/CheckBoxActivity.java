package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {
    TextView textOneTxt;
    CheckBox optionACb;
    CheckBox optionBCb;
    CheckBox optionCCb;
    CheckBox optionDCb;
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box2);
        initView();
    }

    private void initView() {
        textOneTxt = findViewById(R.id.text1_txt);
        optionACb = findViewById(R.id.optiona_cb);
        optionBCb = findViewById(R.id.optionb_cb);
        optionCCb = findViewById(R.id.optionc_cb);
        optionDCb = findViewById(R.id.optiond_cb);
        verifyBtn = findViewById(R.id.verify_btn);

    }
}