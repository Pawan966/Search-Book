package com.example.searchbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText searchField = (EditText) findViewById(R.id.search_view_field);

        Button search= (Button) findViewById(R.id.search_button);

        search.setOnClickListener(v -> {
            String name=String.valueOf(searchField.getText());
            Intent listIntent=new Intent(MainActivity.this,ListActivity.class);
            listIntent.putExtra("key", name); //Optional parameters
            MainActivity.this.startActivity((listIntent));
        });

    }
}