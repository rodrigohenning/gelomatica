package com.example.henning.gelomatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Para Buscar entao Vai Para primeira tela
    public void buscaMarcas(View view){
        i = new Intent(this, buscaMarcas.class);
        startActivity(i);
        Toast.makeText(MainActivity.this,"Selecione Logomarca", Toast.LENGTH_SHORT).show();
    }


    //Para Buscar entao Vai Para primeira tela
    public void cadastroPreco(View view){
        i = new Intent(this, cadastroPreco.class);
        startActivity(i);
         Toast.makeText(MainActivity.this,"Cadastre Preços", Toast.LENGTH_SHORT).show();
    }

}
