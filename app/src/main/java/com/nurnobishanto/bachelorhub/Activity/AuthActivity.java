package com.nurnobishanto.bachelorhub.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nurnobishanto.bachelorhub.AuthFragment.SigninFragment;
import com.nurnobishanto.bachelorhub.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameAuthContainer,new SigninFragment()).commit();
    }
}