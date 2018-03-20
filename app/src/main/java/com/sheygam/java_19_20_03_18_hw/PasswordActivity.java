package com.sheygam.java_19_20_03_18_hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputPassword;
    private Button backBtn, okBtn;
    private String currentEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        currentEmail = getIntent().getStringExtra("EMAIL");
        inputPassword = findViewById(R.id.input_password);
        backBtn = findViewById(R.id.back_btn);
        okBtn = findViewById(R.id.ok_btn);
        backBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.back_btn){
            finish();
        }else if(v.getId() == R.id.ok_btn){
            String password = inputPassword.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("EMAIL",currentEmail);
            intent.putExtra("PASSWORD",password);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}
