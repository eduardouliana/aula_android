package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Iterator;

import br.edu.unoesc.webmob.offtrail.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent itLogin = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(itLogin);
                finish();
            }
        }, 3000);

    }
}
