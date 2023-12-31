package com.deucalion.syntaxspy;

import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(iHome);
                finish();
            }
        }, 3000);
    }

}