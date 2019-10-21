package com.androidrion.animasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startFadeOut(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startBlink(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startFadeIn(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startMove(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startSlideDown(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startSlideUp(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startRotate(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startBounce(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startZoomOut(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startZoomIn(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        imageView.startAnimation(startFadeOutAnimation);
    }

    public void startZoomInRotate(View view) {
        ImageView imageView = findViewById(R.id.image);
        Animation startFadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_rotate);
        imageView.startAnimation(startFadeOutAnimation);
    }
}
