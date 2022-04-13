package com.example.passwordmanager.ui.all_item;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.passwordmanager.R;
import com.example.passwordmanager.databinding.FragmentAdressesBinding;
import com.example.passwordmanager.databinding.FragmentItemAllBinding;


public class ItemAllFragment extends Fragment {
    private FragmentItemAllBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ItemAllViewModel itemAllViewModel = new ViewModelProvider(this).get(ItemAllViewModel.class);

        binding = FragmentItemAllBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAllIem;
        itemAllViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}