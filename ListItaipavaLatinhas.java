package com.example.henning.gelomatica;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.List;

public class ListItaipavaLatinhas extends ListActivity {

    private List<Produto> listProdutos;// = new ArrayList<>();
    private ArrayAdapter arrayAdapter;
    private ListaDAO listaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        listaDAO = new ListaDAO(this);
        listaDAO.abrir();

        listProdutos = listaDAO.listLatinhaItaipava();
        arrayAdapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, listProdutos);

        setListAdapter(arrayAdapter);

    }
    @Override
    protected void onPause(){
        listaDAO.fechar();
        super.onPause();
    }

}
