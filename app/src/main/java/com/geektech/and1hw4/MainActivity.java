package com.geektech.and1hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst , new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond , new SecondFragment()).commit();

    }
}