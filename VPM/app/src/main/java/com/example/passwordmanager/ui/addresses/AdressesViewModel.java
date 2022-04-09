package com.example.passwordmanager.ui.addresses;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdressesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AdressesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Addresses");
    }

    public LiveData<String> getText() {
        return mText;
    }
}