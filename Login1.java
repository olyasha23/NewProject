package com.example.kontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        Button log = (Button)findViewById(R.id.button);
        log.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, Login2.class);
        startActivity(i);
    }

}