package com.example.mauriciojuarez.labandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class selectedItemActivity extends AppCompatActivity {

    public static final String SELECTED_ITEM = "com.jwhh.jim.notekeeper.NOTE_INFO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_item);



        Intent intent = getIntent();
        ItemModel prevItem = intent.getParcelableExtra(SELECTED_ITEM);


    }
}
