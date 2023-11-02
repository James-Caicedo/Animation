package com.example.animacionesytransiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);

        ImageView image1 = findViewById(R.id.image1);

        Animation fadeIn = new AlphaAnimation(0,1);
        fadeIn.setDuration(2000);
        image1.startAnimation(fadeIn);

        image1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent irAhome = new Intent(SplasActivity.this,MainActivity.class);
                startActivity(irAhome);
                finish();

            }
        } ,3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImageView image1 = findViewById(R.id.image1);
        image1.removeCallbacks(null);

    }
}
