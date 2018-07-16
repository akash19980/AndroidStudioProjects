package com.example.lenovo.shared;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        String name =intent.getStringExtra("NAME");
        Toast.makeText(this, name+"", Toast.LENGTH_SHORT).show();
    }
}
