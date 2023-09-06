package com.example.takkah_an;

import androidx.appcompat.app.AppCompatActivity;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logo = findViewById(R.id.logo);
        YoYo.with(Techniques.RotateIn)
                .duration(1000)
                .playOn(findViewById(R.id.logo));

        logo = findViewById(R.id.logo);
        YoYo.with(Techniques.Flash)
                .duration(1000)
                .playOn(findViewById(R.id.logo));



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,onbording1.class);
                startActivity(i);
            }
        },4000);

    }
}