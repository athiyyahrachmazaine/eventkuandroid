package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginactvty extends AppCompatActivity {



    EditText username,password;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    //edtor buat masukin datanya


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactvty);

        pref =getSharedPreferences("mydata",MODE_PRIVATE);
        editor = pref.edit();

        if(pref.getBoolean("keeplogin",false))
        {
            Intent i=new Intent(loginactvty.this,MainActivity.class);
            startActivity(i);
            finish();

        }else
        {
            //do nothing

        }

        username = (EditText) findViewById(R.id.edUsername);
        password = (EditText) findViewById(R.id.edPassword);
        
    }

    public void login (View view)
    {
        if (username.getText().toString().equals("saya") && password.getText().toString().equals("12345")) {
            editor.putBoolean("keeplogin", true);
            editor.commit();
            Intent i = new Intent(loginactvty.this, MainActivity.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, "Mohon input yang benar", Toast.LENGTH_SHORT).show();

        }

    }
}
