package com.example.exemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText texto;
    private FloatingActionButton botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.main_input_text);
        botao = findViewById(R.id.main_button_enviar);

        botao.setOnClickListener(view -> {
            String textoDigitado = Objects.requireNonNullElse(texto.getText(),"").toString();
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra("TEXTO", textoDigitado);
            startActivity(intent);
        });

    }

}