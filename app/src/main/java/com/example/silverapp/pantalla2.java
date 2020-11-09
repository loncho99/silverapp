package com.example.silverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Button bt1 = (Button) findViewById(R.id.boton2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantalla2.this,pantalla3.class);
                startActivity(intent);

            }
        });

        Button bt2 = (Button) findViewById(R.id.boton3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantalla2.this,MapsActivity1.class);
                startActivity(intent);

            }
        });
    }
}