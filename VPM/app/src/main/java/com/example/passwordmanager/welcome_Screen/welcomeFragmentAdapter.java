package com.example.passwordmanager.welcome_Screen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.passwordmanager.welcome_Screen.fragments.WelcomeFirst;
import com.example.passwordmanager.welcome_Screen.fragments.WelcomeSecond;
import com.example.passwordmanager.welcome_Screen.fragments.WelcomeThird;

public class welcomeFragmentAdapter extends FragmentStateAdapter {

    public welcomeFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new WelcomeFirst();
            case 1:
                return new WelcomeSecond();
            case 2:
                return new WelcomeThird();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}