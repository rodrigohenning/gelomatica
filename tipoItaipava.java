package com.example.henning.gelomatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tipoItaipava extends AppCompatActivity {


    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_itaipava);
    }

    public void latinha(View view){
        i = new Intent(this, ListItaipavaLatinhas.class);
        startActivity(i);
        Toast.makeText(tipoItaipava.this,"Busca Itaipava Latinha", Toast.LENGTH_SHORT).show();
    }

    public void lata(View view){
        i = new Intent(this, ListItaipavaLata.class);
        startActivity(i);
        Toast.makeText(tipoItaipava.this,"Busca Itaipava Lata", Toast.LENGTH_SHORT).show();
    }

    public void garrafa(View view){
        i = new Intent(this, ListItaipavaGarrafa.class);
        startActivity(i);
        Toast.makeText(tipoItaipava.this,"Busca Itaipava Garrafa", Toast.LENGTH_SHORT).show();
    }
}
