package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.passwordmanager.databinding.ActivityAddItemBinding;

import java.util.ArrayList;

public class Add_Item extends AppCompatActivity {
    private ActivityAddItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar2);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Password");
        arrayList.add("Secure note");
        arrayList.add("Address");
        arrayList.add("Payment card");
        arrayList.add("Wi-fi password");
        arrayList.add("Bank account");
        arrayList.add("Drivers license");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(Add_Item.this, android.R.layout.simple_list_item_1, arrayList);
        binding.listView.setAdapter(arrayAdapter);

    }
}