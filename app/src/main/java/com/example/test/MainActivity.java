package com.example.test;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Spinner s1 = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Ws,R.layout.spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_layout);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(this);

    }

    public static String s1="http://www.google.com";
    public static String s2="http://youtube.com";
    public static String s3="http://www.facebook.com";
    public static String s4="http://www.e-ducate.in";
    public static String s5="http://www.github.com";


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Intent i =new Intent(this,wv.class);

        switch(position){
            case 0:
                Toast.makeText(this, "PLease Select Something", Toast.LENGTH_SHORT).show();
                break;
            case 1: s1="http://www.google.com";
                    startActivity(i);
                overridePendingTransition(R.anim.anim,R.anim.anim);
                    break;

            case 2:s1="http://youtu.be/_IpmtEYqKIQ";
                startActivity(i);
                overridePendingTransition(R.anim.anim,R.anim.anim);
                break;

            case 3:  s1="http://www.facebook.com";
                startActivity(i);
                overridePendingTransition(R.anim.anim,R.anim.anim);
                break;

            case 4:s1="http://www.e-ducate.in";
                startActivity(i);
                overridePendingTransition(R.anim.anim,R.anim.anim);
                break;

            case 5:
                s1="http://www.github.com";
                startActivity(i);
                overridePendingTransition(R.anim.anim,R.anim.anim);
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
