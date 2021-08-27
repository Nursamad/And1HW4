package com.geektech.and1hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {
    private String getText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initResult();
    }

    private void initResult() {
        Intent intent = getIntent();
        getText = (String) intent.getSerializableExtra("key");
    }
}