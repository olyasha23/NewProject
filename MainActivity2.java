package com.example.kontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button2 = (Button) findViewById(R.id.kad_rab);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Kad_rabs.class);
                startActivity(i);
                button2.setOnClickListener(this);
            }
        });
        final Button button1 = (Button) findViewById(R.id.geo_izisk);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Geo_act.class);
                startActivity(i);
                button1.setOnClickListener(this);
            }
        });
        final Button button3 = (Button) findViewById(R.id.urid_uslugi);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Urid_uslug.class);
                startActivity(i);
                button3.setOnClickListener(this);
            }
        });
        final Button button4 = (Button) findViewById(R.id.zem_rab);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Zem_rabs.class);
                startActivity(i);
                button4.setOnClickListener(this);
            }
        });

        final Button button5 = (Button) findViewById(R.id.tex_in);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,Tex_inventor.class);
                startActivity(i);
                button5.setOnClickListener(this);
            }
        });
    }
    @Override
    public void onClick(View v) {
    }

}