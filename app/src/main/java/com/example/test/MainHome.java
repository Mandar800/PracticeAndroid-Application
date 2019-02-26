package com.example.test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainHome extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        card1=(CardView)findViewById(R.id.cardView2);
        card2=(CardView)findViewById(R.id.cardView5);
        card3=(CardView)findViewById(R.id.cardView4);
        card4=(CardView)findViewById(R.id.cardView3);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.cardView2: i=new Intent(this,MainActivity.class);startActivity(i); break;
            case R.id.cardView5: i=new Intent(this,recy.class);startActivity(i); break;
            case R.id.cardView4: i=new Intent(this,frag.class);startActivity(i); break;
            case R.id.cardView3:
                final AlertDialog.Builder b1=new AlertDialog.Builder(MainHome.this);
                b1.setMessage("Are You Sure?");
                b1.setCancelable(true);
                b1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                b1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog a1=b1.create();
                a1.show();

        }


    }
}
