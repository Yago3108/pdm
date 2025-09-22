package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.edmin);
        Button b=findViewById(R.id.button);

        b.setOnClickListener(v -> {
            int n = Integer.parseInt( num.getText().toString());
            Intent intent=new Intent(this, SegundaTela.class);
            intent.putExtra("numero",n);
            startActivity(intent);
        });

    }


}