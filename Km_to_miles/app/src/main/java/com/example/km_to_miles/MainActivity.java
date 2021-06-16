package com.example.km_to_miles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button kmtomiles=(Button)findViewById(R.id.buttonkmtomiles);
        kmtomiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kmbox=(EditText)findViewById(R.id.editKm);
                EditText milesbox=(EditText)findViewById(R.id.editMiles);
                Double vkm=Double.valueOf(kmbox.getText().toString());
                Double vmiles=vkm*0.62137;
                DecimalFormat formatval=new DecimalFormat("##.##");
                milesbox.setText(formatval.format(vmiles));






            }
        });
        Button milestokm=(Button)findViewById(R.id.buttonmilestokm);
        milestokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kmbox=(EditText)findViewById(R.id.editKm);
                EditText milesbox=(EditText)findViewById(R.id.editMiles);
                Double vmiles=Double.valueOf(milesbox.getText().toString());
                Double vkm=vmiles/0.62137;
                DecimalFormat formatval=new DecimalFormat("##.##");
                kmbox.setText(formatval.format(vkm));






            }
        });


    }
}