package com.example.kontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class Login2 extends AppCompatActivity implements View.OnClickListener {
    CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            Toast.makeText(getApplicationContext(),
                    "Год: " + year + "\n" +
                            "Месяц: " + month + "\n" +
                            "День: " + dayOfMonth,
                    Toast.LENGTH_SHORT).show();
        });
        Button next = (Button)findViewById(R.id.buttonreg2);
        next.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "Ваша заявка принята!", Toast.LENGTH_SHORT).show();
    }
}

