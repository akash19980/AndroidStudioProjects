package com.example.lenovo.gridviewapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
ImageView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
view=(ImageView)findViewById(R.id.imageViewid);
        Intent intent=getIntent();
        view.setImageResource(intent.getIntExtra("SOURCE",0));

    }
}
