package com.example.deviciency;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    Handler handler;
    ImageView anim;
    AnimationDrawable sprite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        anim = findViewById(R.id.animate);
        sprite = new AnimationDrawable();
        sprite.addFrame(getDrawable(R.drawable.p0),750);
        sprite.addFrame(getDrawable(R.drawable.p1),50);
        sprite.addFrame(getDrawable(R.drawable.p2),50);
        sprite.addFrame(getDrawable(R.drawable.p3),50);
        sprite.addFrame(getDrawable(R.drawable.p4),50);
        sprite.addFrame(getDrawable(R.drawable.p5),50);
        sprite.addFrame(getDrawable(R.drawable.p6),50);
        sprite.addFrame(getDrawable(R.drawable.p7),50);
        sprite.addFrame(getDrawable(R.drawable.p8),50);
        sprite.addFrame(getDrawable(R.drawable.p9),500);
        sprite.setOneShot(true);
        anim.setImageDrawable(sprite);
        sprite.start();

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}