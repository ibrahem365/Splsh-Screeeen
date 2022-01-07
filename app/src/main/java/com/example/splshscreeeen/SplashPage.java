package com.example.splshscreeeen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashPage extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    progressBar = findViewById(R.id.progressBar);
    textView = findViewById(R.id.textView2);

    progressBar.setMax(100);
    progressBar.setScaleY(3f);

    progressAnimation();

    }

    public void progressAnimation(){
        ProgBarAnimation anim = new ProgBarAnimation(this,progressBar,textView,0f,100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);
    }
}