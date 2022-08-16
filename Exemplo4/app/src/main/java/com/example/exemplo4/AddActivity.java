package com.example.exemplo4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class AddActivity extends AppCompatActivity {

    private TextInputEditText nome;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

       botao =  findViewById(R.id.add_button_salvar);
       nome = findViewById(R.id.add_input_nome);


       botao.setOnClickListener(view -> {
           String texto = Objects.requireNonNullElse(nome.getText(),"").toString();
           MainActivity.array.add(texto);
           finish();
       });

    }
}