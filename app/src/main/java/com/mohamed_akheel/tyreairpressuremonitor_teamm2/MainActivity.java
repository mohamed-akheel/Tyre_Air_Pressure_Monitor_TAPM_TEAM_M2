package com.mohamed_akheel.tyreairpressuremonitor_teamm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void second(View V) {
        Intent i = new Intent(this, page2.class);
        startActivity(i);
    }

    public void three(View V) {
        Intent i = new Intent(this, page4.class);
        startActivity(i);
    }
}