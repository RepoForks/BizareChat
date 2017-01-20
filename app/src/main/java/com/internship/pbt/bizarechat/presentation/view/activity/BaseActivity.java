package com.internship.pbt.bizarechat.presentation.view.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.internship.pbt.bizarechat.presentation.navigation.Navigator;

public class BaseActivity extends AppCompatActivity {

    protected Navigator mNavigator = Navigator.getInstance();


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (mNavigator == null)
            mNavigator = Navigator.getInstance();
    }

    @Override protected void onResume() {
        super.onResume();
    }

    protected void addFragment(int containerViewId, Fragment fragment){
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.commit();
    }
}