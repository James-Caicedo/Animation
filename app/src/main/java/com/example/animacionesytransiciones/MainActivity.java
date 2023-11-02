package com.example.animacionesytransiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear enlace entre elemento real y el logico

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        Button btn1 = findViewById(R.id.btn1);
        ImageView image = findViewById(R.id.image);



        //Crear la animcaion y cargarla

        Animation Anim_trasnlate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.trasnlate);
        Animation Anim_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation Anim_rot = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        Animation Anim_scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);


        //Iniciar la animacio

        tv1.startAnimation(Anim_trasnlate);
        tv2.startAnimation(Anim_in);
        btn1.startAnimation(Anim_rot);
        image.startAnimation(Anim_scale);






    }
}