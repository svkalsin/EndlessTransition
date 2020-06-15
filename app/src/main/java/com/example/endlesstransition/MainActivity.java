package com.example.endlesstransition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int number = 1+(int)(Math.random()*100);
        TextView status = findViewById(R.id.Status);
        status.setText(getString(R.string.text_status,number));
    }

    public void btnForward(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void btnBack(View view) {
        finish();
    }
}