package com.example.henning.gelomatica;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class buscaMarcas extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_marcas);
    }

    //Para Buscar entao Vai Para primeira tela
    public void tipoKaiser(View view){
        i = new Intent(this, tipoKaiser.class);
        startActivity(i);
          Toast.makeText(buscaMarcas.this,"Qual Tipo de Kaiser", Toast.LENGTH_SHORT).show();
    }

    //Para Buscar entao Vai Para primeira tela
    public void tipoSkol(View view){
        i = new Intent(this, tipoSkol.class);
        startActivity(i);
        Toast.makeText(buscaMarcas.this,"Qual Tipo de Skol", Toast.LENGTH_SHORT).show();
    }

    //Para Buscar entao Vai Para primeira tela
    public void tipoItaipava(View view){
        i = new Intent(this, tipoItaipava.class);
        startActivity(i);
        Toast.makeText(buscaMarcas.this,"Qual Tipo de Itaipava", Toast.LENGTH_SHORT).show();
    }

    //Sem Informaoes
    public void semDados(View view){
        Toast.makeText(buscaMarcas.this,"Sem Informações!", Toast.LENGTH_SHORT).show();
    }

    public void mostraTudo(View view){
        i = new Intent(this, ListProdutos.class);
        startActivity(i);
        Toast.makeText(buscaMarcas.this,"Lista de Todos", Toast.LENGTH_SHORT).show();
    }

}
