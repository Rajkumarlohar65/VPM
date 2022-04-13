package com.example.passwordmanager.OtpVerification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.passwordmanager.MainActivity2;
import com.example.passwordmanager.R;
import com.example.passwordmanager.databinding.Activity4VerifyOtpNumberBinding;

public class VerifyOtpNumber extends AppCompatActivity {
    private Activity4VerifyOtpNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity4VerifyOtpNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String country_code = intent.getStringExtra("code");
        String mobile_number = intent.getStringExtra("number");
        binding.textViewNumber.setText(country_code + "-" + mobile_number);

        binding.textViewResendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VerifyOtpNumber.this, "Sending New OTP", Toast.LENGTH_SHORT).show();
            }
        });

        binding.progressBar3.setVisibility(View.INVISIBLE);

        binding.btnVerifyOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!binding.inputNumber1.getText().toString().trim().isEmpty() && !binding.inputNumber2.getText().toString().trim().isEmpty() && !binding.inputNumber3.getText().toString().trim().isEmpty() && !binding.inputNumber4.getText().toString().trim().isEmpty() && !binding.inputNumber5.getText().toString().trim().isEmpty() && !binding.inputNumber6.getText().toString().trim().isEmpty()) {

                    binding.btnVerifyOtp.setVisibility(View.INVISIBLE);
                    binding.progressBar3.setVisibility(View.VISIBLE);

                    binding.progressBar3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Toast.makeText(VerifyOtpNumber.this, "Verification Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(VerifyOtpNumber.this, MainActivity2.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 500);

                }
                else{
                    Toast.makeText(VerifyOtpNumber.this, "Please enter all number !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        numberOtpMove();
    }

    private void numberOtpMove() {
        binding.inputNumber1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber2.requestFocus();
                }
                else {
                    binding.inputNumber1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.inputNumber2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber3.requestFocus();
                }
                else {
                    binding.inputNumber1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.inputNumber3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber4.requestFocus();
                }
                else {
                    binding.inputNumber2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.inputNumber4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber5.requestFocus();
                }
                else {
                    binding.inputNumber3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.inputNumber5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber6.requestFocus();
                }
                else {
                    binding.inputNumber4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.inputNumber6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    binding.inputNumber6.requestFocus();
                }
                else {
                    binding.inputNumber5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}