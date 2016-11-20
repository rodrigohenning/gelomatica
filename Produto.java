package com.example.henning.gelomatica;

import java.io.Serializable;

/**
 * Created by Henning on 09/11/2016.
 */
//produto TEXT, tipo TEXT, preco FLOAT, endereco TEXT, empresa TEXT

public class Produto implements Serializable {
    private long id;
    private String cerveja,tipo,bar,endereco;
    private float preco;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCerveja() {
        return cerveja;
    }

    public void setCerveja(String cerveja) {
        this.cerveja = cerveja;
    }


    public String toString() {
        return " "+cerveja+" "+tipo+"\n Preço: R$"+preco+"\n Bar: "+bar+" \n Endereço: "+endereco+"\n";
    }
}