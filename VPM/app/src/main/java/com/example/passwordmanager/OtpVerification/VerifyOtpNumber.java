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

import com.example.passwordmanager.mainAcivity.MainActivity;
import com.example.passwordmanager.R;

public class VerifyOtpNumber extends AppCompatActivity {
    EditText inputNumber1, inputNumber2, inputNumber3, inputNumber4, inputNumber5, inputNumber6;
    TextView textView_number;
    TextView textView_resend_otp;
    Button btn_verify_otp;
    ProgressBar progressBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_verify_otp_number);

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        inputNumber3 = findViewById(R.id.inputNumber3);
        inputNumber4 = findViewById(R.id.inputNumber4);
        inputNumber5 = findViewById(R.id.inputNumber5);
        inputNumber6 = findViewById(R.id.inputNumber6);

        textView_number = findViewById(R.id.textView_number);
        textView_resend_otp = findViewById(R.id.textView_resend_otp);
        btn_verify_otp = findViewById(R.id.btn_verify_otp);
        progressBar3 = findViewById(R.id.progressBar3);
        progressBar3.setVisibility(View.INVISIBLE);

        textView_number.setText(String.format(
                "%s", getIntent().getStringExtra("code")
        ));

        textView_resend_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VerifyOtpNumber.this, "Sending New OTP", Toast.LENGTH_SHORT).show();
            }
        });

        btn_verify_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!inputNumber1.getText().toString().trim().isEmpty() && !inputNumber2.getText().toString().trim().isEmpty() && !inputNumber3.getText().toString().trim().isEmpty() && !inputNumber4.getText().toString().trim().isEmpty() && !inputNumber5.getText().toString().trim().isEmpty() && !inputNumber6.getText().toString().trim().isEmpty()) {

                    btn_verify_otp.setVisibility(View.INVISIBLE);
                    progressBar3.setVisibility(View.VISIBLE);

                    progressBar3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Toast.makeText(VerifyOtpNumber.this, "Verification Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(VerifyOtpNumber.this, MainActivity.class);
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
        inputNumber1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber2.requestFocus();
                }
                else {
                    inputNumber1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputNumber2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber3.requestFocus();
                }
                else {
                    inputNumber1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputNumber3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber4.requestFocus();
                }
                else {
                    inputNumber2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputNumber4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber5.requestFocus();
                }
                else {
                    inputNumber3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputNumber5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber6.requestFocus();
                }
                else {
                    inputNumber4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputNumber6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().trim().isEmpty()){
                    inputNumber6.requestFocus();
                }
                else {
                    inputNumber5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}