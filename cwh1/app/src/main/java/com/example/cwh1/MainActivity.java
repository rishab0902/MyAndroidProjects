package com.example.cwh1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void sendNow(View view){
        Toast.makeText(this, "Sending message", Toast.LENGTH_SHORT).show();
    }public void recieve(View view){
        Toast.makeText(this, "Recieve message", Toast.LENGTH_SHORT).show();
    }public void delete(View view){
        Toast.makeText(this, "Deleting message", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}