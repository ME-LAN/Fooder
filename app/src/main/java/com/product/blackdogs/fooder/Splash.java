package com.product.blackdogs.fooder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by Milan Marwadi on 21-09-2016.
 */

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            // already signed in
            startActivity(new Intent(Splash.this, MainActivity.class));
            finish();
        } else {
            // not signed in
            startActivity(new Intent(Splash.this, Login.class));
            finish();
        }

    }
}
