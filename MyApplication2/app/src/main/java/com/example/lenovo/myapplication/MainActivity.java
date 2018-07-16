package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;

import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoComplete;
    String[] arr={"paris,france","pa,usa","india,usa","ca,usa","usa,italy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoComplete=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,arr);
        autoComplete.setThreshold(2);
        autoComplete.setAdapter(adapter);
    }
}
