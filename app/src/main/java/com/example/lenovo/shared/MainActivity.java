package com.example.lenovo.shared;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    Button save ,clear,get ;
    TextView name,email;
    String getName ,getEmail;
    public static final String preference ="1";
    public static final String  Name ="2";
    public static final String Email ="3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView)findViewById(R.id.editText2);
        email = (TextView)findViewById(R.id.editText);
        sharedPreferences = getSharedPreferences(preference,Context.MODE_PRIVATE);

//-----------------------------------SaveButtonListener---------------------------------------------//
        save = (Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String n =name.getText().toString();
                String e =email.getText().toString();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(Name,n);
                edit.putString(Email,e);
                edit.commit();
                Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
            }
        });

//-------------------------------------GetButtonListener--------------------------------------------//
        get = (Button)findViewById(R.id.get);
        get.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sharedPreferences = getSharedPreferences(preference,Context.MODE_PRIVATE);
                if(sharedPreferences.contains(Name));
                {
                    getName = sharedPreferences.getString(Name,"");
                }
                if(sharedPreferences.contains(Email));
                {
                    getEmail = sharedPreferences.getString(Email,"");
                }


                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("NAME",getName);
                intent.putExtra("EMAIL",getEmail);
                startActivity(intent);

            }
        });
    }
}
