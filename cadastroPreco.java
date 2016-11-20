package com.example.henning.gelomatica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class cadastroPreco extends AppCompatActivity {

    EditText preco, endereco, bar;
    //EditText tipo, cerveja;
    //RadioGroup tipo,cerveja;

    RadioButton tipoB,produtoB;

    List<EditText> campos;
    List<Produto> carrinhoDeCompras;

    private ListaDAO listaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_preco);


        preco = (EditText) findViewById(R.id.editTextPreco);
        endereco = (EditText) findViewById(R.id.editTextEndereco);
        bar = (EditText) findViewById(R.id.editTextBar);
        //tipo = (EditText) findViewById(R.id.editTextTipo);
        //cerveja = (EditText) findViewById(R.id.editTextCerveja);

        campos = new ArrayList<>();

        campos.add(preco);
        campos.add(endereco);
        campos.add(bar);


        carrinhoDeCompras = new ArrayList<>();
        listaDAO = new ListaDAO(this);
        listaDAO.abrir();

    }


    public void onRadioButtonClickedTIPO(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonLata283ml:
                if (checked)
                    tipoB= (RadioButton) findViewById(R.id.radioButtonLata283ml);
                    break;
            case R.id.radioButtonLata360ml:
                if (checked)
                    tipoB= (RadioButton) findViewById(R.id.radioButtonLata360ml);
                    break;
            case R.id.radioButtonGarrafa600ml:
                if (checked)
                    tipoB= (RadioButton) findViewById(R.id.radioButtonGarrafa600ml);
                    break;
        }
    }

    public void onRadioButtonClickedCERVEJA(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonSkol:
                if (checked)
                    produtoB= (RadioButton) findViewById(R.id.radioButtonSkol);
                break;
            case R.id.radioButtonKaiser:
                if (checked)
                    produtoB= (RadioButton) findViewById(R.id.radioButtonKaiser);
                break;
            case R.id.radioButtonItaipava:
                if (checked)
                    produtoB= (RadioButton) findViewById(R.id.radioButtonItaipava);
                break;
        }
    }

    @Override
    protected void onPause() {
        listaDAO.fechar();
        super.onPause();
    }

    public void addCadastro(View v){

        boolean campovazio = false;
        String endereco, bar;
        String cerveja,tipo;
        float preco;

        for (EditText ed : campos){
            if(ed.getText().toString().equals("")){
                campovazio = true;
                break;
            }
        }

        if (campovazio){
            Toast.makeText(cadastroPreco.this, "Por favor preencha todos os campos", Toast.LENGTH_SHORT).show();
        }else{

            //Botões
            tipo= String.valueOf(this.tipoB.getText().toString());
            cerveja= String.valueOf(this.produtoB.getText().toString());


            endereco = this.endereco.getText().toString();
            bar = this.bar.getText().toString();
            preco = Float.valueOf(this.preco.getText().toString());

            Produto p = new Produto();
            p.setCerveja(cerveja);
            p.setTipo(tipo);
            p.setPreco(preco);
            p.setEndereco(endereco);
            p.setBar(bar);

            Produto produto1 = listaDAO.criarProduto(cerveja,tipo,preco,endereco,bar);

            //carrinhoDeCompras.add(p);

            Toast.makeText(cadastroPreco.this, "Preço do bar adicionado", Toast.LENGTH_SHORT).show();
            limparCampos();

        }
    }

    public void limparCampos(){
        for(EditText ed : campos){
            ed.setText("");
        }
    }
}

