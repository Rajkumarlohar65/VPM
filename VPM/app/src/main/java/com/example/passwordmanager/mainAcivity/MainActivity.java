package com.example.passwordmanager.mainAcivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.passwordmanager.R;
import com.example.passwordmanager.mainAcivity.fragments.addData;
import com.example.passwordmanager.mainAcivity.fragments.listOfData;
import com.example.passwordmanager.mainAcivity.fragments.userDetails;

public class MainActivity extends AppCompatActivity {

    ImageView list_image;
    ImageView add_data_image;
    ImageView user_image;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_main);

        list_image = findViewById(R.id.list_image);
        add_data_image = findViewById(R.id.add_data_image);
        user_image = findViewById(R.id.user_image);
        linearLayout = findViewById(R.id.linearLayout);

        list_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listOfData secondFragment = new listOfData();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.linearLayout, secondFragment);
                fragmentTransaction.commit();

            }
        });

        add_data_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addData firstFragment = new addData();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.linearLayout, firstFragment);
                fragmentTransaction.commit();
            }
        });

        user_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userDetails thirdFragment = new userDetails();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.linearLayout, thirdFragment);
                fragmentTransaction.commit();
            }
        });

    }
}