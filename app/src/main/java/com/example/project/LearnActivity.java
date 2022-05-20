package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LearnActivity extends AppCompatActivity {

    CardView what, syarat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        what = (CardView) findViewById(R.id.what);
        what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LearnActivity.this, Pengertian.class);
                startActivity(i);
                finish();
            }
        });
        syarat = (CardView) findViewById(R.id.syarat);
        syarat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(LearnActivity.this, syarat.class);
                    startActivity(i);
                    finish();
                }
        });
    }
}