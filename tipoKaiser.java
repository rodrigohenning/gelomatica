package com.example.henning.gelomatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tipoKaiser extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_kaiser);
    }

    public void latinha(View view){
        i = new Intent(this, ListKaiserLatinhas.class);
        startActivity(i);
        Toast.makeText(tipoKaiser.this,"Busca Kaiser Latinha", Toast.LENGTH_SHORT).show();
    }

    public void lata(View view){
        i = new Intent(this, ListKaiserLata.class);
        startActivity(i);
        Toast.makeText(tipoKaiser.this,"Busca Kaiser Lata", Toast.LENGTH_SHORT).show();
    }

    public void garrafa(View view){
        i = new Intent(this, ListKaiserGarrafa.class);
        startActivity(i);
        Toast.makeText(tipoKaiser.this,"Busca Kaiser Garrafa", Toast.LENGTH_SHORT).show();
    }
}
