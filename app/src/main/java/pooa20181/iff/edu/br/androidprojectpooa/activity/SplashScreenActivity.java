package pooa20181.iff.edu.br.androidprojectpooa.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pooa20181.iff.edu.br.androidprojectpooa.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMain();
            }
        }, SPLASH_TIME_OUT);

    }
    private void mostrarMain()
    {
        Intent intent = new Intent(SplashScreenActivity.this, Principal.class);
        startActivity(intent);
        finish();
    }
}

