package com.example.mtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button Send_Click;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Send_Click = findViewById(R.id.logbutn);
        Log.d("tag","hey");





/*
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(Splash_Screen.this,Login.class);
                    startActivity(intent);
                    finish();
                }
            },3000);

        }catch (Exception e){
            e.getStackTrace();
        }
test
comment by rahul1
*/
    }
}
