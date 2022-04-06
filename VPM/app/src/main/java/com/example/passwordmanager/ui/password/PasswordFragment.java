package com.example.passwordmanager.ui.password;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.passwordmanager.databinding.FragmentPasswordBinding;

public class PasswordFragment extends Fragment {

    private FragmentPasswordBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PasswordViewModel passwordViewModel =
                new ViewModelProvider(this).get(PasswordViewModel.class);

        binding = FragmentPasswordBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPassword;
        passwordViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}