package com.example.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView rotulo;
    private EditText texto;
    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotulo = findViewById(R.id.main_text_view);
        texto = findViewById(R.id.main_text_input);
        botao = findViewById(R.id.main_button);
    }



    public void clickButton(View view){
        String valor = texto.getText().toString();
        rotulo.setText(valor);
    }
}