package com.example.passwordmanager.ui.password;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PasswordViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PasswordViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Passwords are here");
    }

    public LiveData<String> getText() {
        return mText;
    }
}