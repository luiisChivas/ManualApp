package com.example.ticlab4.ejercicio_002;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * Created by juan- on 22/01/2017.
 */

public class Languajes extends AppCompatActivity {

private ImageButton btnidioma, btnlanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ocultar barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_languages);

        btnidioma = (ImageButton)findViewById(R.id.imageMx);
        btnlanguage = (ImageButton)findViewById(R.id.imageUsa);

        btnidioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idioma = new Intent (Languajes.this,MainActivity.class);
                startActivity(idioma);
            }
        });

        btnlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent languaje = new Intent(Languajes.this,MainActivityInglish.class);
                startActivity(languaje);
            }
        });




    }
}