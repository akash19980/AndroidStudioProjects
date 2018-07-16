package com.example.lenovo.gridviewapps;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.GridView;


public class MainActivity extends AppCompatActivity {
int logosarray[]={R.drawable.logo1,R.drawable.logo2,R.drawable.logo3,R.drawable.logo4,R.drawable.logo5,R.drawable.logo6};
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        gridView=(GridView)findViewById(R.id.grid);
CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),logosarray);

gridView.setAdapter(customAdapter);
}
}
