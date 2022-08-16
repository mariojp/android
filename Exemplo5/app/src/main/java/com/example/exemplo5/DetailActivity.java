package com.example.exemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exemplo5.model.Item;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class DetailActivity extends AppCompatActivity {


    private Button botao;

    private TextInputEditText codigo;
    private TextInputEditText nome;
    private TextInputEditText descricao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nome = findViewById(R.id.detail_input_nome);
        codigo = findViewById(R.id.detail_input_codigo);
        descricao = findViewById(R.id.detail_input_descricao);

        botao = findViewById(R.id.detail_button_salvar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.setId(Integer.parseInt(codigo.getText().toString()));
                item.setNome(nome.getText().toString());
                item.setDescricao(descricao.getText().toString());
                MainActivity.list.add(item);
                finish();
            }
        });
    }
}