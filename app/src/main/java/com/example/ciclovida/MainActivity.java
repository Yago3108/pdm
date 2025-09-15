package com.example.ciclovida;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "CicloDeVida";
    TextView tv;
    StringBuilder statusBuilder = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

        cicloVida("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        cicloVida("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        cicloVida("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        cicloVida("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        cicloVida("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        cicloVida("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cicloVida("onDestroy");
    }

    private void cicloVida(String metodo) {
        Log.d(TAG, metodo);
        statusBuilder.append(metodo).append("\n");
        if (tv != null) {
            tv.setText(statusBuilder.toString());
        }
    }
}