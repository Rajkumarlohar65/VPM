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
import com.example.passwordmanager.databinding.Activity3EnterMoblieNumberBinding;

public class EnterMoblieNumber extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Activity3EnterMoblieNumberBinding binding;
    String country_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity3EnterMoblieNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country_codes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);
        binding.spinner.setOnItemSelectedListener(this);

        binding.progressBar2.setVisibility(View.INVISIBLE);

        binding.btnGetOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!binding.enterNumber.getText().toString().trim().isEmpty()){
                    if (binding.enterNumber.length() < 10){
                        binding.enterNumber.setError("invalid number");
                    }
                    else {
                        binding.btnGetOtp.setVisibility(View.INVISIBLE);
                        binding.progressBar2.setVisibility(View.VISIBLE);

                        binding.progressBar2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(EnterMoblieNumber.this, VerifyOtpNumber.class);
                                intent.putExtra("code", country_code);
                                intent.putExtra("number", binding.enterNumber.getText().toString());
                                startActivity(intent);

                                binding.btnGetOtp.setVisibility(View.VISIBLE);
                                binding.progressBar2.setVisibility(View.INVISIBLE);

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