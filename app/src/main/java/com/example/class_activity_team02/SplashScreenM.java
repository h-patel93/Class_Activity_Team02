package com.example.class_activity_team02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        logolauncher logolauncher =new logolauncher();
        logolauncher.start();


        /*  requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();*/

    }



    private class logolauncher extends Thread{
        public void run()
        {
            try{
                sleep(1000*4);
            }
            catch (InterruptedException e)

            {
                e.printStackTrace();
            }

            Intent intent =new Intent(SplashScreenM.this,MainActivity.class);
            startActivity(intent);

            SplashScreenM.this.finish();
        }
    }


}
