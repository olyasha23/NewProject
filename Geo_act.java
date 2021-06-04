package com.example.kontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geo_act extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_act);
        Button reg = (Button)findViewById(R.id.geo_r);
        reg.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this,Login1.class);
        startActivity(i);
    }
}
