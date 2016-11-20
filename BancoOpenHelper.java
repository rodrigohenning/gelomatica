package com.example.henning.gelomatica;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Henning on 09/11/2016.
 */

public class BancoOpenHelper extends SQLiteOpenHelper {

    public BancoOpenHelper(Context context) {
        super(context, "gelomatica.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String comando = "CREATE TABLE produtos (_id INTEGER PRIMARY KEY AUTOINCREMENT, cerveja TEXT, tipo TEXT, preco FLOAT, endereco TEXT, bar TEXT)";
        db.execSQL(comando);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
