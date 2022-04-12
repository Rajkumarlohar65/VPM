package com.example.passwordmanager.welcome_Screen.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.passwordmanager.R;
import com.example.passwordmanager.databinding.Activity2WelcomepageBinding;

public class WelcomeFirst extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome_first, container, false);

        return view;
    }
}