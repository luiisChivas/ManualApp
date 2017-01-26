package com.example.ticlab4.ejercicio_002;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by juan- on 22/01/2017.
 */

public class MainActivityInglish extends AppCompatActivity {
    EditText txtName, txtWeight, txtHeight;
    CheckBox chExercise;
    RadioButton rdMen, rdWoman;
    TextView txtResult;
    Button btnCalculate, btnClean, btnOtherLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inglish);

        //Se relacionan los daatos del xml
        txtName = (EditText)findViewById(R.id.txtName);
        txtWeight = (EditText)findViewById(R.id.txtWeight);
        txtHeight = (EditText)findViewById(R.id.txtHeight);
        chExercise = (CheckBox) findViewById(R.id.chExercise);
        rdMen = (RadioButton) findViewById(R.id.rdMen);
        rdWoman = (RadioButton) findViewById(R.id.rdWoman);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnCalculate= (Button) findViewById(R.id.btnCalculate);
        btnClean = (Button)findViewById(R.id.btnClean);
        btnOtherLanguage = (Button)findViewById(R.id.btnLanguage);


        //Asociar escucha evento para el evento onclick
        btnCalculate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                PersonaIngles p = new PersonaIngles();
                p.setName(txtName.getText().toString());
                p.setWeight(Double.parseDouble(txtWeight.getText().toString()));
                p.setHeight(Double.parseDouble(txtHeight.getText().toString()));
                if(chExercise.isChecked()){
                    p.setExercise((byte)1);
                }else {
                    p.setExercise((byte)0);
                }
                if(rdMen.isChecked()){
                    p.setSex('H');
                }else if(rdWoman.isChecked()) {
                    p.setSex('M');
                }else {
                    p.setSex('X');
                }
                p.carculateImc();
                if(p.getImc() < 20){
                    p.setStatus("Under weight");
                    Intent bajo = new Intent(MainActivityInglish.this, UnderWeight.class);
                    startActivity(bajo);
                }else if(p.getImc() >= 20 && p.getImc() <= 25){
                    p.setStatus("Half weight");
                    Intent normal = new Intent(MainActivityInglish.this, NormalWeight.class);
                    startActivity(normal);
                }else if(p.getImc() >= 25 ){
                    p.setStatus("Overweight");
                    Intent sobrePeso = new Intent(MainActivityInglish.this, Overweight.class);
                    startActivity(sobrePeso);
                }
                txtResult.setText(p.toString());

            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("");
                txtHeight.setText("");
                txtWeight.setText("");
                txtResult.setText("");
                rdMen.setChecked(false);
                rdWoman.setChecked(false);
                chExercise.setChecked(false);
            }
        });


        btnOtherLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent languaje = new Intent(MainActivityInglish.this, Languajes.class);
                startActivity(languaje);
            }
        });
    }
}