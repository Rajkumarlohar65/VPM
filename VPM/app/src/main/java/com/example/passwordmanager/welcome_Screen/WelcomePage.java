package com.example.passwordmanager.welcome_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.passwordmanager.OtpVerification.EnterMoblieNumber;
import com.example.passwordmanager.R;

public class WelcomePage extends AppCompatActivity {
    Button btn2;
    ProgressBar progressBar;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_welcomepage);

        btn2 = findViewById(R.id.btn2);
        progressBar = findViewById(R.id.progressBar);
        viewPager = findViewById(R.id.viewPager);

        welcomeFragmentAdapter adapter = new welcomeFragmentAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);

        progressBar.setVisibility(View.INVISIBLE);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);
                progressBar.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(WelcomePage.this, EnterMoblieNumber.class);
                        startActivity(intent);
                        finish();
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                }, 500);
            }
        });

    }
}