package com.example.forummah.dhikrazkar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tasweeh_counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tasweeh_counter = (Button)findViewById(R.id.tasweehcounter_button);
        tasweeh_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTasweehCounter();
            }
        });

    }
    public void startTasweehCounter(){
        Intent tasweeh_counter_intent = new Intent(this,TasweehCounter.class);
        startActivity(tasweeh_counter_intent);
    }
}