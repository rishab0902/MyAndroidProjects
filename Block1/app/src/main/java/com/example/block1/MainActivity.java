package com.example.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blue,pink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue=(Button)findViewById(R.id.button_invisible);
        pink=(Button)findViewById(R.id.button_pop);
    }

    public void toDo(View v) {
        if(v.equals(blue)){
            v.setVisibility(View.INVISIBLE);

        }
        if(v.equals(pink)){
            Toast.makeText(getApplicationContext(),"to do to do to do ",Toast.LENGTH_SHORT).show();

        }


    }
}