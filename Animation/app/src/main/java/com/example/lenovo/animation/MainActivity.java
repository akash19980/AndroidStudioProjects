package com.example.lenovo.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void blink(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation blinkanimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        imageView.startAnimation(blinkanimation);
    }

    public void clock(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation clockanimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clock);
        imageView.startAnimation(clockanimation);


    }
}
