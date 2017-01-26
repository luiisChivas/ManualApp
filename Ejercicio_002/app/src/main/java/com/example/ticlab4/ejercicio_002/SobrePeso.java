package com.example.ticlab4.ejercicio_002;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

/**
 * Created by juan- on 24/01/2017.
 */

public class SobrePeso extends AppCompatActivity {

    ImageButton btnSobrePeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //aplicar orientacion de la imagen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //ocultar barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sobre_peso);
        btnSobrePeso =(ImageButton)findViewById(R.id.btnSobrePeso);

        btnSobrePeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sobrePeso = new Intent().setClass(SobrePeso.this, MainActivity.class);
                startActivity(sobrePeso);
            }
        });


    }
}
