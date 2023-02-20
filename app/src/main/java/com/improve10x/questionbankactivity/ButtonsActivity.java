package com.improve10x.questionbankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class ButtonsActivity extends AppCompatActivity {
    Button questionBtn;
    Button question2Btn;
    Button question3Btn;
    Button checkBox1Btn;
    Button checkBox2Btn;
    Button checkbox3Btn;
    Button trueOrFalseBtn;
    Button trueFalseTwoBtn;
    Button trueFalseTreeBtn;
    Button numberQuestion1Btn;
    Button numberQuestion2Btn;
    Button numberQuestion3Btn;
    Button textQ1Btn;
    Button textQ2Btn;
    Button textQ3Btn;
    Button spinnerQ1Btn;
    Button spinnerQ2Btn;
    Button spinnerQ3Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initView();
        question1();
        question2Btn();
        question3Btn();
        checkBox1Btn();
        checkBox2Btn();
        checkbox3Btn();
        trueOrFalseBtn();
        trueFalseTwoBtn();
        trueFalseTreeBtn();
        numberQuestion1Btn();
        numberQuestion2Btn();
        numberQuestion3Btn();
        textQ1Btn();
        textQ2Btn();
        textQ3Btn();
        spinnerQ1Btn();
        spinnerQ2Btn();
        spinnerQ3Btn();
    }

    private void spinnerQ3Btn() {
spinnerQ3Btn.setOnClickListener(v -> {
    String question = "Find the value of A[1] after execution of the following program.\n" +
            "\n" +
            "int[] A = {0,2,4,1,3};\n" +
            "for(int i = 0; i < a.length; i++){\n" +
            "    a[i] = a[(a[i] + 3) % a.length];\n" +
            "}";
    String[] option = {"0","1","2","3"};
    String answer = "1";
    navigateSpinnerQuestionActivity(question,answer,option);
});
    }

    private void spinnerQ2Btn() {
spinnerQ2Btn.setOnClickListener(v -> {
    String question = "public class Solution{\n" +
            "       public static void main(String[] args){\n" +
            "                     byte x = 127;\n" +
            "                     x++;\n" +
            "                     x++;\n" +
            "                     System.out.print(x);\n" +
            "       }\n" +
            "}";
    String[] option = {"-127", "127", "129", "2"};
    String answer = "-127";
    navigateSpinnerQuestionActivity(question,answer,option);
});
    }

    private void spinnerQ1Btn() {
        spinnerQ1Btn.setOnClickListener(v -> {
            String question = " Number of primitive data types in Java are?";
            String[] option = {"6","7","8","9"};
            String answer = "8";
            navigateSpinnerQuestionActivity(question,answer,option);
        });
    }

    private void textQ1Btn() {
        textQ1Btn.setOnClickListener(v -> {
            String question = "Java ______ can contain variables and methods";
            String answer = "class";
            String trimTxt = answer.trim();
            navigateTextQuestionActivity(question,trimTxt);;
        });
    }

    private void textQ2Btn() {
        textQ2Btn.setOnClickListener(v -> {
            String question = " Android is an ________";
            String answer = "Operating System";
            String trimTxt = answer.trim();
            navigateTextQuestionActivity(question,trimTxt);
        });
    }

    private void textQ3Btn() {
        textQ3Btn.setOnClickListener(v -> {
            String question = "_____________ component is used to supper vertical Scrolling";
            String answer = "ScrollView";
            String trimTxt = answer.trim();
            navigateTextQuestionActivity(question,trimTxt);
        });
    }

    private void numberQuestion3Btn() {
        numberQuestion3Btn.setOnClickListener(v -> {
            String question = "What is the size of double data type in bytes";
            String answer = "8";
            navigateNumberSelectQuestionActivity(question,answer);
        });
    }

    private void numberQuestion2Btn() {
        numberQuestion2Btn.setOnClickListener(v -> {
            String question = "What is the size of long data type in bytes";
            String answer = "8";
            navigateNumberSelectQuestionActivity(question,answer);
        });
    }

    private void numberQuestion1Btn() {
        numberQuestion1Btn.setOnClickListener(v -> {
            String question = "What is the size of int data type in byte";
            String answer = "4";
            navigateNumberSelectQuestionActivity(question,answer);
        });
    }

    private void trueFalseTreeBtn() {
        trueFalseTreeBtn.setOnClickListener(v -> {
            String question = "Android emulator takes very less space";
            String answer = "false";
            navigateTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void trueFalseTwoBtn() {
        trueFalseTwoBtn.setOnClickListener(v -> {
            String question = "Android Studio supports Java programming language";
            String answer = "true";
            navigateTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void trueOrFalseBtn() {
        trueOrFalseBtn.setOnClickListener(v -> {
            String question = "Java is a programming language?";
            String answer = "true";
            navigateTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void checkbox3Btn() {
        checkbox3Btn.setOnClickListener(v -> {
            String question = "Which of the following are planets";
            String optionA = "Mercury";
            String optionB = "sun";
            String optionC = "jupiter";
            String optionD = "saturn";
            String answer = "acd";
            navigateToCheckBoxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void checkBox2Btn() {
        checkBox2Btn.setOnClickListener(v -> {
            String question = "Select activity lifecycle methods in Android";
            String optionA = "onCreate";
            String optionB = "onStop";
            String optionC = "onResume";
            String optionD = "onPause";
            String answer = "bcd";
            navigateToCheckBoxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void checkBox1Btn() {
        checkBox1Btn.setOnClickListener(v -> {
            String question = "Select all the parts of a computer";
            String optionA = "Cat";
            String optionB = "Mouse";
            String optionC = "monitor";
            String optionD = "keyboard";
            String answer = "bcd";
            navigateToCheckBoxActivity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void question3Btn() {
        question3Btn.setOnClickListener(v -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3.";
            String optionA = "fizz";
            String optionB = "buzz";
            String optionC = "fizz buzz";
            String optionD = "6";
            String answer = "a";
            navigateToQuestionsAndAnswerActivity(question, optionA, optionB, optionC, optionD, answer);
        });

    }

    private void question2Btn() {
        question2Btn.setOnClickListener(v -> {
            String question = "  Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "true";
            String optionB = "false";
            String optionC = "true & false";
            String optionD = "non of this";
            String answer = "b";
            navigateToQuestionsAndAnswerActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void question1() {
        questionBtn.setOnClickListener(view -> {
            String question = "How many planets are in the solar system";
            String optionA = "10";
            String optionB = "8";
            String optionC = "12";
            String optionD = "9";
            String answer = "b";
            navigateToQuestionsAndAnswerActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void initView() {
        questionBtn = findViewById(R.id.question_foue_btn);
        question2Btn = findViewById(R.id.Question_2_btn);
        question3Btn = findViewById(R.id.question_3_btn);
        checkBox1Btn = findViewById(R.id.checkbox1_btn);
        checkBox2Btn = findViewById(R.id.checkbox2_btn);
        checkbox3Btn = findViewById(R.id.checkbox3_btn);
        trueOrFalseBtn = findViewById(R.id.true_or_false_btn);
        trueFalseTwoBtn = findViewById(R.id.true_false_two_btn);
        trueFalseTreeBtn = findViewById(R.id.true_false_tree_btn);
        numberQuestion1Btn = findViewById(R.id.number_question_1_btn);
        numberQuestion2Btn = findViewById(R.id.number_question2_btn);
        numberQuestion3Btn = findViewById(R.id.number_question3_btn);
        textQ1Btn = findViewById(R.id.text_q1_btn);
        textQ2Btn = findViewById(R.id.text_q2_btn);
        textQ3Btn = findViewById(R.id.text_q3_btn);
        spinnerQ1Btn = findViewById(R.id.spinner_q1_btn);
        spinnerQ2Btn = findViewById(R.id.spinner_q2_btn);
        spinnerQ3Btn = findViewById(R.id.spinner_q3_btn);
    }

    private void navigateToQuestionsAndAnswerActivity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent questionAndAnswerIntent = new Intent(this, QuestionAndAnswersActivity.class);
        questionAndAnswerIntent.putExtra("question", question);
        questionAndAnswerIntent.putExtra("option 1", optionA);
        questionAndAnswerIntent.putExtra("option 2", optionB);
        questionAndAnswerIntent.putExtra("option 3", optionC);
        questionAndAnswerIntent.putExtra("option 4", optionD);
        questionAndAnswerIntent.putExtra("answer", answer);
        startActivity(questionAndAnswerIntent);
    }

    private void navigateToCheckBoxActivity(String question, String option1, String option2, String option3, String option4, String answer) {
        Intent checkBoxActivity = new Intent(this, CheckBoxActivity.class);
        checkBoxActivity.putExtra("Question", question);
        checkBoxActivity.putExtra("optionA", option1);
        checkBoxActivity.putExtra("optionB", option2);
        checkBoxActivity.putExtra("optionC", option3);
        checkBoxActivity.putExtra("optionD", option4);
        checkBoxActivity.putExtra("answer", answer);
        startActivity(checkBoxActivity);
    }

    private void navigateTrueOrFalseQuestionActivity(String question, String answer) {
        Intent trueOrFalseQuestionActivity = new Intent(this, TrueOrFalseQuestionActivity.class);
        trueOrFalseQuestionActivity.putExtra("Question", question);
        trueOrFalseQuestionActivity.putExtra("answer", answer);
        startActivity(trueOrFalseQuestionActivity);
    }

    private void navigateNumberSelectQuestionActivity(String question, String answer) {
        Intent numberQuestionActivity = new Intent(this, NumberSelectQuestionActivity.class);
        numberQuestionActivity.putExtra("Question", question);
        numberQuestionActivity.putExtra("answer", answer);
        startActivity(numberQuestionActivity);
    }
    private void navigateTextQuestionActivity(String question, String answer) {
        Intent textQuestionActivity = new Intent(this, TextQuestionActivity.class);
        textQuestionActivity.putExtra("Question", question);
        textQuestionActivity.putExtra("answer", answer);
        startActivity(textQuestionActivity);
    }
    private void navigateSpinnerQuestionActivity(String question,String answer,String []option){
        Intent SpinnerQuestionActivity = new Intent(this, SpinnerQuestionsActivity.class);
        SpinnerQuestionActivity.putExtra("question",question);
        SpinnerQuestionActivity.putExtra("answer",answer);
        SpinnerQuestionActivity.putExtra("option",option);
        startActivity(SpinnerQuestionActivity);
    }
}