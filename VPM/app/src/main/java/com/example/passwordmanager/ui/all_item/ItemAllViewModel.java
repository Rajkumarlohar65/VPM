package com.example.passwordmanager.ui.all_item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItemAllViewModel extends ViewModel {

    private final MutableLiveData<String> mtext;


    public ItemAllViewModel() {
        mtext = new MutableLiveData<>();
        mtext.setValue("All Items");
    }

    public LiveData<String> getText(){
        return mtext;
    }
}
