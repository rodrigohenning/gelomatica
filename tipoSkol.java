package com.example.henning.gelomatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tipoSkol extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_skol);
    }

    public void latinha(View view){
        i = new Intent(this, ListSkolLatinhas.class);
        startActivity(i);
        Toast.makeText(tipoSkol.this,"Busca Skol Latinha", Toast.LENGTH_SHORT).show();
    }

    public void lata(View view){
        i = new Intent(this, ListSkolLata.class);
        startActivity(i);
        Toast.makeText(tipoSkol.this,"Busca Skol Lata", Toast.LENGTH_SHORT).show();
    }

    public void garrafa(View view){
        i = new Intent(this, ListSkolGarrafa.class);
        startActivity(i);
        Toast.makeText(tipoSkol.this,"Busca Skol Garrafa", Toast.LENGTH_SHORT).show();
    }
}
