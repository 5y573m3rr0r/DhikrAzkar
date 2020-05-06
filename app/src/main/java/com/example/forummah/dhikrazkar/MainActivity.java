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
    Button tasweeh_counter,namajer_porer_dhikr,sokal_sondhar_amol,tasweeh_list;

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
        namajer_porer_dhikr = (Button)findViewById(R.id.namajerporerdhikr_button);
        namajer_porer_dhikr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNamajerPorerDhikr();
            }
        });
        sokal_sondhar_amol = (Button)findViewById(R.id.sokalsondharamol_button);
        sokal_sondhar_amol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSokalSondharAmol();
            }
        });
        tasweeh_list = (Button)findViewById(R.id.tasweehbutton_button);
        tasweeh_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTasweehList();
            }
        });
    }
    public void startTasweehCounter(){
        Intent tasweeh_counter_intent = new Intent(this,TasweehCounter.class);
        startActivity(tasweeh_counter_intent);
    }
    public void startNamajerPorerDhikr(){
        Intent namajer_porer_dhikr_intent = new Intent(this,NamajerPorerDhikr.class);
        startActivity(namajer_porer_dhikr_intent);
    }
    public void startSokalSondharAmol(){
        Intent sokalsondharamol_intent = new Intent(this,SokalSondharAmol.class);
        startActivity(sokalsondharamol_intent);
    }
    public void startTasweehList(){
        Intent tasweehlist_intent = new Intent(this,TasweehList.class);
        startActivity(tasweehlist_intent);
    }
}