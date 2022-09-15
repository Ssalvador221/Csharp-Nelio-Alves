package com.example.saaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button login1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);


        Button but2 = findViewById(R.id.but2);


        but2.setAlpha(0f);


        but2.animate().alpha(1f).setDuration(1500);

        but2  = findViewById(R.id.but2);

        but2.setAlpha(0f);
        but2.setTranslationY(50);

        but2.animate().alpha(1f).translationYBy(-50).setDuration(1500);



        Button login1 = findViewById(R.id.login1);


        login1.setAlpha(0f);


        login1.animate().alpha(1f).setDuration(1500);

        login1 = findViewById(R.id.login1);

        login1.setAlpha(0f);
        login1.setTranslationY(50);

        login1.animate().alpha(1f).translationYBy(-50).setDuration(1500);



        Button yourButton = (Button) findViewById(R.id.login1);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, LoginScreen.class));
            }
        });



        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistroScreen.class);
                startActivity(intent);
            }
        });

    }
}