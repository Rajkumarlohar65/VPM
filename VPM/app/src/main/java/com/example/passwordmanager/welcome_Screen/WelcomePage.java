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
import com.example.passwordmanager.databinding.Activity2WelcomepageBinding;

public class WelcomePage extends AppCompatActivity {
    private Activity2WelcomepageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity2WelcomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        welcomeFragmentAdapter adapter = new welcomeFragmentAdapter(getSupportFragmentManager(),getLifecycle());
        binding.viewPager.setAdapter(adapter);

        binding.progressBar.setVisibility(View.INVISIBLE);
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btn2.setVisibility(View.INVISIBLE);
                binding.progressBar.setVisibility(View.VISIBLE);
                binding.progressBar.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(WelcomePage.this, EnterMoblieNumber.class);
                        startActivity(intent);
                        finish();
                        binding.progressBar.setVisibility(View.INVISIBLE);
                    }
                }, 500);
            }
        });

    }
}