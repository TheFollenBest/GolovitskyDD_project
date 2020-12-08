package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class charscreen extends AppCompatActivity {

    Button home;
    Button photo;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_charscreen);

        home = findViewById(R.id.button3);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(charscreen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        photo = findViewById(R.id.button5);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(charscreen.this, camera.class);
                startActivity(intent);
            }
        });

        search = findViewById(R.id.button4);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(charscreen.this, sobaki.class);
                startActivity(intent);
            }
        });
    }
}