package com.example.android.letsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

        new Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        Intent i = new Intent(Launcher.this, LoginActivity.class);
                        startActivity(i);
                        finish();
                    } }, 2000);

    }

}