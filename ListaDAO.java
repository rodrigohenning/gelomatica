package com.example.henning.gelomatica;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henning on 09/11/2016.
 */

public class ListaDAO {
    private SQLiteDatabase db;
    private BancoOpenHelper openHelper;

    public ListaDAO(Context context){
        openHelper = new BancoOpenHelper(context);
    }

    public void abrir(){
        db = openHelper.getWritableDatabase();
    }

    public void fechar(){
        db.close();
    }


    public Produto criarProduto(String cerveja, String tipo , float preco , String endereco, String bar){
        ContentValues values = new ContentValues();
        values.put("cerveja", cerveja);
        values.put("tipo", tipo);
        values.put("preco", preco);
        values.put("endereco", endereco);
        values.put("bar", bar);

        //o primeiro parametro é o nome da tabela
        long id = db.insert("produtos", null, values);

        Produto prod = new Produto();
        prod.setId(id);
        prod.setCerveja(cerveja);
        prod.setTipo(tipo);
        prod.setEndereco(endereco);
        prod.setBar(bar);
        prod.setPreco(preco);

        return prod;
    }


    public void removerProduto(Produto p){
        long id = p.getId();
        Log.i("ID DO PRODUTO DELETADO", ""+id);
        db.delete("produtos", "_id = " + id, null);
    }

    // LISTA TODOS OS PRODUTOS
    public List<Produto> listProdutos(){
        List<Produto> produtos = new ArrayList<>();

        Cursor cursor = db.query("produtos", null,null,null,null,null,"preco");
        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }
//_________________________________________________________________________________________________________
//   Kaiser

    public List<Produto> listLatinhaKaiser(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Kaiser";
        String tipoCervejakaiser="Lata 283ml (Piriguete)";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
   }


    public List<Produto> listLataKaiser(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Kaiser";
        String tipoCervejakaiser="Lata 360ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }

    public List<Produto> listGarrafaKaiser(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Kaiser";
        String tipoCervejakaiser="Garrafa 600ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }

//_________________________________________________________________________________________________________________________
    //Skol


    public List<Produto> listLatinhaSkol(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Skol";
        String tipoCervejakaiser="Lata 283ml (Piriguete)";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }


    public List<Produto> listLataSkol(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Skol";
        String tipoCervejakaiser="Lata 360ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }

    public List<Produto> listGarrafaSkol(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Skol";
        String tipoCervejakaiser="Garrafa 600ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }


    //_______________________________________________________________________________________________________________________
    //ITAIPAVA

    public List<Produto> listLatinhaItaipava(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Itaipava";
        String tipoCervejakaiser="Lata 283ml (Piriguete)";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }


    public List<Produto> listLataItaipava(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Itaipava";
        String tipoCervejakaiser="Lata 360ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }

    public List<Produto> listGarrafaItaipava(){
        List<Produto> produtos = new ArrayList<>();

        String cervejaKaiser="Itaipava";
        String tipoCervejakaiser="Garrafa 600ml";
        Cursor cursor = db.query("produtos", null," cerveja ='"+cervejaKaiser+"'"+" AND tipo = '"+tipoCervejakaiser+"'",
                null,null,null,"preco");

        while(cursor.moveToNext()){
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setCerveja(cursor.getString(1));
            p.setTipo(cursor.getString(2));
            p.setPreco(cursor.getFloat(3));
            p.setEndereco(cursor.getString(4));
            p.setBar(cursor.getString(5));

            produtos.add(p);
        }
        cursor.close();
        return produtos;
    }

}