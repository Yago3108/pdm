package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SegundaTela extends AppCompatActivity {
    TextView tabuada;
    int n,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        int n=intent.getIntExtra("numero",num);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
        tabuada=findViewById(R.id.Tabuada);
        String tabu="";
        for(int i=1;i<=10;i++){
            tabu+=(i+"x"+n+"="+n*i+"           ").toString();
        }
        tabuada.setText(tabu);


    }


}