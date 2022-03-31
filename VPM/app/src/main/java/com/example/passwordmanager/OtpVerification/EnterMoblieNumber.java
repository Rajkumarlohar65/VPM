package com.example.passwordmanager.OtpVerification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.passwordmanager.R;

public class EnterMoblieNumber extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button btn_get_otp;
    EditText enterNumber;
    ProgressBar progressBar2;
    Spinner spinner;
    String country_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_enter_moblie_number);

        btn_get_otp = findViewById(R.id.btn_verify_otp);
        enterNumber = findViewById(R.id.enterNumber);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar2.setVisibility(View.INVISIBLE);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country_codes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        btn_get_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!enterNumber.getText().toString().trim().isEmpty()){
                    if (enterNumber.length() < 10){
                        enterNumber.setError("invalid number");
                    }
                    else {
                        btn_get_otp.setVisibility(View.INVISIBLE);
                        progressBar2.setVisibility(View.VISIBLE);

                        progressBar2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(EnterMoblieNumber.this, VerifyOtpNumber.class);
                                intent.putExtra("code", country_code + "-" + enterNumber.getText().toString());
                                startActivity(intent);

                                btn_get_otp.setVisibility(View.VISIBLE);
                                progressBar2.setVisibility(View.INVISIBLE);

                                Toast.makeText(EnterMoblieNumber.this, "OTP Sended Successfully", Toast.LENGTH_SHORT).show();
                            }
                        }, 500);
                    }
                }
                else{
                    Toast.makeText(EnterMoblieNumber.this, "Pleas enter mobile number !", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        country_code = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}