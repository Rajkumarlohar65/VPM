package com.example.passwordmanager.ui.addresses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.passwordmanager.databinding.FragmentAdressesBinding;

public class AdressesFragment extends Fragment {

    private FragmentAdressesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AdressesViewModel adressesViewModel =
                new ViewModelProvider(this).get(AdressesViewModel.class);

        binding = FragmentAdressesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAddresses;
        adressesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}