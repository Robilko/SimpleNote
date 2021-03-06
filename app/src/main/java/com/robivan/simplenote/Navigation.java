package com.robivan.simplenote;

import android.text.TextUtils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Navigation {

    private final FragmentManager fragmentManager;

    public Navigation(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public void addFragment(int idView, Fragment fragment, String key) {

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Добавить фрагмент
        if (TextUtils.isEmpty(key)) {
            fragmentTransaction.replace(idView, fragment);
        } else {
            fragmentTransaction.replace(idView, fragment, key);
        }
        fragmentTransaction.addToBackStack(null).commit();
    }
}
